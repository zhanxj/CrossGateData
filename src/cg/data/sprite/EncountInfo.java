package cg.data.sprite;

import cg.data.limitValue.LimitValueOfByte;
import cg.data.map.MapArea;

public interface EncountInfo {
	
	int getId();
	
	MapArea getArea();
	
	LimitValueOfByte getAmount();
	
	byte getPriority();
	
	GroupInfo[] getGroupInfos();
	
	byte getTotalRate();
	
	public static interface GroupInfo {
		
		int getGroupId();
		
		byte getRate();
		
	}

}
