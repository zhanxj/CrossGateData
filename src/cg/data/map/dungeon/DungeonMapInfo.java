package cg.data.map.dungeon;

import static cg.base.map.MapCell.MARK_NOMARL;
import static cg.base.map.MapCell.MARK_NULL;
import static cg.base.map.MapCell.MARK_OBSTACLE;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import cg.base.image.ImageDictionary;
import cg.base.image.ImageReader;
import cg.base.map.MapCell;
import cg.base.util.MathUtil;
import cg.data.map.MapInfo;
import cg.data.map.Warp;
import cg.data.map.WarpManager;
import cg.data.sprite.NpcInfo;

public class DungeonMapInfo implements MapInfo {
	
	private static final Logger log = LoggerFactory.getLogger(DungeonMapInfo.class);
	
	private static final byte[] XY = new byte[]{
		-1, -1, 
		0, -2, 
		1, -1, 
		-2, 0, 
		2, 0, 
		-1, 1, 
		0, 2, 
		1, 1
	};
	
	private int mapId, maxEast, maxSouth, goWarpId, backWarpId;
	
	private String name;
	
	private byte[] cellImageGlobalIds, objectImageGlobalIds, marks;
	
	private short enemyLevel;
	
	private FileInputStream fis;
	
	private final ImageReader imageReader;
	
	private final WarpManager warpManager;
	
	public DungeonMapInfo(ImageReader imageReader, WarpManager warpManager) {
		this.imageReader = imageReader;
		this.warpManager = warpManager;
	}

	@Override
	public int getMapId() {
		return mapId;
	}
	
	public void setMapId(int mapId) {
		this.mapId = mapId;
	}

	@Override
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int getMaxEast() {
		return maxEast;
	}

	@Override
	public int getMaxSouth() {
		return maxSouth;
	}

	@Override
	public int getImageGlobalId(int east, int south) {
		return MathUtil.bytesToInt2(readBytes(calcShortIndex(east, south), DATA_LENGTH), 0, DATA_LENGTH);
	}
	
	private synchronized byte[] readBytes(int position, int size) {
		try {
			fis.getChannel().position(position);
		} catch (IOException e) {
			log.error("", e);
			return null;
		}
		byte[] datas = new byte[size];
		try {
			fis.read(datas);
			return datas;
		} catch (IOException e) {
			log.error("", e);
			return null;
		}
	}
	
	private int getImageGlobalId(int index) {
		return MathUtil.bytesToInt2(cellImageGlobalIds, index, DATA_LENGTH);
	}

	@Override
	public int getObjectId(int east, int south) {
		return MathUtil.bytesToInt2(readBytes(getMaxEast() * getMaxSouth() * DATA_LENGTH + calcShortIndex(east, south), DATA_LENGTH), 0, DATA_LENGTH);
	}
	
	private int getObjectId(int index) {
		return MathUtil.bytesToInt2(objectImageGlobalIds, index, DATA_LENGTH);
	}

	@Override
	public byte getMark(int east, int south) {
		return marks[calcIndex(east, south)];
	}

	@Override
	public int getWarpId(int east, int south) {
		int index = calcIndex(east, south);
		return goWarpId == index ? goWarpId : backWarpId == index ? backWarpId : NO_WARP_ID;
	}

	@Override
	public void addWarp(Warp warp) {
		int key = calcIndex(warp.getSourceMapEast(), warp.getSourceMapSouth());
		marks[key] = MapCell.MARK_WARP;
		warpManager.addWarp(warp);
	}
	
	public void setGoWarp(Warp warp, List<NpcInfo> npcInfoList) {
		goWarpId = warp.getId();
		addWarp(warp);
		setWarpResource(warp, npcInfoList);
	}
	
	public void setBackWarp(Warp warp, List<NpcInfo> npcInfoList) {
		backWarpId = warp.getId();
		addWarp(warp);
		setWarpResource(warp, npcInfoList);
	}
	
