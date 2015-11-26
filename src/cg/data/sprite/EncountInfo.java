package cg.data.sprite;

import java.util.List;

import com.google.common.collect.Range;

import cg.data.map.MapArea;

public interface EncountInfo {
	
	int getId();
	
	MapArea getArea();
	
	Range<Byte> getAmount();
	
	byte getPriority();
	
	List<GroupInfo> getGroupInfos();
	
	public static interface GroupInfo {
		
		int getGroupId();
		
		byte getRate();
		
	}

}
