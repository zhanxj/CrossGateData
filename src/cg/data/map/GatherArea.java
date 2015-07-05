package cg.data.map;

import cg.data.item.DropItemGroup;

public interface GatherArea {
	
	MapArea getArea();
	
	GatherInfo getGatherInfo();
	
	public static interface GatherInfo {
		
		String getName();
		
		int getId();
		
		short getSkillId();
		
		short getFailRate();
		
		DropItemGroup getDropItems();
		
	}

}