	private void setWarpResource(Warp warp, List<NpcInfo> npcInfoList) {
		if (warp.getResourceGlobalId() >= 1 << 16) { // if global id more than 65535, create a NPC
			NpcInfo npcInfo = new NpcInfo(NpcInfo.SPECIAL_NPC_ID_WARP);
			npcInfo.setCoordinates(new int[]{warp.getSourceMapEast(), warp.getSourceMapSouth(), getMapId()});
			npcInfo.setResourcesId(warp.getResourceGlobalId());
			npcInfoList.add(npcInfo);
		} else { // map image global id must less than 65536
			int key = calcIndex(warp.getSourceMapEast(), warp.getSourceMapSouth());
			MathUtil.intToByte(objectImageGlobalIds, key, DATA_LENGTH, warp.getResourceGlobalId());
		}
	}
	
	private void output(Map<Integer, Map<Integer, DungeonMapRegion>> mapRegions) throws Exception {
		File file = new File(getClass().getResource("/../../maze/" + System.currentTimeMillis() + ".txt").toURI());
		BufferedWriter bw = new BufferedWriter(new FileWriter(file));
		for (Map<Integer, DungeonMapRegion> col : mapRegions.values()) {
			for (DungeonMapRegion mapRegion : col.values()) {
				mapRegion.output(bw);
			}
		}
		output(bw);
		bw.flush();
		bw.close();
	}
	
	public void output(BufferedWriter bw) throws Exception {
		for (int east = 0;east < maxEast;east++) {
			for (int south = 0;south < maxSouth;south++) {
//				int imageGlobalId = getImageGlobalId(east, south);
				int obstacleGloalIdId = getObjectId(calcShortIndex(east, south));
				byte mark = getMark(east, south);
//				bw.write(obstacleGloalIdId == 0 ? imageGlobalId == 0 ? "■" : "○" : "▲");
				bw.write(mark == MARK_OBSTACLE ? obstacleGloalIdId == 0 ? "■" : "?" : mark == MARK_NOMARL ? obstacleGloalIdId == 0 ? "○" : "*" : "▲");
			}
			bw.write("\r\n");
		}
	}
	
	public void release(File maze) {
		try {
			File file = new File(maze, "" + System.currentTimeMillis());
			file.createNewFile();
			FileOutputStream fos = new FileOutputStream(file);
			fos.write(cellImageGlobalIds);
			fos.write(objectImageGlobalIds);
			fos.flush();
			fos.close();
			
			cellImageGlobalIds = null;
			objectImageGlobalIds = null;
			
			fis = new FileInputStream(file);
		} catch (Exception e) {
			log.error("", e);
		}
	}
	
	public Map<Integer, int[]> create(int rate, GMSV_Dungeon dungeon, boolean output, short enemyLevel) {
		this.enemyLevel = enemyLevel;
		Map<Integer, Map<Integer, DungeonMapRegion>> mapRegions = new TreeMap<Integer, Map<Integer, DungeonMapRegion>>();
		DungeonMapRegion mapRegion = createRoom(rate, dungeon, mapRegions, 0, 0, null);
		mapRegion.createSubRoom(mapRegions, dungeon);
		Map<Integer, int[]> canUseCells = tileRoom(mapRegions, dungeon);
		if (output) {
			try {
				output(mapRegions);
			} catch (Exception e) {
				log.error("", e);
			}
		}
		mapRegions.clear();
		return canUseCells;
	}
	
	public static DungeonMapRegion createRoom(int rate, DungeonMapRegionInfo dungeon, Map<Integer, Map<Integer, DungeonMapRegion>> mapRegions, int x, int y, Door parentDoor) {
		DungeonMapRegion mapRegion = new DungeonMapRegion(dungeon);
		mapRegion.setLocal(x, y);
		mapRegion.openDoor(rate, parentDoor);
		mapRegion.link(mapRegions);
		mapRegion.fit(mapRegions);
		
		Map<Integer, DungeonMapRegion> col;
		if (mapRegions.containsKey(x)) {
			col = mapRegions.get(x);
		} else {
			col = new TreeMap<Integer, DungeonMapRegion>();
			mapRegions.put(x, col);
		}
		col.put(y, mapRegion);
		
		return mapRegion;
	}
	
