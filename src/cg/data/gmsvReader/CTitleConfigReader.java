package cg.data.gmsvReader;

import java.io.File;
import java.util.Collection;
import java.util.List;

import com.google.common.collect.Lists;
import com.google.common.collect.Range;

import cg.base.util.MathUtil;
import cg.data.resource.ObjectReader;
import cg.data.resource.ProjectData;
import cg.data.title.TitleConfig;

public class CTitleConfigReader implements ObjectReader<TitleConfig> {

	@Override
	public List<TitleConfig> read(ProjectData projectData) {
		String[] lines = projectData.getTextResource("titleconfig");
		List<TitleConfig> list = Lists.newArrayListWithCapacity(lines.length);
		for (String line : lines) {
			if (line.length() > 0 && line.indexOf("#") == -1 && line.indexOf("=") > 0) {
				list.add(new CTitleConfig(line));
			}
		}
		return list;
	}
	
	private static class CTitleConfig implements TitleConfig {
		
		private Range<Integer> fame;
		
		private Range<Short> job;
		
		private byte equipEvent;
		
		private int equipItemId;
		
		private short titleId;
		
		private short endflg;
		
		private Range<Integer> gold;
		
		private int itemId;
		
		public CTitleConfig(String line) {
			String[] infos = line.split(",");
			Range<Integer> fameMin = Range.atLeast(Integer.MIN_VALUE);
			Range<Integer> fameMax = Range.atMost(Integer.MAX_VALUE);
			Range<Short> jobMin = Range.atLeast(Short.MIN_VALUE);
			Range<Short> jobMax = Range.atMost(Short.MAX_VALUE);
			Range<Integer> goldMin = Range.atLeast(Integer.MIN_VALUE);
			Range<Integer> goldMax = Range.atMost(Integer.MAX_VALUE);
			for (String info : infos) {
				if (info.indexOf(FAME) == 0) {
					if (info.indexOf(">") > -1) {
						fameMin = info.indexOf("=") > -1 ? Range.atLeast(Integer.parseInt(info.split("=")[1])) : Range.greaterThan(Integer.parseInt(info.split(">")[1]));
					} else {
						fameMax = info.indexOf("=") > -1 ? Range.atMost(Integer.parseInt(info.split("=")[1])) : Range.lessThan(Integer.parseInt(info.split("<")[1]));
					}
				} else if (info.indexOf(TITLE) == 0) {
					titleId = MathUtil.stringToShort(info.split("=")[1]);
				} else if (info.indexOf(JOB) == 0 || info.indexOf(Job) == 0) {
					if (info.indexOf(">") > -1) {
						jobMin = info.indexOf("=") > -1 ? Range.atLeast(Short.parseShort(info.split("=")[1])) : Range.greaterThan(Short.parseShort(info.split(">")[1]));
					} else if (info.indexOf("<") > -1) {
						jobMax = info.indexOf("=") > -1 ? Range.atMost(Short.parseShort(info.split("=")[1])) : Range.lessThan(Short.parseShort(info.split("<")[1]));
					} else {
						short jobValue = MathUtil.stringToShort(info.split("=")[1]);
						job = Range.closed(jobValue, jobValue);
					}
				} else if (info.indexOf(EQUIPEVENT) == 0) {
					equipEvent = MathUtil.stringToByte(info.split("=")[1]);
				} else if (info.indexOf(EQUIPITEM) == 0) {
					equipItemId = MathUtil.stringToInt(info.split("=")[1]);
				} else if (info.indexOf(ENDFLG) == 0) {
					endflg = MathUtil.stringToShort(info.split("=")[1]);
				} else if (info.indexOf(GOLD) == 0) {
					if (info.indexOf(">") > -1) {
						goldMin = info.indexOf("=") > -1 ? Range.atLeast(Integer.parseInt(info.split("=")[1])) : Range.greaterThan(Integer.parseInt(info.split(">")[1]));
					} else if (info.indexOf("<") > -1) {
						goldMax = info.indexOf("=") > -1 ? Range.atMost(Integer.parseInt(info.split("=")[1])) : Range.lessThan(Integer.parseInt(info.split("<")[1]));
					} else {
						int goldValue = MathUtil.stringToShort(info.split("=")[1]);
						gold = Range.closed(goldValue, goldValue);
					}
				} else if (info.indexOf(ITEM) == 0) {
					itemId = MathUtil.stringToInt(info.split("=")[1]);
				} else {
					System.out.println(getClass().getName() + " unknow type : " + info);
				}
			}
			
			fame = fameMin.intersection(fameMax);
			if (job == null) {
				job = jobMin.intersection(jobMax);
			}
			if (gold == null) {
				gold = goldMin.intersection(goldMax);
			}
		}

		@Override
		public Range<Integer> getFame() {
			return fame;
		}

		@Override
		public Range<Short> getJob() {
			return job;
		}

		@Override
		public byte getEquipEvent() {
			return equipEvent;
		}

		@Override
		public int getEquipItemId() {
			return equipItemId;
		}

		@Override
		public short getTitleId() {
			return titleId;
		}

		@Override
		public short getEndflg() {
			return endflg;
		}

		@Override
		public Range<Integer> getGold() {
			return gold;
		}

		@Override
		public int getItemId() {
			return itemId;
		}
		
	}

	@Override
	public void output(File outFile, Collection<TitleConfig> collection)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

}
