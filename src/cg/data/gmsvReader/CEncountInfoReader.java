package cg.data.gmsvReader;

import java.io.File;
import java.util.Collection;
import java.util.List;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Range;

import cg.base.util.MathUtil;
import cg.data.map.MapArea;
import cg.data.map.ReaderMapArea;
import cg.data.resource.ObjectReader;
import cg.data.resource.ProjectData;
import cg.data.sprite.EncountInfo;
import cg.data.sprite.EncountInfo.GroupInfo;

public class CEncountInfoReader implements ObjectReader<EncountInfo> {

	@Override
	public List<EncountInfo> read(ProjectData projectData) {
		String[] lines = projectData.getTextResource("encount");
		List<EncountInfo> list = Lists.newArrayListWithCapacity(lines.length);
		for (String line : lines) {
			if (line.indexOf("#") == -1) {
				list.add(createEncountInfo(line.split("\t", -2)));
			}
		}
		return list;
	}
	
	public static EncountInfo createEncountInfo(String[] infos) {
		return new CEncountInfo(infos);
	}
	
	private static class CEncountInfo implements EncountInfo {
		
		private static final byte GROUP_COUNT = 10;
		
		private int id;
		
		private MapArea area;
		
		private Range<Byte> amount;
		
		private byte priority;
		
		private List<GroupInfo> groupInfos;
		
		public CEncountInfo(String[] infos) {
			id = MathUtil.stringToInt(infos[0]);
			area = new ReaderMapArea(infos, 3);
			amount = Range.closed(MathUtil.stringToByte(infos[8]), MathUtil.stringToByte(infos[9]));
			priority = MathUtil.stringToByte(infos[10]);
			groupInfos = Lists.newLinkedList();
			for (int i = 0;i < GROUP_COUNT;i++) {
				if (infos[14 + i].length() == 0) {
					break;
				} else {
					int groupId = MathUtil.stringToInt(infos[14 + i]);
					groupInfos.add(new CGroupInfo(groupId, MathUtil.stringToByte(infos[24 + i])));
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
		public Range<Byte> getAmount() {
			return amount;
		}

		@Override
		public byte getPriority() {
			return priority;
		}

		@Override
		public List<GroupInfo> getGroupInfos() {
			return ImmutableList.copyOf(groupInfos);
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
