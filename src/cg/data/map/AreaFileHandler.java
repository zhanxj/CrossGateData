package cg.data.map;

import java.util.List;

import cg.base.io.message.VoMapCell;

public class AreaFileHandler implements AreaLoader {

	@Override
	public void writeInfo(int west, int east, int north, int south, List<VoMapCell> mapCells, MapInfo mapInfo) {
		for (int e = west;e <= east;e++) {
			for (int s = north;s <= south;s++) {
				VoMapCell voMapCell = new VoMapCell();
				voMapCell.setEast(e);
				voMapCell.setSouth(s);
				voMapCell.setImageGlobalId(mapInfo.getImageGlobalId(e, s));
				voMapCell.setMapObjectId(mapInfo.getObjectId(e, s));
				voMapCell.setCellMark((int) mapInfo.getMark(e, s));
				
				mapCells.add(voMapCell);
			}
		}
	}

}
