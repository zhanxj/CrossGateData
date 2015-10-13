package cg.data.map;

import static cg.data.map.MapInfo.DATA_LENGTH;

import java.io.InputStream;
import java.util.List;

import cg.base.io.message.VoMapCell;
import cg.base.util.IOUtils;
import cg.base.util.MathUtil;
import cg.base.util.URLHandler;

public class AreaURLHandler implements URLHandler {
	
	private int west, east, north, south;
	
	private List<VoMapCell> mapCells;
	
	private MapInfo mapInfo;
	
	private String host;
	
	public AreaURLHandler(String host) {
		if (host == null || host.length() == 0) {
			throw new RuntimeException("host is null.");
		}
		this.host = host;
	}

	@Override
	public void handle(InputStream is, String info) throws Exception {
//		packet.writeInt((east - west + 1) * (north - south + 1)); // size
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
				voMapCell.setObjectId(objectId);
				voMapCell.setMark((int) mapInfo.getMark(e, s));
				
				mapCells.add(voMapCell);
			}
		}
		
		clear();
	}
	
	public void setContent(int west, int east, int north, int south, List<VoMapCell> mapCells, MapInfo mapInfo) {
		this.west = west;
		this.east = east;
		this.north = north;
		this.south = south;
		this.mapCells = mapCells;
		this.mapInfo = mapInfo;
	}
	
	public void clear() {
		setContent(0, 0, 0, 0, null, null);
	}
	
	public String makeUrlParams() {
		return "mapId=" + mapInfo.getMapId() + "&west=" + west + "&east=" + (east + 1) + "&north=" + north + "&south=" + (south + 1);
	}
	
	public void writeInfo() throws Exception {
		IOUtils.getStream(host + "/reader/MapResource?image=true&object=true&" + makeUrlParams(), this);
	}

}
