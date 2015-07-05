package cg.data.sprite;

public interface EnemyTalkInfo {
	
	byte TALK_CONDITION_BATTLE_START = 1; // 战斗开始时
	
	byte TALK_CONDITION_ATTACK = 25; // 攻击时
	
	byte TALK_CONDITION_DEFEND = 9; // 防御时
	
	byte TALK_CONDITION_USE_MAGIC = 11; // 使用魔法时
	
	byte TALK_CONDITION_DEAD = 13; // 死亡时
	
	int getId();
	
	TalkInfo[] getTalkInfos();
	
	public static interface TalkInfo {
		
		byte getTalkCondition();
		
		int getTalkMsgId();
		
		byte getFontSize();
		
		byte getFontColor();
		
	}

}
