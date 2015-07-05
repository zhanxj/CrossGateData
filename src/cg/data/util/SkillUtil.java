package cg.data.util;

import cg.data.battle.skill.SkillLevelData;
import cg.data.battle.skill.SkillLevelData.SelfEffect;

public class SkillUtil {
	
	public static SelfEffect getSelfEffect(SkillLevelData data, String techType) {
		SelfEffect[] effects = data.getSelfEffects();
		for (SelfEffect effect : effects) {
			String type = effect.getType();
			if (type.equals(techType)) {
				return effect;
			}
		}
		return null;
	}

}
