package cg.data.map;

import static cg.data.map.MapInfo.DATA_LENGTH;

import java.io.InputStream;
import java.util.List;

import cg.base.io.message.VoMapCell;
import cg.base.util.IOUtils;
import cg.base.util.MathUtil;
import cg.base.util.URLHandler;

public class AreaNetHandler implements AreaLoader {
	
	private final String host;
	
	public AreaNetHandler(String host) {
		if (host == null || host.length() == 0) {
			throw new RuntimeException("host is null.");
		}
		this.host = host;
	}

	@Override
	public void writeInfo(int west, int east, int north, int south, List<VoMapCell> mapCells, MapInfo mapInfo) throws Exception {
		IOUtils.getStream(host + "/reader/MapResource?image=true&object=true&" + makeUrlParams(west, east, north, south, mapInfo), new AreaURLHandler(west, east, north, south, mapCells, mapInfo));
	}
	
	private String makeUrlParams(int west, int east, int north, int south, MapInfo mapInfo) {
		return "mapId=" + mapInfo.getMapId() + "&west=" + west + "&east=" + (east + 1) + "&north=" + north + "&south=" + (south + 1);
	}
	
	private static final class AreaURLHandler implements URLHandler {
		
		private int west, east, north, south;
		
		private List<VoMapCell> mapCells;
		
		private MapInfo mapInfo;
		
		public AreaURLHandler(int west, int east, int north, int south, List<VoMapCell> mapCells, MapInfo mapInfo) {
			this.west = west;
			this.east = east;
			this.north = north;
			this.south = south;
			this.mapCells = mapCells;
			this.mapInfo = mapInfo;
		}

		@Override
		public void handle(InputStream is, String info) throws Exception {
//			packet.writeInt((east - west + 1) * (north - south + 1)); // size
			for (int e = west;e <= east;e++) {
				for (int s = north;s <= south;s++) {
					byte[] datas = new byte[DATA_LENGTH << 1];
					is.read(datas);
					int imageGlobalId = MathUtil.bytesToInt2(datas, 0, DATA_LENGTH);
					int objectId = MathUtil.bytesToInt2(datas, DATA_LENGTH, DATA_LENGTH);
					
					VoMapCell voMapCell = new VoMapCell();
					voMapCell.setEast(e);
					voMapCell.setSouth(s);
					voMapCell.setImageGlobalId(imageGlobalId);
					voMapCell.setMapObjectId(objectId);
					voMapCell.setCellMark((int) mapInfo.getMark(e, s));
					
					mapCells.add(voMapCell);
				}
			}
		}
		
	}

}