	private Map<Integer, int[]> tileRoom(Map<Integer, Map<Integer, DungeonMapRegion>> mapRegions, GMSV_Dungeon dungeon) {
		Set<Integer> keys = mapRegions.keySet();
		// calculate the left column number(minCol), the right column number(maxCol), the top row number(minRow) and the bottom row number(maxRow)
		int index = 0, minCol = 0, maxCol = 0, minRow = 0, maxRow = 0;
		for (Integer key : keys) {
			if (index == 0) { // compare the left row number
				minCol = key;
			}
			if (index == keys.size() - 1) { // compare the right row number
				maxCol = key;
			}
			
			int rowIndex = 0;
			Set<Integer> rows = mapRegions.get(key).keySet();
			for (Integer row : rows) {
				if (rowIndex == 0 && minRow > row) { // compare the top row number
					minRow = row;
				}
				if (rowIndex == rows.size() - 1 && maxRow < row) { // compare the bottom row number
					maxRow = row;
				}
				rowIndex++;
			}
			
			index++;
		}
		
		int col = maxCol - minCol + 1; // calculate amount of column
		int row = maxRow - minRow + 1; // calculate amount of row
		maxSouth = col * dungeon.getSizeRange()[DungeonMapRegionInfo.ROOM_SIZE_SOUTH_MAX_INDEX]; // calculate the max south
		maxEast = row * dungeon.getSizeRange()[DungeonMapRegionInfo.ROOM_SIZE_EAST_MAX_INDEX]; // calculate the max east
		int size = maxEast * maxSouth * DATA_LENGTH; // calculate size of data array
		cellImageGlobalIds = new byte[size];
		objectImageGlobalIds = new byte[size];
		marks = new byte[size / DATA_LENGTH];
		
		Map<Integer, int[]> canUseCells = Maps.newHashMap();
		for (Integer key : keys) {
			for (DungeonMapRegion mapRegion : mapRegions.get(key).values()) {
				mapRegion.fill();
				for (int regionEast = 0;regionEast < dungeon.getSizeRange()[DungeonMapRegionInfo.ROOM_SIZE_EAST_MAX_INDEX];regionEast++) {
					int mapEast = regionEast + (mapRegion.getY() - minRow) * dungeon.getSizeRange()[DungeonMapRegionInfo.ROOM_SIZE_EAST_MAX_INDEX]; // calculate east of map
					for (int regionSouth = 0;regionSouth < dungeon.getSizeRange()[DungeonMapRegionInfo.ROOM_SIZE_SOUTH_MAX_INDEX];regionSouth++) {
						int mapSouth = regionSouth + (mapRegion.getX() - minCol) * dungeon.getSizeRange()[DungeonMapRegionInfo.ROOM_SIZE_SOUTH_MAX_INDEX]; // calculate south of map
						for (int i = 0;i < DATA_LENGTH;i++) { // copy data from region to map
							cellImageGlobalIds[calcShortIndex(mapEast, mapSouth) + i] = mapRegion.cellImageGlobalIds[mapRegion.calcShortIndex(regionEast, regionSouth) + i];
							objectImageGlobalIds[calcShortIndex(mapEast, mapSouth) + i] = mapRegion.objectImageGlobalIds[mapRegion.calcShortIndex(regionEast, regionSouth) + i];
						}
						byte mark = getMark(dungeon, mapEast, mapSouth);
						marks[calcIndex(mapEast, mapSouth)] = mark; // mark
						if (mark == MARK_NOMARL) { // this is a can use cell
							canUseCells.put(calcIndex(mapEast, mapSouth), new int[]{mapEast, mapSouth, getMapId()});
						}
					}
				}
			}
		}
		
		return canUseCells;
	}
	
