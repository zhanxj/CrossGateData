package cg.data.map.dungeon;

public interface DungeonMapRegionInfo {
	
	byte ENTER_IN_RESOURCE_GLOBAL_ID_INDEX = 0;
	
	byte ENTER_OUT_RESOURCE_GLOBAL_ID_INDEX = 1;
	
	byte NEXT_IN_RESOURCE_GLOBAL_ID_INDEX = 2;
	
	byte NEXT_BACK_RESOURCE_GLOBAL_ID_INDEX = 3;
	
	byte EXIT_IN_RESOURCE_GLOBAL_ID_INDEX = 4;
	
	byte EXIT_OUT_RESOURCE_GLOBAL_ID_INDEX = 5;
	
	byte DOOR_SOUTH_RESOURCE_GLOBAL_ID_INDEX = 6;
	
	byte DOOR_EAST_RESOURCE_GLOBAL_ID_INDEX = 7;
	
	byte ROOM_SIZE_EAST_MIN_INDEX = 0;
	
	byte ROOM_SIZE_EAST_MAX_INDEX = 1;
	
	byte ROOM_SIZE_SOUTH_MIN_INDEX = 2;
	
	byte ROOM_SIZE_SOUTH_MAX_INDEX = 3;
	
	byte DOOR_SIZE_EAST_MIN_INDEX = 4;
	
	byte DOOR_SIZE_EAST_MAX_INDEX = 5;
	
	byte DOOR_SIZE_SOUTH_MIN_INDEX = 6;
	
	byte DOOR_SIZE_SOUTH_MAX_INDEX = 7;
	
	byte OBSTACLE_EAST_INDEX = 0;
	
	byte OBSTACLE_SOUTH_INDEX = 1;
	
	byte OBSTACLE_COUNT_INDEX = 2;
	
	int[] getSizeRange();
	
	int[] getSouthWallGlobalId();
	
	int[] getEastWallGlobalId();
	
	int getMapCellGlobalId();
	
	int getCornerWallGlobalId();

}
