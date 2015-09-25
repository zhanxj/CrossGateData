package cg.data.map;

import java.util.List;
import java.util.Map;

import cg.data.resource.ProjectData;

import com.google.common.collect.Maps;

public class CWarpManager implements WarpManager {
	
	private Map<Integer, Map<Integer, Warp>> warps;
	
	public CWarpManager(ProjectData projectData) {
		warps = Maps.newHashMap();
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
			Map<Integer, Warp> sameMapWarps = Maps.newHashMap();
			sameMapWarps.put(warp.getId(), warp);
			warps.put(warp.getSourceMapId(), sameMapWarps);
		} else {
			warps.get(warp.getSourceMapId()).put(warp.getId(), warp);
		}
	}

}
