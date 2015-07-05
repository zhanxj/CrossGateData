package cg.data.map;

import java.util.Map;

public interface WarpManager {
	
	Map<Integer, Warp> getWarps(int mapId);
	
	void addWarp(Warp warp);

}
