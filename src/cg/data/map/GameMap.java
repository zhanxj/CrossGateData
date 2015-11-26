package cg.data.map;

import java.util.List;

import cg.data.sprite.MapUnit;
import cg.data.sprite.RateEncountInfo;

public interface GameMap {
	
	byte LOCAL_MIDDLE_EAST = -1;
	
	byte LOCAL_MIDDLE_SOUTH = -1;
	
	byte RANGE_MAX = -1;
	
	int NO_INSTANCE_ID = -1;
	
	MapInfo getMapInfo();
	
	int getInstanceId();
	
	void addUnit(MapUnit unit, int east, int south);
	
	void removeUnit(MapUnit unit);
	
	void destroy();
	
	List<MapUnit> getUnits(int east, int south, int range);
	
	NpcLocal getNpcLocal(int east, int south);
	
	void unitMoved(MapUnit unit, int sourceEast, int sourceSouth);
	
	RateEncountInfo getEncountInfo(int east, int south, boolean must, int rateFix);
	
	void addWarp(Warp warp);
	
	public static class NpcLocal implements LocalInfo {
		
		protected int east, south, instanceId, mapId;
		
		public NpcLocal(int instanceId) {
			this.instanceId = instanceId;
		}

		@Override
		public int getEast() {
			return east;
		}

		@Override
		public int getSouth() {
			return south;
		}

		public int getInstanceId() {
			return instanceId;
		}

		@Override
		public int getMapId() {
			return mapId;
		}

		@Override
		public void update(int mapId, int east, int south) {
			this.mapId = mapId;
			this.east = east;
			this.south = south;
		}
		
	}

}
