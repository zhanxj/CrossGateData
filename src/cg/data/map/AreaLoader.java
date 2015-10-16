package cg.data.map;

import java.util.List;

import cg.base.io.message.VoMapCell;

public interface AreaLoader {
	
	void writeInfo(int west, int east, int north, int south, List<VoMapCell> mapCells, MapInfo mapInfo) throws Exception;

}
