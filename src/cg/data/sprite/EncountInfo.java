package cg.data.sprite;

import cg.data.map.MapArea;

import com.google.common.collect.Range;

public interface EncountInfo {
	
	int getId();
	
	MapArea getArea();
	
	Range<Byte> getAmount();
	
	byte getPriority();
	
	GroupInfo[] getGroupInfos();
	
	byte getTotalRate();
	
	public static interface GroupInfo {
		
		int getGroupId();
		
		byte getRate();
		
	}

}
