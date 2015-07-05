package cg.data.gmsvReader;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import cg.base.util.MathUtil;
import cg.data.ai.EnemyAiInfo;
import cg.data.ai.EnemyAiInfo.AiInfo;
import cg.data.resource.ObjectReader;
import cg.data.resource.ProjectData;

public class CEnemyAiReader implements ObjectReader<EnemyAiInfo> {

	@Override
	public List<EnemyAiInfo> read(ProjectData projectData) {
		String[] lines = projectData.getTextResource("enemyai");
		List<EnemyAiInfo> list = new ArrayList<EnemyAiInfo>(lines.length);
		for (String line : lines) {
			list.add(new CEnemyAiInfo(line));
		}
		return list;
	}
	
	private static class CAiInfo implements AiInfo {
		
		private byte condition;
		
		private byte targetType;
		
		private int skillCode;
		
		private byte hitRate;
		
		public CAiInfo(String[] infos, int offset) {
			condition = MathUtil.stringToByte(infos[offset + 1]);
			targetType = MathUtil.stringToByte(infos[offset + 11]);
			skillCode = MathUtil.stringToInt(infos[offset + 21]);
			hitRate = MathUtil.stringToByte(infos[offset + 31]);
		}

		@Override
		public byte getCondition() {
			return condition;
		}

		@Override
		public byte getTargetType() {
			return targetType;
		}

		@Override
		public int getSkillCode() {
			return skillCode;
		}

		@Override
		public byte getRate() {
			return hitRate;
		}
		
	}
	
	private static class CEnemyAiInfo implements EnemyAiInfo {
		
		private static final byte SKILL_COUNT = 10;
		
		private int id;
		
		private AiInfo[] aiInfos;
		
		public CEnemyAiInfo(String line) {
			String[] infos = line.split("\t");
			id = MathUtil.stringToInt(infos[0]);
			aiInfos = new AiInfo[SKILL_COUNT];
			for (int i = 0;i < SKILL_COUNT;i++) {
				aiInfos[i] = infos[1 + i].length() == 0 ? null : new CAiInfo(infos, i);
			}
		}

		@Override
		public int getId() {
			return id;
		}

		@Override
		public AiInfo[] getAiInfos() {
			return aiInfos;
		}
		
	}

	@Override
	public void output(File outFile, Collection<EnemyAiInfo> collection) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
