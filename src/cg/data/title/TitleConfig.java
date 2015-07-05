package cg.data.title;

import cg.data.limitValue.LimitValueOfInt;
import cg.data.limitValue.LimitValueOfShort;

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
	
	LimitValueOfInt getFame();
	
	LimitValueOfShort getJob();
	
	byte getEquipEvent();
	
	int getEquipItemId();
	
	short getTitleId();
	
	short getEndflg();
	
	LimitValueOfInt getGold();
	
	int getItemId();

}
