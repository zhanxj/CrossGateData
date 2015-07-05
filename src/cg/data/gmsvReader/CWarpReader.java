package cg.data.gmsvReader;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import cg.base.util.MathUtil;
import cg.data.map.Warp;
import cg.data.resource.ObjectReader;
import cg.data.resource.ProjectData;

public class CWarpReader implements ObjectReader<Warp> {
	
	@Override
	public List<Warp> read(ProjectData projectData) {
		String[] lines = projectData.getTextResource("warp");
		List<Warp> list = new ArrayList<Warp>(lines.length);
		for (String line : lines) {
			if (line.indexOf("#") == -1) {
				list.add(createWarp(line.split("\t", -2)));
			}
		}
		return list;
	}
	
	public static Warp createWarp(String[] infos) {
		return new CWarp(infos);
	}
	
	public static Warp createWarp(int id, int sourceMapId, int sourceMapEast, int sourceMapSouth, int targetMapId, int targetMapEast, int targetMapSouth, int resourceGlobalId) {
		CWarp warp = new CWarp();
		warp.setId(id);
		warp.setSourceMapId(sourceMapId);
		warp.setSourceMapEast(sourceMapEast);
		warp.setSourceMapSouth(sourceMapSouth);
		warp.setTargetMapId(targetMapId);
		warp.setTargetMapEast(targetMapEast);
		warp.setTargetMapSouth(targetMapSouth);
		warp.setResourceGlobalId(resourceGlobalId);
		return warp;
	}
	
	private static class CWarp implements Warp {
		
		private int id;
		
		private int sourceMapId;
		
		private int targetMapId;
		
		private int sourceMapEast;
		
		private int sourceMapSouth;
		
		private int targetMapEast;
		
		private int targetMapSouth;
		
		private int resourceGlobalId;
		
		public CWarp(String[] infos) {
			this();
			setId(MathUtil.stringToInt(infos[0]));
			if (getId() > 0 && infos[1].length() > 0) {
				setSourceMapId(MathUtil.stringToInt(infos[1]));
				setSourceMapEast(MathUtil.stringToInt(infos[2]));
				setSourceMapSouth(MathUtil.stringToInt(infos[3]));
				setTargetMapId(MathUtil.stringToInt(infos[4]));
				setTargetMapEast(MathUtil.stringToInt(infos[5]));
				setTargetMapSouth(MathUtil.stringToInt(infos[6]));
			}
		}
		
		public CWarp() {};

		@Override
		public int getId() {
			return id;
		}

		@Override
		public int getSourceMapId() {
			return sourceMapId;
		}

		@Override
		public int getTargetMapId() {
			return targetMapId;
		}

		@Override
		public int getSourceMapEast() {
			return sourceMapEast;
		}

		@Override
		public int getSourceMapSouth() {
			return sourceMapSouth;
		}

		@Override
		public int getTargetMapEast() {
			return targetMapEast;
		}

		@Override
		public int getTargetMapSouth() {
			return targetMapSouth;
		}

		@Override
		public int getResourceGlobalId() {
			return resourceGlobalId;
		}
		
		private void setId(int id) {
			this.id = id;
		}
		
		private void setSourceMapId(int sourceMapId) {
			this.sourceMapId = sourceMapId;
		}
		
		private void setSourceMapEast(int sourceMapEast) {
			this.sourceMapEast = sourceMapEast;
		}
		
		private void setSourceMapSouth(int sourceMapSouth) {
			this.sourceMapSouth = sourceMapSouth;
		}
		
		private void setTargetMapId(int targetMapId) {
			this.targetMapId = targetMapId;
		}
		
		private void setTargetMapEast(int targetMapEast) {
			this.targetMapEast = targetMapEast;
		}
		
		private void setTargetMapSouth(int targetMapSouth) {
			this.targetMapSouth = targetMapSouth;
		}
		
		private void setResourceGlobalId(int resourceGlobalId) {
			this.resourceGlobalId = resourceGlobalId;
		}

		@Override
		public String toString() {
			return "{Warp[" + id + "]:from (" + sourceMapId + "," + sourceMapEast + "," + sourceMapSouth + ") to (" + targetMapId + "," + targetMapEast + "," + targetMapSouth + ").";
		}
		
	}

	@Override
	public void output(File outFile, Collection<Warp> collection)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

}
