package cg.data.ai;

public interface EnemyAiInfo {
	
	/**
	 * 100%随机触发 如果设置0 则100%ai会选择这个
	 */
	byte AI_CONDITION_100 = 0;
	/**
	 * 75%随机触发 如果设置0 则75%ai会选择这个
	 */
	byte AI_CONDITION_75 = 1;
	/**
	 * 50%随机触发 如果设置0 则50%ai会选择这个
	 */
	byte AI_CONDITION_50 = 2;
	/**
	 * 25%随机触发 如果设置0 则25%ai会选择这个
	 */
	byte AI_CONDITION_25 = 3;
	/**
	 * 怪物自身HP = 100%
	 */
	byte AI_CONDITION_S_HP_E_100 = 4;
	/**
	 * 怪物自身HP > 75%
	 */
	byte AI_CONDITION_S_HP_G_75 = 5;
	/**
	 * 怪物自身HP > 50%
	 */
	byte AI_CONDITION_S_HP_G_50 = 6;
	/**
	 * 怪物自身HP < 50%
	 */
	byte AI_CONDITION_S_HP_L_50 = 7;
	/**
	 * 怪物自身HP < 25%
	 */
	byte AI_CONDITION_S_HP_L_25 = 8;
	/**
	 * 怪物自身MP >= 50%
	 */
	byte AI_CONDITION_S_MP_GE_50 = 9;
	/**
	 * 怪物自身MP < 50%
	 */
	byte AI_CONDITION_S_MP_L_50 = 10;
	/**
	 * 怪物阵营HP < 50%
	 */
	byte AI_CONDITION_T_HP_L_50 = 11;
	/**
	 * 怪物阵营HP < 25%
	 */
	byte AI_CONDITION_T_HP_L_25 = 12;
	/**
	 * 怪物阵营有中毒单位
	 */
	byte AI_CONDITION_T_POSITION = 13;
	/**
	 * 怪物阵营有混乱单位
	 */
	byte AI_CONDITION_T_CONFUSION = 14;
	/**
	 * 怪物阵营有石化单位
	 */
	byte AI_CONDITION_T_STONE = 15;
	/**
	 * 怪物阵营有睡眠单位
	 */
	byte AI_CONDITION_T_SLEEP = 16;
	/**
	 * 怪物阵营有醉酒单位
	 */
	byte AI_CONDITION_T_INTOXICATION = 17;
	/**
	 * 怪物阵营有遗忘单位
	 */
	byte AI_CONDITION_T_AMNESIA = 18;
	/**
	 * 玩家存活单位数量 = 0
	 */
	byte AI_CONDITION_PT_COUNT_E_0 = 19;
	/**
	 * 玩家存活单位数量 = 1
	 */
	byte AI_CONDITION_PT_COUNT_E_1 = 20;
	/**
	 * 玩家存活单位数量 = 2
	 */
	byte AI_CONDITION_PT_COUNT_E_2 = 21;
	/**
	 * 怪物怪物数量 = 10
	 */
	byte AI_CONDITION_T_COUNT_E_10 = 22;
	/**
	 * 怪物怪物数量 >= 8
	 */
	byte AI_CONDITION_T_COUNT_GE_8 = 23;
	/**
	 * 怪物怪物数量 >= 5
	 */
	byte AI_CONDITION_T_COUNT_GE_5 = 24;
	/**
	 * 怪物怪物数量 < 5
	 */
	byte AI_CONDITION_T_COUNT_L_5 = 25;
	/**
	 * 怪物怪物数量 < 4
	 */
	byte AI_CONDITION_T_COUNT_L_4 = 26;
	/**
	 * 怪物怪物数量 <= 1
	 */
	byte AI_CONDITION_T_COUNT_LE_1 = 27;
	/**
	 * 无效设置
	 */
	byte AI_CONDITION_NONE = 28;
	/**
	 * 怪物平均等级小于玩家平均等级
	 */
	byte AI_CONDITION_LEVEL_T_L_PT = 29;
	/**
	 * 怪物平均等级大于等于玩家平均等级
	 */
	byte AI_CONDITION_LEVEL_T_GE_PT = 30;
	/**
	 * 玩家某一单位HP = 100%
	 */
	byte AI_CONDITION_P_HP_E_100 = 31;
	/**
	 * 玩家某一单位HP > 75%
	 */
	byte AI_CONDITION_P_HP_G_75 = 32;
	/**
	 * 玩家某一单位HP > 50%
	 */
	byte AI_CONDITION_P_HP_G_50 = 33;
	/**
	 * 玩家某一单位HP < 50%
	 */
	byte AI_CONDITION_P_HP_L_50 = 34;
	/**
	 * 玩家某一单位HP < 25%
	 */
	byte AI_CONDITION_P_HP_L_25 = 35;
	/**
	 * 玩家阵营有装备远程攻击武器的单位
	 */
	byte AI_CONDITION_P_FAR = 36;
	/**
	 * 玩家阵营没有装备远程攻击武器的单位
	 */
	byte AI_CONDITION_P_NOFAR = 37;
	/**
	 * 玩家阵营存在中毒的单位
	 */
	byte AI_CONDITION_P_POSITION = 38;
	/**
	 * 玩家阵营存在没有中毒的单位
	 */
	byte AI_CONDITION_P_NOPOSITION = 39;
	/**
	 * 玩家阵营存在混乱的单位
	 */
	byte AI_CONDITION_P_CONFUSION = 40;
	/**
	 * 玩家阵营存在没有混乱的单位
	 */
	byte AI_CONDITION_P_NOCONFUSION = 41;
	/**
	 * 玩家阵营存在石化的单位
	 */
	byte AI_CONDITION_P_STONE = 42;
	/**
	 * 玩家阵营存在没有石化的单位
	 */
	byte AI_CONDITION_P_NOSTONE = 43;
	/**
	 * 玩家阵营存在睡眠的单位
	 */
	byte AI_CONDITION_P_SLEEP = 44;
	/**
	 * 玩家阵营存在没有睡眠的单位
	 */
	byte AI_CONDITION_P_NOSLEEP = 45;
	/**
	 * 玩家阵营存在醉酒的单位
	 */
	byte AI_CONDITION_P_INTOXICATION = 46;
	/**
	 * 玩家阵营存在没有醉酒的单位
	 */
	byte AI_CONDITION_P_NOINTOXICATION = 47;
	/**
	 * 玩家阵营存在遗忘的单位
	 */
	byte AI_CONDITION_P_AMNESIA = 48;
	/**
	 * 玩家阵营存在没有遗忘的单位
	 */
	byte AI_CONDITION_P_NOAMNESIA = 49;
	/**
	 * 玩家使用恢复魔法
	 */
	byte AI_CONDITION_P_USE_HUIFU = 50;
	/**
	 * 玩家有存在魔无/魔吸/魔反状态的单位时
	 */
	byte AI_CONDITION_P_MAGIC_WITCHCRAFT = 51;
	/**
	 * 玩家有存在没有魔无/魔吸/魔反状态的单位时
	 */
	byte AI_CONDITION_P_MAGIC_NOWITCHCRAFT = 52;
	/**
	 * 玩家有存在攻无/攻吸/攻反状态的单位时
	 */
	byte AI_CONDITION_P_PHYSICS_WITCHCRAFT = 53;
	/**
	 * 玩家有存在没有攻无/攻吸/攻反状态的单位时
	 */
	byte AI_CONDITION_P_PHYSICS_NOWITCHCRAFT = 54;
	/**
	 * 奇数回合时
	 */
	byte AI_CONDITION_ODD_ROUND = 55;
	/**
	 * 偶数回合时
	 */
	byte AI_CONDITION_EVEN_ROUND = 56;
	/**
	 * 间隔2回合
	 */
	byte AI_CONDITION_INTERVAL_ROUND_2 = 57;
	/**
	 * 当前游戏中时间为白天时
	 */
	byte AI_CONDITION_DAY = 58;
	/**
	 * 当前游戏中时间为夜晚时
	 */
	byte AI_CONDITION_NIGHT = 59;
	/**
	 * 玩家带宠物
	 */
	byte AI_CONDITION_P_HAS_PET = 60;
	/**
	 * 玩家不带宠物
	 */
	byte AI_CONDITION_P_NO_PET = 61;
	/**
	 * 玩家有对象目标怪物0号位单位时 #位置 后排 4 2 0 1 3 前排 9 7 5 6 8
	 */
	byte AI_CONDITION_P_TARGET_0 = 62;
	/**
	 * 玩家有对象目标怪物1号位单位时
	 */
	byte AI_CONDITION_P_TARGET_1 = 63;
	/**
	 * 玩家有对象目标怪物2号位单位时
	 */
	byte AI_CONDITION_P_TARGET_2 = 64;
	/**
	 * 玩家有对象目标怪物3号位单位时
	 */
	byte AI_CONDITION_P_TARGET_3 = 65;
	/**
	 * 玩家有对象目标怪物4号位单位时
	 */
	byte AI_CONDITION_P_TARGET_4 = 66;
	/**
	 * 玩家有对象目标怪物5号位单位时
	 */
	byte AI_CONDITION_P_TARGET_5 = 67;
	/**
	 * 玩家有对象目标怪物6号位单位时
	 */
	byte AI_CONDITION_P_TARGET_6 = 68;
	/**
	 * 玩家有对象目标怪物7号位单位时
	 */
	byte AI_CONDITION_P_TARGET_7 = 69;
	/**
	 * 玩家有对象目标怪物8号位单位时
	 */
	byte AI_CONDITION_P_TARGET_8 = 70;
	/**
	 * 玩家有对象目标怪物9号位单位时
	 */
	byte AI_CONDITION_P_TARGET_9 = 71;
	/**
	 * 玩家没有对象目标怪物0号位单位时 #位置 后排 4 2 0 1 3 前排 9 7 5 6 8
	 */
	byte AI_CONDITION_P_NOTARGET_0 = 72;
	/**
	 * 玩家没有对象目标怪物1号位单位时
	 */
	byte AI_CONDITION_P_NOTARGET_1 = 73;
	/**
	 * 玩家没有对象目标怪物2号位单位时
	 */
	byte AI_CONDITION_P_NOTARGET_2 = 74;
	/**
	 * 玩家没有对象目标怪物3号位单位时
	 */
	byte AI_CONDITION_P_NOTARGET_3 = 75;
	/**
	 * 玩家没有对象目标怪物4号位单位时
	 */
	byte AI_CONDITION_P_NOTARGET_4 = 76;
	/**
	 * 玩家没有对象目标怪物5号位单位时
	 */
	byte AI_CONDITION_P_NOTARGET_5 = 77;
	/**
	 * 玩家没有对象目标怪物6号位单位时
	 */
	byte AI_CONDITION_P_NOTARGET_6 = 78;
	/**
	 * 玩家没有对象目标怪物7号位单位时
	 */
	byte AI_CONDITION_P_NOTARGET_7 = 79;
	/**
	 * 玩家没有对象目标怪物8号位单位时
	 */
	byte AI_CONDITION_P_NOTARGET_8 = 80;
	/**
	 * 玩家没有对象目标怪物9号位单位时
	 */
	byte AI_CONDITION_P_NOTARGET_9 = 81;
	/**
	 * 玩家只有1个存活的玩家
	 */
	byte AI_CONDITION_P_COUNT_E_1 = 82;
	/**
	 * 玩家超过1个存活的玩家
	 */
	byte AI_CONDITION_P_COUNT_G_1 = 83;
	/**
	 * 玩家超过2个存活的玩家
	 */
	byte AI_CONDITION_P_COUNT_G_2 = 84;
	/**
	 * 玩家超过3个存活的玩家
	 */
	byte AI_CONDITION_P_COUNT_G_3 = 85;
	/**
	 * 玩家有5个存活的玩家
	 */
	byte AI_CONDITION_P_COUNT_E_5 = 86;
	/**
	 * 回合数是4的倍数
	 */
	byte AI_CONDITION_GROUND_M_4 = 87;
	/**
	 * 回合数是5的倍数
	 */
	byte AI_CONDITION_GROUND_M_5 = 88;
	/**
	 * 第一回合
	 */
	byte AI_CONDITION_GROUND_E_1 = 89;
	/**
	 * 怪物自身MP < 25%
	 */
	byte AI_CONDITION_S_MP_L_25 = 90;
	/**
	 * 怪物自身MP < 15%
	 */
	byte AI_CONDITION_S_MP_L_15 = 91;
	/**
	 * 怪物自身MP < 5%
	 */
	byte AI_CONDITION_S_MP_L_5 = 92;
	
