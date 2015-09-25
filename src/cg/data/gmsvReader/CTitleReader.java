package cg.data.gmsvReader;

import java.io.File;
import java.util.Collection;
import java.util.List;

import cg.base.sprite.Title;
import cg.base.util.MathUtil;
import cg.data.resource.ObjectReader;
import cg.data.resource.ProjectData;

import com.google.common.collect.Lists;

public class CTitleReader implements ObjectReader<Title> {
	
	@Override
	public List<Title> read(ProjectData projectData) {
		String[] lines = projectData.getTextResource("titlename");
		List<Title> list = Lists.newArrayListWithCapacity(lines.length);
		for (String line : lines) {
			list.add(new CTitle(line));
		}
		return list;
	}
	
	private static class CTitle implements Title {
		
		private short id;
		
		private String name;
		
		public CTitle(String line) {
			String[] infos = line.split("\t");
			id = MathUtil.stringToShort(infos[0]);
			name = infos[1];
		}

		@Override
		public short getId() {
			return id;
		}

		@Override
		public String getName() {
			return name;
		}
		
	}

	@Override
	public void output(File outFile, Collection<Title> collection)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

}
