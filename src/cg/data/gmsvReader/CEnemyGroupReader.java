package cg.data.gmsvReader;

import java.io.File;
import java.util.Collection;
import java.util.List;

import cg.base.util.MathUtil;
import cg.data.resource.ObjectReader;
import cg.data.resource.ProjectData;
import cg.data.sprite.EnemyGroup;
import cg.data.sprite.EnemyGroup.SingleGroupInfo;

import com.google.common.collect.Lists;

public class CEnemyGroupReader implements ObjectReader<EnemyGroup> {

	@Override
	public List<EnemyGroup> read(ProjectData projectData) {
		String[] lines = projectData.getTextResource("group");
		List<EnemyGroup> list = Lists.newArrayListWithCapacity(lines.length);
		for (String line : lines) {
			list.add(new CEnemyGroup(line));
		}
		return list;
	}
	
	private static class CEnemyGroup implements EnemyGroup {
		
		private String name;
		
		private byte[] enemyLocals;
		
		private int id;
		
		private int needItemId;
		
		private int notNeedItemId;
		
		private SingleGroupInfo[] singleGroupInfos;
		
		public CEnemyGroup(String line) {
			line.split("\t");
			String[] infos = line.split("\t");
			name = infos[0];
			String[] locals = infos[1].split(",");
			enemyLocals = new byte[ENEMY_MAX_COUNT];
			for (int i = 0;i < ENEMY_MAX_COUNT;i++) {
				enemyLocals[i] = locals.length > i && locals[i].length() > 0 ? MathUtil.stringToByte(locals[i]) : LOCAL_RANDOM;
			}
			id = MathUtil.stringToInt(infos[2]);
			needItemId = MathUtil.stringToInt(infos[3]);
			notNeedItemId = MathUtil.stringToInt(infos[4]);
			for (int i = 0;i < ENEMY_MAX_COUNT;i++) {
				if (singleGroupInfos != null) {
					if (singleGroupInfos.length > i) {
						int enemyId = Integer.parseInt(infos[5 + i]);
						byte rate = MathUtil.stringToByte(infos[15 + i]);
						boolean isMustAppear = infos[25 + i].equals("1");
						singleGroupInfos[i] = new CSingleGroupInfo(enemyId, rate, isMustAppear);
					} else {
						break;
					}
				} else if (infos[5 + i].length() == 0 || infos[5 + i].equals("0")) {
					singleGroupInfos = new SingleGroupInfo[i];
					i = -1;
				} else if (i == ENEMY_MAX_COUNT - 1) {
					singleGroupInfos = new SingleGroupInfo[ENEMY_MAX_COUNT];
					i = -1;
				}
			}
		}

		@Override
		public String getName() {
			return name;
		}

		@Override
		public int getId() {
			return id;
		}

		@Override
		public int getNeedItemId() {
			return needItemId;
		}

		@Override
		public int getForbitItemId() {
			return notNeedItemId;
		}

		@Override
		public SingleGroupInfo[] getSingleGroupInfos() {
			return singleGroupInfos;
		}

		@Override
		public byte[] getEnemyLocals() {
			return enemyLocals;
		}
		
	}
	
	private static class CSingleGroupInfo implements SingleGroupInfo {
		
		private int enemyId;
		
		private byte rate;
		
		private boolean isMustAppear;
		
		public CSingleGroupInfo(int enemyId, byte rate, boolean isMustAppear) {
			this.enemyId = enemyId;
			this.rate = rate;
			this.isMustAppear = isMustAppear;
		}

		@Override
		public int getEnemyId() {
			return enemyId;
		}

		@Override
		public byte getRate() {
			return rate;
		}

		@Override
		public boolean getIsMustAppear() {
			return isMustAppear;
		}
		
	}

	@Override
	public void output(File outFile, Collection<EnemyGroup> collection)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

}