	/**
	 * 怪物自身
	 */
	byte AI_TARGET_SELF = 0;
	/**
	 * 怪物随机
	 */
	byte AI_TARGET_T_RANDOM = 1;
	/**
	 * 玩家随机
	 */
	byte AI_TARGET_PT_RANDOM = 2;
	/**
	 * 怪物血多者 如果多余一个则随机取其中一个
	 */
	byte AI_TARGET_T_HP_MOST = 3;
	/**
	 * 玩家血多者 如果多余一个则随机取其中一个
	 */
	byte AI_TARGET_PT_HP_MOST = 4;
	/**
	 * 怪物血少者 如果多余一个则随机取其中一个
	 */
	byte AI_TARGET_T_HP_LOW = 5;
	/**
	 * 玩家血少者 如果多余一个则随机取其中一个
	 */
	byte AI_TARGET_P_HP_LOW = 6;
	/**
	 * 怪物随机
	 */
	byte AI_TARGET_T_RANDOM_EX = 7;
	/**
	 * 玩家随机
	 */
	byte AI_TARGET_PT_RANDOM_EX = 8;
	/**
	 * 怪物阵营中毒单位
	 */
	byte AI_TARGET_T_POSITION = 9;
	/**
	 * 玩家阵营中毒单位
	 */
	byte AI_TARGET_P_POSITION = 10;
	/**
	 * 怪物阵营混乱单位
	 */
	byte AI_TARGET_T_CONFUSION = 11;
	/**
	 * 玩家阵营混乱单位
	 */
	byte AI_TARGET_P_CONFUSION = 12;
	/**
	 * 怪物阵营石化的单位
	 */
	byte AI_TARGET_T_STONE = 13;
	/**
	 * 玩家阵营石化的单位
	 */
	byte AI_TARGET_P_STONE = 14;
	/**
	 * 怪物阵营睡眠的单位
	 */
	byte AI_TARGET_T_SLEEP = 15;
	/**
	 * 玩家阵营睡眠的单位
	 */
	byte AI_TARGET_P_SLEEP = 16;
	/**
	 * 怪物阵营醉酒的单位
	 */
	byte AI_TARGET_T_INTOXICATION = 17;
	/**
	 * 玩家阵营醉酒的单位
	 */
	byte AI_TARGET_P_INTOXICATION = 18;
	/**
	 * 怪物阵营遗忘的单位
	 */
	byte AI_TARGET_T_AMNESIA = 19;
	/**
	 * 玩家阵营遗忘的单位
	 */
	byte AI_TARGET_P_AMNESIA = 20;
	/**
	 * 玩家阵营使用远程武器的单位
	 */
	byte AI_TARGET_P_FAR = 21;
	/**
	 * 玩家阵营使用近战武器的单位
	 */
	byte AI_TARGET_P_NEAR = 22;
	/**
	 * 怪物阵营魔无/魔吸/魔反状态的单位
	 */
	byte AI_TARGET_T_MAGIC_WITCHCRAFT = 23;
	/**
	 * 玩家阵营魔无/魔吸/魔反状态的单位
	 */
	byte AI_TARGET_PT_MAGIC_WITCHCRAFT = 24;
	/**
	 * 怪物阵营攻无/攻吸/攻反状态的单位
	 */
	byte AI_TARGET_T_PHYSICS_WITCHCRAFT = 25;
	/**
	 * 玩家阵营攻无/攻吸/攻反状态的单位
	 */
	byte AI_TARGET_PT_PHYSICS_WITCHCRAFT = 26;
	/**
	 * 怪物阵营恢复魔法效果的单位
	 */
	byte AI_TARGET_T_USE_HUIFU = 27;
	/**
	 * 玩家阵营恢复魔法效果的单位
	 */
	byte AI_TARGET_PT_USE_HUIFU = 28;
	/**
	 * 我方阵营男性单位（图档）
	 */
	byte AI_TARGET_PT_MALE = 29;
	/**
	 * 我方阵营女性单位（图档）
	 */
	byte AI_TARGET_PT_FEMALE = 30;
	/**
	 * 我方阵营随机玩家单位
	 */
	byte AI_TARGET_PT_PLAYER_RANDOM = 31;
	/**
	 * 我方阵营随机宠物单位
	 */
	byte AI_TARGET_PT_PET_RANDOM = 32;
	/**
	 * 玩家阵营没有魔无/魔吸/魔反状态的单位
	 */
	byte AI_TARGET_PT_MAGIC_NOWITCHCRAFT = 33;
	/**
	 * 玩家阵营没有攻无/攻吸/攻反状态的单位
	 */
	byte AI_TARGET_PT_PHYSICS_NOWITCHCRAFT = 34;
	/**
	 * 未中异常状态单位,中毒
	 */
	byte AI_TARGET_P_NOPOSITION = 35;
	/**
	 * 未中异常状态单位,混乱
	 */
	byte AI_TARGET_P_NOCONFUSION = 36;
	/**
	 * 未中异常状态单位,石化
	 */
	byte AI_TARGET_P_NOSTONE = 37;
	/**
	 * 未中异常状态单位,昏睡
	 */
	byte AI_TARGET_P_NOSLEEP = 38;
	/**
	 * 未中异常状态单位,酒醉
	 */
	byte AI_TARGET_P_NOINTOXICATION = 39;
	/**
	 * 未中异常状态单位,遗忘
	 */
	byte AI_TARGET_P_NOAMNESIA = 40;
	/**
	 * 敌方阵营没有恢复魔法效果的单位
	 */
	byte AI_TARGET_T_NOHUIFU = 41;
	/**
	 * 敌方阵营没有魔无/魔吸/魔反状态的单位
	 */
	byte AI_TARGET_T_MAGIC_NOWITCHCRAFT = 42;
	/**
	 * 敌方阵营没有攻无/攻吸/攻反状态的单位
	 */
	byte AI_TARGET_T_PHYSICS_NOWITCHCRAFT = 43;
	
	int getId();
	
	AiInfo[] getAiInfos();
	
	public static interface AiInfo {
		
		byte getCondition();
		
		byte getTargetType();
		
		int getSkillCode();
		
		byte getRate();
		
	}

}
