package cg.data.sprite;

import cg.data.item.DropItemGroup;

import com.google.common.collect.Range;

public interface EnemyInfo {
	
	/**
	 * �����趨
	 */
	String ATTACKOPTION = "at";
	/**
	 * �����趨
	 */
	String GUARDOPTION = "gu";
	/**
	 * ʩ���趨
	 */
	String MAGICOPTION = "ma";
	/**
	 * �����趨
	 */
	String ESCAPEOPTION = "es";
	/**
	 * �����趨
	 */
	String WAZAOPTION = "wa";
	/**
	 * ���
	 */
	String RANDAOPTION = "rn";
	
	/**
	 * ��������Ϊ����
	 */
	byte B_AI_NORMAL_TARGET_ALL = 1;
	/**
	 * ��������Ϊ���
	 */
	byte B_AI_NORMAL_TARGET_PLAYER = 2;
	/**
	 * ��������Ϊ����
	 */
	byte B_AI_NORMAL_TARGET_PET = 3;
	/**
	 * ��������Ϊ�ӳ�
	 */
	byte B_AI_NORMAL_TARGET_LEADER = 4;
	
	/**
	 * �漴����
	 */
	byte B_AI_NORMAL_SELECT_RANDOM = 1;
	/**
	 * ����Ѫ����
	 */
	byte B_AI_NORMAL_SELECT_HP_MAX = 2;
	/**
	 * ����Ѫ���ٵ�
	 */
	byte B_AI_NORMAL_SELECT_HP_MIN = 3;
	/**
	 * ����������ߵ�
	 */
	byte B_AI_NORMAL_SELECT_STR_MAX = 4;
	/**
	 * ��������ߵ�
	 */
	byte B_AI_NORMAL_SELECT_DEX_MAX = 5;
	/**
	 * ��������͵�
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
	
	Range<Short> getLevelRange();
	
	Range<Short> getAmount();
	
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
