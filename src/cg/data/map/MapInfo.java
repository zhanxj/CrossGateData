package cg.data.map;

public interface MapInfo {
	
	String SERVER_HEAD = "LS2MAP";
	
	String SNAIL_HEAD_0 = "SNAIL0";
	
	int NO_MAP_ID = -1;
	
	int NO_WARP_ID = -1;
	
	byte DATA_LENGTH = 2;
	
	short NO_ENEMY_LEVEL = -1;
	
	int getMapId();
	
	String getName();
	
	int getMaxEast();
	
	int getMaxSouth();
	
	int getImageGlobalId(int east, int south);
	
	int getObjectId(int east, int south);
	
	byte getMark(int east, int south);
	
	int getWarpId(int east, int south);
	
	void addWarp(Warp warp);
	
	short getEnemyLevel();
	
	void setObject(int east, int south, int resourceId);
	
	public static class CLocalInfo implements LocalInfo {
		
		private int mapId, east, south;

		@Override
		public int getMapId() {
			return mapId;
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
		public void update(int mapId, int east, int south) {
			this.mapId = mapId;
			this.east = east;
			this.south = south;
		}
		
	}

}
