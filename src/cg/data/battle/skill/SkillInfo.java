package cg.data.battle.skill;

import java.util.Collection;

import cg.base.skill.SkillTemplate;

public interface SkillInfo extends SkillTemplate {
	
	SkillLevelData getSkillLevelData(int skillCode);
	
	Collection<SkillLevelData> getSkillLevelDatas();

}
