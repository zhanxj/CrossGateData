package cg.data.gmsvReader;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import cg.base.util.MathUtil;
import cg.data.job.Job;
import cg.data.resource.ObjectReader;
import cg.data.resource.ProjectData;

public class CJobReader implements ObjectReader<Job> {

	@Override
	public List<Job> read(ProjectData projectData) {
		String[] lines = projectData.getTextResource("jobs");
		List<Job> jobs = new ArrayList<Job>(lines.length);
		for (String line : lines) {
			jobs.add(new CJob(line.split("\t", -2)));
		}
		return jobs;
	}
	
	private static class CJob implements Job {
		
		private String name;
		
		private short id;
		
		private byte type;
		
		private int cost, fame;
		
		private byte[] euipmentLevels;
		
		private final Map<Short, Byte> promotionSkills;
		
		public CJob(String[] infos) {
			name = infos[0];
			id = MathUtil.stringToShort(infos[2]);
			type = MathUtil.stringToByte(infos[3]);
			cost = MathUtil.stringToInt(infos[4]);
			fame = MathUtil.stringToInt(infos[4]);
			promotionSkills = new HashMap<Short, Byte>();
			for (int i = 0;i < 5;i++) {
				short skillId = MathUtil.stringToShort(infos[i + 6]);
				if (skillId > 0) {
					promotionSkills.put(skillId, MathUtil.stringToByte(infos[i + 34]));
				}
			}
			euipmentLevels = new byte[15];
			for (int i = 0;i < euipmentLevels.length;i++) {
				euipmentLevels[i] = MathUtil.stringToByte(infos[i + 11]);
			}
		}

		@Override
		public String getName() {
			return name;
		}

		@Override
		public short getId() {
			return id;
		}

		@Override
		public byte getEuipmentLevel(byte type) {
			return euipmentLevels[type];
		}

		@Override
		public Set<Short> getPromotionSkillIds() {
			return promotionSkills.keySet();
		}

		@Override
		public byte getType() {
			return type;
		}

		@Override
		public int getCost() {
			return cost;
		}

		@Override
		public int getFame() {
			return fame;
		}

		@Override
		public byte getPromotionSkillLevel(short skillId) {
			return promotionSkills.get(skillId);
		}
		
	}

	@Override
	public void output(File outFile, Collection<Job> collection)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

}
