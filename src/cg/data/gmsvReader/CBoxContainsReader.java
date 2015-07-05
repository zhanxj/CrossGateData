package cg.data.gmsvReader;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import cg.base.util.MathUtil;
import cg.data.map.BoxContains;
import cg.data.resource.ObjectReader;
import cg.data.resource.ProjectData;

public class CBoxContainsReader implements ObjectReader<BoxContains> {
	
	@Override
	public List<BoxContains> read(ProjectData projectData) {
		String[] lines = projectData.getTextResource("boxcontains");
		List<BoxContains> list = new ArrayList<BoxContains>(lines.length);
		for (String line : lines) {
			list.add(new CBoxContains(line.split("\t")));
		}
		return list;
	}
	
	private static class CBoxContains implements BoxContains {
		
		private static final byte DEFAULT_COUNT = 1;
		
		private byte id, count, rate;
		
		private int value;
		
		private String type;
		
		public CBoxContains(String[] infos) {
			id = MathUtil.stringToByte(infos[0]);
			value = MathUtil.stringToInt(infos[3]);
			count = MathUtil.stringToByte(infos[4], DEFAULT_COUNT);
			rate = MathUtil.stringToByte(infos[5]);
			type = infos[6];
		}

		@Override
		public byte getId() {
			return id;
		}

		@Override
		public int getValue() {
			return value;
		}

		@Override
		public byte getCount() {
			return count;
		}

		@Override
		public byte getRate() {
			return rate;
		}

		@Override
		public String getType() {
			return type;
		}
		
	}

	@Override
	public void output(File outFile, Collection<BoxContains> collection) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
