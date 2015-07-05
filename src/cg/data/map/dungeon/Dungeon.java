package cg.data.map.dungeon;

import cg.data.limitValue.LimitValueOfByte;
import cg.data.limitValue.LimitValueOfShort;
import cg.data.map.GameMap;
import cg.data.map.MapArea;
import cg.data.map.WarpManager;

public interface Dungeon {
	
	String getName();
	
	int getMapId();
	
	DungeonData refresh(WarpManager warpManager, GameMap enterMap, GameMap exitMap);
	
	int getEncountId();
	
	LimitValueOfByte getEnemyRate();
	
	boolean getChangeDayState();
	
	LimitValueOfShort getEnemyLevel();
	
	short getEnterMusic();
	
	short getExitMusic();
	
	byte getExitColorPalette();
	
	int getRefreshInterval();
	
	MapArea getEnterInfo();
	
	MapArea getExitInfo();
	
	void setAoiRange(int eastRange, int southRange);

}
