package cg.data.sprite;

import cg.data.item.DropItemGroup;
import cg.data.limitValue.LimitValueOfShort;

public interface EnemyInfo {
	
	/**
	 * 攻击设定
	 */
	String ATTACKOPTION = "at";
	/**
	 * 防御设定
	 */
	String GUARDOPTION = "gu";
	/**
	 * 施法设定
	 */
	String MAGICOPTION = "ma";
	/**
	 * 逃跑设定
	 */
	String ESCAPEOPTION = "es";
	/**
	 * 技能设定
	 */
	String WAZAOPTION = "wa";
	/**
	 * 随机
	 */
	String RANDAOPTION = "rn";
	
	/**
	 * 攻击对象为所有
	 */
	byte B_AI_NORMAL_TARGET_ALL = 1;
	/**
	 * 攻击对象为玩家
	 */
	byte B_AI_NORMAL_TARGET_PLAYER = 2;
	/**
	 * 攻击对象为宠物
	 */
	byte B_AI_NORMAL_TARGET_PET = 3;
	/**
	 * 攻击对象为队长
	 */
	byte B_AI_NORMAL_TARGET_LEADER = 4;
	
	/**
	 * 随即攻击
	 */
	byte B_AI_NORMAL_SELECT_RANDOM = 1;
	/**
	 * 攻击血最多的
	 */
	byte B_AI_NORMAL_SELECT_HP_MAX = 2;
	/**
	 * 攻击血最少的
	 */
	byte B_AI_NORMAL_SELECT_HP_MIN = 3;
	/**
	 * 攻击力量最高的
	 */
	byte B_AI_NORMAL_SELECT_STR_MAX = 4;
	/**
	 * 攻击敏最高的
	 */
	byte B_AI_NORMAL_SELECT_DEX_MAX = 5;
	/**
	 * 攻击敏最低的
	 */
	byte B_AI_NORMAL_SELECT_DEX_MIN = 6;
	/**
	 * 
	 */
	byte B_AI_NORMAL_SELECT_ATT_SUBDUE = 7;
	
	String getEnemyName();
	
	String[] getAiParams();
	
	int getEnemyId();
	
	int getEnemyBaseId();
	
	LimitValueOfShort getLevelRange();
	
	LimitValueOfShort getAmount();
	
	int getAiId();
	
	int getGainExp();
	
	int getBattleScore();
	
	boolean getCanCatch();
	
	DropItemGroup getDropItems();
	
	DropItemGroup getStealItems();
	
	byte[] getActionCode();
	
	int[] getSummonCode();
	
	int getEnemyTalk();

}
