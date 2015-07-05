package cg.data.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cg.data.resource.ProjectData;

public class CWarpManager implements WarpManager {
	
	private Map<Integer, Map<Integer, Warp>> warps;
	
	public CWarpManager(ProjectData projectData) {
		warps = new HashMap<Integer, Map<Integer, Warp>>();
		loadWarp(projectData);
	}

	@Override
	public Map<Integer, Warp> getWarps(int mapId) {
		return warps.get(mapId);
	}
	
	private void loadWarp(ProjectData projectData) {
		List<Warp> list = projectData.read(Warp.class);
		for (int i = 0;i < list.size();i++) {
			addWarp(list.get(i));
		}
	}

	@Override
	public void addWarp(Warp warp) {
		if (!warps.containsKey(warp.getSourceMapId())) {
			Map<Integer, Warp> sameMapWarps = new HashMap<Integer, Warp>();
			sameMapWarps.put(warp.getId(), warp);
			warps.put(warp.getSourceMapId(), sameMapWarps);
		} else {
			warps.get(warp.getSourceMapId()).put(warp.getId(), warp);
		}
	}

}
