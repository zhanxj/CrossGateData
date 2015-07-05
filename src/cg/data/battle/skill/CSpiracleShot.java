package cg.data.battle.skill;

import java.util.List;

import cg.data.resource.ProjectData;
import cg.data.resource.ProjectDataListener;

class CSpiracleShot implements Shot, ProjectDataListener {
	
	private int[][] trajectories;

	@Override
	public void reload(ProjectData projectData) throws Exception {
		String[] list = projectData.getTextResource("trajectory");
		int size = list.length;
		trajectories = new int[size << 1][];
		for (int i = 0;i < size;i++) {
			String[] infos = list[i].split("=")[1].split(",");
			int symmetry = size + i, mod = infos.length;
			trajectories[i] = new int[mod];
			trajectories[symmetry] = new int[mod];
			for (int j = 0;j < mod;j++) {
				trajectories[i][j] = Integer.parseInt(infos[j]);
				trajectories[symmetry][j] = (trajectories[i][j] + (mod >> 1)) % mod;
			}
		}
	}

	@Override
	public int[] getTargetQueue(int index, int count, List<Integer> list) {
		int size = 0, local = 0;
		for (int i = 0;i < list.size();i++) {
			if (list.get(i) == TRUE) {
				size++;
			}
		}
		count = count > size ? size : count;
		int[] ret = new int[count];
		for (int i = 0;i < count;i++) {
			while (list.get(trajectories[index][local]) == FALSE) {
				local++;
			}
			ret[i] = trajectories[index][local];
			local++;
		}
		return ret;
	}

}
