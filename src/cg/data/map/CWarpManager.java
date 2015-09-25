package cg.data.map;

import java.util.List;
import java.util.Map;

import cg.data.resource.ProjectData;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;

public class CWarpManager implements WarpManager {
	
	private Table<Integer, Integer, Warp> warps;
	
	public CWarpManager(ProjectData projectData) {
		warps = HashBasedTable.create();
		loadWarp(projectData);
	}

	@Override
	public Map<Integer, Warp> getWarps(int mapId) {
		return warps.row(mapId);
	}
	
	private void loadWarp(ProjectData projectData) {
		List<Warp> list = projectData.read(Warp.class);
		for (int i = 0;i < list.size();i++) {
			addWarp(list.get(i));
		}
	}

	@Override
	public void addWarp(Warp warp) {
		warps.put(warp.getSourceMapId(), warp.getId(), warp);
	}

}
