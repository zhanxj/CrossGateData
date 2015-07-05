package cg.data.sprite;

public interface NpcTemplate {
	
	String TYPE_Windowhealer = "Windowhealer"; // 医疗窗口
	
	String TYPE_Injurydoctor = "Injurydoctor"; // 治疗医生
	
	String TYPE_Event = "Event"; // 事件
	
	String TYPE_Skillmaster = "Skillmaster"; // 技能教学
	
	String TYPE_StandEnemy = "StandEnemy"; // 站立敌人
	
	String TYPE_TownPeople = "TownPeople"; // 城镇居民
	
	String TYPE_Jobsmaster = "Jobsmaster"; // 就职教学
	
	String TYPE_Billboard = "Billboard"; // 街道版
	
	String TYPE_Brushman = "Brushman"; // 兑换人
	
	String TYPE_Itemshop2 = "Itemshop2"; // 商品商店
	
	String TYPE_Titleman = "Titleman"; // 称号人
	
	String TYPE_Box = "box"; // 宝箱
	
	String TYPE_NONE = ""; // 无
	
	byte APPEAR_TIME_ALL_DAY = 0;
	
	int NO_REFRESH_TIME = -1;
	
	int NPC_ID_NULL = 0;
	
	String getName();
	
	int getResourcesId();
	
	byte getDir();
	
	String getType();
	
	int getId();
	
	int getMapId();
	
	int[] getCoordinates();
	
	String getTalkType();
	
	byte getAppearTime();
	
	int getRefreshTime();

}
