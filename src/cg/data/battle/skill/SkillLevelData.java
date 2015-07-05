package cg.data.battle.skill;

import cg.base.skill.SkillLevelInfo;

public interface SkillLevelData extends SkillLevelInfo {
	
	int NO_SKILL = -1;
	
	byte LEVEL_PET = 30;
	
	byte LEVEL_BOSS = 50;
	
	SelfEffect[] getSelfEffects();
	
	int getSkillCode();
	
	short getSkillId();
	
	int getPrice();
	
	int getBeginAnimation();
	
	int getAttachAnimation();
	
	int getHitAnimation();
	
	int getBackAnimation();
	
	int getTrackAnimation();
	
	public static interface SelfEffect {

		/** 攻击速度 */
		String EFFECT_ATTACK_SPEED = "AS";
		/** 最小攻击次数 */
		String EFFECT_ATTACK_MIN = "AN";
		/** 最大攻击次数 */
		String EFFECT_ATTACK_MAX = "AM";
		/** 伤害比 */
		String EFFECT_DAMAGE = "DD";
		/** 攻击力百分比 */
		String EFFECT_ATTACK_RATE = "TR";
		/** 防御比率 */
		String EFFECT_DEFEND_RATE = "DR";
		/** 魔防比率 */
		String EFFECT_MAGIC_RATE = "MR";
		/** 命中 */
		String EFFECT_HIT_RATE = "HR";
		/** 耗费对方MP的百分比 */
		String EFFECT_TARGET_MANA_RATE = "FR";
		/** 魔法防御 */
		String EFFECT_MAGIC_DEFEND = "RS";
		/** 物理防御 */
		String EFFECT_PHYSICAL_DEFEND = "RE";
		/** 闪避 */
		String EFFECT_AVOID = "AV";
		/** 反击默认率(下限) */
		String EFFECT_CO = "CO";
		/** 反击率(上限) */
		String EFFECT_COUNTER = "CM";
		/** 最小恢复率 */
		String EFFECT_D1 = "D1";
		/** 最大恢复率 */
		String EFFECT_D2 = "D2";
		/** 抗毒修正 */
		String EFFECT_POISON = "PO";
		/** 抗睡修正 */
		String EFFECT_SLEEP = "SL";
		/** 抗石修正 */
		String EFFECT_STONE = "ST";
		/** 抗醉修正 */
		String EFFECT_INTOXICATION = "YO";
		/** 混乱修正 */
		String EFFECT_CONFUSION = "CN";
		/** 遗忘修正 */
		String EFFECT_AMNESIA = "AA";
		/** 被咒的机率 */
		String EFFECT_AC = "AC";
		/** 魔攻 恢复比率 */
		String EFFECT_MAGIC_ATTACK = "AR";
		/** 对方中咒机率 */
		String EFFECT_S_RATE = "SR";
		/** 回合数 */
		String EFFECT_ROUND = "CH";
		/** 恢复率 */
		String EFFECT_RECOVER_RATE = "RR";
		/** 必杀 */
		String EFFECT_CRITICAL_RATE = "CR";
		/** 元素属性【EX】 */
		String EFFECT_EX_ELEMENT = "EL";
		
		String getType();
		
		short getValue();
		
	}

}