	private byte getMark(GMSV_Dungeon dungeon, int mapEast, int mapSouth) {
		byte mark = dungeon.getMark(getObjectId(calcShortIndex(mapEast, mapSouth)));
		return mark == MARK_NULL ? getImageGlobalId(calcShortIndex(mapEast, mapSouth)) > 0 ? MARK_NOMARL : MARK_OBSTACLE : mark;
	}
	
	private int calcIndex(int east, int south) {
		return south * getMaxEast() + east;
	}
	
	private int calcShortIndex(int east, int south) {
		return calcIndex(east, south) * DATA_LENGTH;
	}

	@Override
	public short getEnemyLevel() {
		return enemyLevel;
	}
	
	public void createObject(Map<Integer, int[]> canUseCells, DungeonObstacle[] obstacles, GMSV_Dungeon dungeon) {
		for (DungeonObstacle obstacle : obstacles) { // for each all obstacle
			int rangeEast = obstacle.getRates()[DungeonMapRegionInfo.OBSTACLE_EAST_INDEX], rangeSouth = obstacle.getRates()[DungeonMapRegionInfo.OBSTACLE_SOUTH_INDEX];
			if (rangeSouth == 0 || rangeEast == 0) {
				continue;
			}
			int maxRow = MathUtil.divAddOne(maxSouth, rangeSouth), maxCol = MathUtil.divAddOne(maxEast, rangeEast);
			for (int col = 0;col < maxCol;col++) {
				for (int row = 0;row < maxRow;row++) {
					Map<Integer, Integer> cellMap = Maps.newHashMap();
					int startEast = col * rangeEast, startSouth = row * rangeSouth; // calculate 
					for (int east = 0;east < rangeEast;east++) {
						for (int south = 0;south < rangeSouth;south++) {
							int key = calcIndex(startEast + east, startSouth + south);
							if (canUseCells.containsKey(key)) { // cache the cell which can use and in the obstacle range
								cellMap.put(key, key);
							}
						}
					}
					
					byte obstacleCount = obstacle.getRates()[DungeonMapRegionInfo.OBSTACLE_COUNT_INDEX];
					if (cellMap.size() > obstacleCount) { // the count of can use cell must more than obstacle's amount
						for (int i = 0;i < obstacleCount;i++) {
							int[] local = canUseCells.remove(cellMap.remove(Lists.newArrayList(cellMap.keySet()).get(MathUtil.getRandom(cellMap.size()))));
							MathUtil.intToByte(objectImageGlobalIds, calcShortIndex(local[0], local[1]), DATA_LENGTH, obstacle.getImageGlobalId());
							byte mark = dungeon.getMark(obstacle.getImageGlobalId());
							marks[calcIndex(local[0], local[1])] = mark; // mark
							if (mark == MARK_OBSTACLE) { // when the obstacle do not support move, we need remove a cell which will close path
								for (byte dir = 0;dir < XY.length >> 1;dir++) {
									int key = calcIndex(local[0] + XY[dir << 1], local[1] + XY[(dir << 1) + 1]);
									if (cellMap.containsKey(key)) {
										canUseCells.remove(cellMap.remove(key));
									} else if (canUseCells.containsKey(key)) {
										canUseCells.remove(key);
									}
								}
							}
							
							if (cellMap.size() <= obstacleCount) {
								break;
							}
						}
					}
				}
			}
		}
	}

	@Override
	public void setObject(int east, int south, int resourceId) {
		ImageDictionary imageDictionary = imageReader.getImageDictionary(resourceId);
		if (imageDictionary != null) {
			MathUtil.intToByte(objectImageGlobalIds, calcShortIndex(east, south), DATA_LENGTH, resourceId);
			marks[calcIndex(east, south)] = imageDictionary.getMark();
		}
	}
	
	public void destroy() throws Exception {
		fis.close();
	}

}
