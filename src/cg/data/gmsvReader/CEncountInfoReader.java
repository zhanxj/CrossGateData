package cg.data.gmsvReader;

import java.io.File;
import java.util.Collection;
import java.util.List;

import cg.base.util.MathUtil;
import cg.data.limitValue.LimitValueFactory;
import cg.data.limitValue.LimitValueOfByte;
import cg.data.map.MapArea;
import cg.data.map.ReaderMapArea;
import cg.data.resource.ObjectReader;
import cg.data.resource.ProjectData;
import cg.data.sprite.EncountInfo;
import cg.data.sprite.EncountInfo.GroupInfo;

import com.google.common.collect.Lists;

public class CEncountInfoReader implements ObjectReader<EncountInfo> {

	@Override
	public List<EncountInfo> read(ProjectData projectData) {
		String[] lines = projectData.getTextResource("encount");
		List<EncountInfo> list = Lists.newArrayListWithCapacity(lines.length);
		for (String line : lines) {
			if (line.indexOf("#") == -1) {
				list.add(new CEncountInfo(line));
			}
		}
		return list;
	}
	
	private static class CEncountInfo implements EncountInfo {
		
		private static final byte GROUP_COUNT = 10;
		
		private int id;
		
		private MapArea area;
		
		private LimitValueOfByte amount;
		
		private byte priority;
		
		private GroupInfo[] groupInfos;
		
		private byte totalRate;
		
		public CEncountInfo(String line) {
			String[] infos = line.split("\t", -2);
			id = MathUtil.stringToInt(infos[0]);
			area = new ReaderMapArea(infos, 3);
			amount = LimitValueFactory.getInstance().createLimitValue(MathUtil.stringToByte(infos[8]), MathUtil.stringToByte(infos[9]));
			priority = MathUtil.stringToByte(infos[10]);
			for (int i = 0;i < GROUP_COUNT;i++) {
				if (groupInfos != null) {
					if (groupInfos.length > i) {
						int groupId = MathUtil.stringToInt(infos[14 + i]);
						groupInfos[i] = new CGroupInfo(groupId, MathUtil.stringToByte(infos[24 + i]));
						totalRate += groupInfos[i].getRate();
					} else {
						break;
					}
				} else if (infos[14 + i].length() == 0) {
					groupInfos = new GroupInfo[i];
					i = -1;
				} else if (i == GROUP_COUNT - 1) {
					groupInfos = new GroupInfo[GROUP_COUNT];
					i = -1;
				}
			}
		}

		@Override
		public int getId() {
			return id;
		}

		@Override
		public MapArea getArea() {
			return area;
		}

		@Override
		public LimitValueOfByte getAmount() {
			return amount;
		}

		@Override
		public byte getPriority() {
			return priority;
		}

		@Override
		public GroupInfo[] getGroupInfos() {
			return groupInfos;
		}

		@Override
		public byte getTotalRate() {
			return totalRate;
		}
		
	}
	
	private static class CGroupInfo implements GroupInfo {
		
		private int groupId;
		
		private byte rate;
		
		public CGroupInfo(int groupId, byte rate) {
			this.groupId = groupId;
			this.rate = rate;
		}

		@Override
		public int getGroupId() {
			return groupId;
		}

		@Override
		public byte getRate() {
			return rate;
		}
		
	}

	@Override
	public void output(File outFile, Collection<EncountInfo> collection) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
