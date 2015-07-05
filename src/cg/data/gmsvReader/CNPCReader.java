package cg.data.gmsvReader;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import cg.base.util.MathUtil;
import cg.data.resource.ObjectReader;
import cg.data.resource.ProjectData;
import cg.data.sprite.NpcTemplate;

public class CNPCReader implements ObjectReader<NpcTemplate> {

	@Override
	public List<NpcTemplate> read(ProjectData projectData) {
		String[] lines = projectData.getTextResource("npc");
		List<NpcTemplate> list = new ArrayList<NpcTemplate>(lines.length);
		for (String line : lines) {
			list.add(new CNpcTemplate(line));
		}
		return list;
	}
	
	private static class CNpcTemplate implements NpcTemplate {
		
		private String type, name, talkType;
		
		private int id, mapId, resourcesId;
		
		private int[] coordinates;
		
		private byte dir, appearTime;
		
		public CNpcTemplate(String line) {
			String[] info = line.split("\t", -2);
			type = info[0];
			name = info[1];
			id = MathUtil.stringToInt(info[3]);
			mapId = MathUtil.stringToInt(info[8]);
			coordinates = new int[]{
					MathUtil.stringToInt(info[9]), MathUtil.stringToInt(info[10]), 
					MathUtil.stringToInt(info[11]), MathUtil.stringToInt(info[12]), 
					MathUtil.stringToInt(info[13]), MathUtil.stringToInt(info[14]), 
					MathUtil.stringToInt(info[15]), MathUtil.stringToInt(info[16])};
			dir = MathUtil.stringToByte(info[19]);
			resourcesId = info[20].length() == 0 ? -1 : MathUtil.stringToInt(info[20]);
			appearTime = MathUtil.stringToByte(info[23]);
			talkType = info[24];
		}

		@Override
		public String toString() {
			return getClass().getName() + " type = " + type + " ; name = " + name + " ; id = " + id + " ; mapId = " + mapId + " ; imageId = " + resourcesId + " ; talkType = " + talkType;
		}

		@Override
		public String getType() {
			return type;
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
		public int getMapId() {
			return mapId;
		}

		@Override
		public int[] getCoordinates() {
			return coordinates;
		}

		@Override
		public int getResourcesId() {
			return resourcesId;
		}

		@Override
		public byte getDir() {
			return dir;
		}

		@Override
		public String getTalkType() {
			return talkType;
		}

		@Override
		public byte getAppearTime() {
			return appearTime;
		}

		@Override
		public int getRefreshTime() {
			return NO_REFRESH_TIME;
		}
		
	}

	@Override
	public void output(File outFile, Collection<NpcTemplate> collection)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

}
