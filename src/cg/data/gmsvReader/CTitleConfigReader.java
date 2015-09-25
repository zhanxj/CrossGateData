package cg.data.gmsvReader;

import java.io.File;
import java.util.Collection;
import java.util.List;

import cg.base.util.MathUtil;
import cg.data.limitValue.LimitValueFactory;
import cg.data.limitValue.LimitValueOfInt;
import cg.data.limitValue.LimitValueOfInt.ValueOfInt;
import cg.data.limitValue.LimitValueOfShort;
import cg.data.limitValue.LimitValueOfShort.ValueOfShort;
import cg.data.resource.ObjectReader;
import cg.data.resource.ProjectData;
import cg.data.title.TitleConfig;

import com.google.common.collect.Lists;

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
		
		private static final LimitValueFactory limitValueFactory = LimitValueFactory.getInstance();
		
		private LimitValueOfInt fame;
		
		private LimitValueOfShort job;
		
		private byte equipEvent;
		
		private int equipItemId;
		
		private short titleId;
		
		private short endflg;
		
		private LimitValueOfInt gold;
		
		private int itemId;
		
		public CTitleConfig(String line) {
			String[] infos = line.split(",");
			ValueOfInt fameMin = limitValueFactory.createValueOfInt(Integer.MIN_VALUE, false);
			ValueOfInt fameMax = limitValueFactory.createValueOfInt(Integer.MAX_VALUE, false);
			boolean hasFame = false;
			ValueOfShort jobMin = limitValueFactory.createValueOfShort(Short.MIN_VALUE, false);
			ValueOfShort jobMax = limitValueFactory.createValueOfShort(Short.MAX_VALUE, false);
			boolean hasJob = false;
			ValueOfInt goldMin = limitValueFactory.createValueOfInt(Integer.MIN_VALUE, false);
			ValueOfInt goldMax = limitValueFactory.createValueOfInt(Integer.MAX_VALUE, false);
			boolean hasGold = false;
			for (String info : infos) {
				if (info.indexOf(FAME) == 0) {
					if (info.indexOf(">") > -1) {
						fameMin = getValueOfInt(info.split(">")[1]);
					} else {
						fameMax = getValueOfInt(info.split("<")[1]);
					}
					hasFame = true;
				} else if (info.indexOf(TITLE) == 0) {
					titleId = MathUtil.stringToShort(info.split("=")[1]);
				} else if (info.indexOf(JOB) == 0 || info.indexOf(Job) == 0) {
					if (info.indexOf(">") > -1) {
						jobMin = getValueOfShort(info.split(">")[1]);
						hasJob = true;
					} else if (info.indexOf("<") > -1) {
						jobMax = getValueOfShort(info.split("<")[1]);
						hasJob = true;
					} else {
						short jobValue = MathUtil.stringToShort(info.split("=")[1]);
						job = limitValueFactory.createLimitValue(jobValue, jobValue);
					}
				} else if (info.indexOf(EQUIPEVENT) == 0) {
					equipEvent = MathUtil.stringToByte(info.split("=")[1]);
				} else if (info.indexOf(EQUIPITEM) == 0) {
					equipItemId = MathUtil.stringToInt(info.split("=")[1]);
				} else if (info.indexOf(ENDFLG) == 0) {
					endflg = MathUtil.stringToShort(info.split("=")[1]);
				} else if (info.indexOf(GOLD) == 0) {
					if (info.indexOf(">") > -1) {
						goldMin = getValueOfInt(info.split(">")[1]);
						hasGold = true;
					} else if (info.indexOf("<") > -1) {
						goldMax = getValueOfInt(info.split("<")[1]);
						hasGold = true;
					} else {
						int goldValue = MathUtil.stringToShort(info.split("=")[1]);
						gold = limitValueFactory.createLimitValue(goldValue, goldValue);
					}
				} else if (info.indexOf(ITEM) == 0) {
					itemId = MathUtil.stringToInt(info.split("=")[1]);
				} else {
					System.out.println(getClass().getName() + " unknow type : " + info);
				}
			}
			
			if (hasFame) {
				fame = limitValueFactory.createLimitValue(fameMin, fameMax);
			}
			if (hasJob) {
				job = limitValueFactory.createLimitValue(jobMin, jobMax);
			}
			if (hasGold) {
				gold = limitValueFactory.createLimitValue(goldMin, goldMax);
			}
		}
		
		private static ValueOfShort getValueOfShort(String info) {
			boolean hasEqual = info.indexOf("=") == 0;
			info = hasEqual ? info.substring(1) : info;
			return limitValueFactory.createValueOfShort(MathUtil.stringToShort(info), hasEqual);
		}
		
		private static ValueOfInt getValueOfInt(String info) {
			boolean hasEqual = info.indexOf("=") == 0;
			info = hasEqual ? info.substring(1) : info;
			return limitValueFactory.createValueOfInt(MathUtil.stringToInt(info), hasEqual);
		}

		@Override
		public LimitValueOfInt getFame() {
			return fame;
		}

		@Override
		public LimitValueOfShort getJob() {
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
		public LimitValueOfInt getGold() {
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
