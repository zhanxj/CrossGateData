package cg.data.map;

import cg.base.util.MathUtil;

public class ReaderMapArea implements MapArea {

	private int mapId, west, north, east, south;
	
	public ReaderMapArea(String[] infos, int offset) {
		mapId = MathUtil.stringToInt(infos[offset + 0]);
		west = MathUtil.stringToInt(infos[offset + 1]);
		north = MathUtil.stringToInt(infos[offset + 2]);
		east = MathUtil.stringToInt(infos[offset + 3]);
		south = MathUtil.stringToInt(infos[offset + 4]);
		if (west > east) {
			int temp = west;
			west = east;
			east = temp;
		}
		if (north > south) {
			int temp = north;
			north = south;
			south = temp;
		}
	}

	@Override
	public int getMapId() {
		return mapId;
	}

	@Override
	public int getWest() {
		return west;
	}

	@Override
	public int getNorth() {
		return north;
	}

	@Override
	public int getEast() {
		return east;
	}

	@Override
	public int getSouth() {
		return south;
	}

	@Override
	public String toString() {
		return "ReaderMapArea[" + getMapId() + "](" + getWest() + "," + getNorth() + ") to (" + getEast() + "," + getSouth() + ").";
	}

}
