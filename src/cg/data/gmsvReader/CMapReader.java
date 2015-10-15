package cg.data.gmsvReader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Map;

import cg.base.image.ImageDictionary;
import cg.base.image.ImageReader;
import cg.base.map.MapCell;
import cg.base.util.MathUtil;
import cg.data.CrossGateData;
import cg.data.map.MapInfo;
import cg.data.map.MapMemo;
import cg.data.map.MapReader;
import cg.data.map.Warp;
import cg.data.map.WarpManager;

import com.google.common.collect.Maps;

@Deprecated
public class CMapReader implements MapReader {
	
	private final Map<Integer, MapMemo> mapMemos;
	
	private final WarpManager warpManager;
	
	private final ImageReader imageReader;
	
	@Deprecated
	public CMapReader(WarpManager warpManager, ImageReader imageReader) {
		this.warpManager = warpManager;
		this.imageReader = imageReader;
		mapMemos = Maps.newHashMap();
		try {
			init();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void init() throws IOException {
		File file = new File(CrossGateData.getProjectData().getServerPath());
		file = new File(file, "server/map");
		File[] mapFiles = file.listFiles();
		for (File mapFile : mapFiles) {
			MapMemo mapMemo = new CMapMemo(mapFile);
			mapMemos.put(mapMemo.getMapId(), mapMemo);
		}
	}

	public MapInfo read(int mapId) throws Exception {
		return new CMapInfo(mapMemos.get(mapId), warpManager.getWarps(mapId));
	}
	
	public Collection<MapMemo> getMapMemos() {
		return mapMemos.values();
	}
	
	@Override
	public MapInfo[] load() {
		MapInfo[] mapInfos = new MapInfo[mapMemos.size()];
		int index = 0;
		for (MapMemo mapMemo : getMapMemos()) {
			try {
				mapInfos[index++] = read(mapMemo.getMapId());
			} catch (Exception e) {
				CrossGateData.getLog().error("", e);
			}
		}
		return mapInfos;
	}
	
	private class CMapInfo implements MapInfo {
		
		private int mapId, maxEast, maxSouth;
		
		private String name;
		
		private byte[] cellImageGlobalIds, objectImageGlobalIds, marks;
		
		private Map<Integer, Integer> warpIds;
		
		public CMapInfo(MapMemo mapMemo, Map<Integer, Warp> warps) throws IOException {
			name = mapMemo.getName();
			mapId = mapMemo.getMapId();
			warpIds = Maps.newHashMap();
			File file = new File(CrossGateData.getProjectData().getServerPath());
			file = new File(file, "server/map/" + mapMemo.getFileName());
			FileInputStream fis = new FileInputStream(file);
			byte[] datas = new byte[24];
			fis.read(datas);
			read(fis);
			fis.close();
			analysis(warps);
		}
		
		private void read(FileInputStream fis) throws IOException {
			byte[] datas = new byte[20];
			fis.read(datas);
			maxEast = MathUtil.bytesToShort2(datas, 16);
			maxSouth = MathUtil.bytesToShort2(datas, 18);
			int size = maxEast * maxSouth * DATA_LENGTH;
			cellImageGlobalIds = new byte[size];
			objectImageGlobalIds = new byte[size];
			marks = new byte[size / DATA_LENGTH];
			for (int i = 0;i < marks.length;i++) {
				marks[i] = MapCell.MARK_NOMARL;
			}
			fis.read(cellImageGlobalIds);
			fis.read(objectImageGlobalIds);

			for (int east = 0;east < maxEast;east++) {
				for (int south = 0;south < maxSouth;south++) {
					ImageDictionary imageDictionary = imageReader.getImageDictionary(getObjectId(east, south));
					if (imageDictionary != null) {
						setMark(imageDictionary, east, south, marks);
					}
				}
			}
		}
		
		private void analysis(Map<Integer, Warp> warps) {
			if (warps != null) {
				Collection<Warp> values = warps.values();
				for (Warp warp : values) {
					int index = calcIndex(warp.getSourceMapEast(), warp.getSourceMapSouth());
					marks[index] = MapCell.MARK_WARP;
					warpIds.put(index, warp.getId());
				}
			}
		}
		
		private void setMark(ImageDictionary imageDictionary, int startEast, int startSouth, byte[] marks) {
			for (int east = 0, useEast = imageDictionary.getUseEast();east < useEast;east++) {
				for (int south = 0, useSouth = imageDictionary.getUseSouth();south < useSouth;south++) {
					if (startEast >= east && startSouth >= south && startEast + east < getMaxEast()) {
						marks[calcIndex(startEast + east, startSouth - south)] = imageDictionary.getMark();
					}
				}
			}
		}

		@Override
		public String getName() {
			return name;
		}

		@Override
		public int getMapId() {
			return mapId;
		}

		@Override
		public int getMaxEast() {
			return maxEast;
		}

		@Override
		public int getMaxSouth() {
			return maxSouth;
		}
		
		private int calcIndex(int east, int south) {
			return south * getMaxEast() + east;
		}
		
		private int calcShortIndex(int east, int south) {
			return calcIndex(east, south) << 1;
		}

		@Override
		public int getImageGlobalId(int east, int south) {
			return MathUtil.bytesToInt2(cellImageGlobalIds, calcShortIndex(east, south), DATA_LENGTH);
		}

		@Override
		public int getObjectId(int east, int south) {
			return MathUtil.bytesToInt2(objectImageGlobalIds, calcShortIndex(east, south), DATA_LENGTH);
		}

		@Override
		public byte getMark(int east, int south) {
			return marks[calcIndex(east, south)];
		}

		@Override
		public int getWarpId(int east, int south) {
			int key = calcIndex(east, south);
			return warpIds.containsKey(key) ? warpIds.get(calcIndex(east, south)) : NO_WARP_ID;
		}

		@Override
		public void addWarp(Warp warp) {
			int key = calcIndex(warp.getSourceMapEast(), warp.getSourceMapSouth());
			warpIds.put(key, warp.getId());
			marks[key] = MapCell.MARK_WARP;
			warpManager.addWarp(warp);
		}

		@Override
		public short getEnemyLevel() {
			return NO_ENEMY_LEVEL;
		}

		@Override
		public void setObject(int east, int south, int resourceId) {
			ImageDictionary imageDictionary = imageReader.getImageDictionary(getObjectId(east, south));
			if (imageDictionary != null) {
				MathUtil.intToByte(objectImageGlobalIds, calcShortIndex(east, south), DATA_LENGTH, resourceId);
				setMark(imageDictionary, east, south, marks);
			}
		}
		
	}
	
	private static class CMapMemo implements MapMemo {
		
		private int mapId, unknowId;
		
		private String name, fileName;
		
		public CMapMemo(File mapFile) throws IOException {
			fileName = mapFile.getName();
			String[] infos = fileName.split("_");
			try {
				mapId = Integer.parseInt(infos[0]);
			} catch (Exception e) {
				mapId = Integer.parseInt(infos[1]);
			}
			FileInputStream fis = new FileInputStream(mapFile);
			byte[] datas = new byte[44];
			fis.read(datas);
			int index = 24;
			for (int i = 8;i < datas.length;i++) {
				if (datas[i] == 0) {
					index = i;
					break;
				}
			}
			byte[] bytes = new byte[index - 8];
			for (int i = 8;i < index;i++) {
				bytes[i - 8] = datas[i];
			}
			unknowId = MathUtil.bytesToInt(datas, 6, 2);
			name = new String(bytes, "GBK");
			fis.close();
		}

		@Override
		public int getMapId() {
			return mapId;
		}

		@Override
		public int getUnknowId() {
			return unknowId;
		}

		@Override
		public String getName() {
			return name;
		}

		@Override
		public String getFileName() {
			return fileName;
		}
		
	}

	@Override
	public String getName() {
		return getClass().getName();
	}

	@Override
	public WarpManager getWarpManager() {
		return warpManager;
	}

}
