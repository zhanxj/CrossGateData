package cg.data.title;

import com.google.common.collect.Range;

public interface TitleConfig {
	
	String FAME = "FAME";
	
	String TITLE = "TITLE";
	
	String JOB = "JOB";
	
	String Job = "Job";
	
	String EQUIPEVENT = "EQUIPEVENT";
	
	String EQUIPITEM = "EQUIPITEM";
	
	String ENDFLG = "ENDFLG";
	
	String GOLD = "GOLD";
	
	String ITEM = "ITEM";
	
	Range<Integer> getFame();
	
	Range<Short> getJob();
	
	byte getEquipEvent();
	
	int getEquipItemId();
	
	short getTitleId();
	
	short getEndflg();
	
	Range<Integer> getGold();
	
	int getItemId();

}
