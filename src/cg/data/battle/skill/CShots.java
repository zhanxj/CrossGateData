package cg.data.battle.skill;

import java.util.Map;

import cg.data.resource.ProjectData;

import com.google.common.collect.Maps;

public class CShots {
	
	private Map<String, Shot> shots;
	
	public CShots(ProjectData projectData) {
		shots = Maps.newHashMap();
		CSpiracleShot spiracleShot = new CSpiracleShot();
		projectData.addListener(spiracleShot);
		shots.put(SkillLevelData.TECH_SpiracleShot, spiracleShot);
		shots.put(SkillLevelData.TECH_RandomShot, new CRandomShot());
	}
	
	public Shot getShot(SkillLevelData skillData) {
		return getShot(skillData.getTechType());
	}
	
	public Shot getShot(String techType) {
		return shots.get(techType);
	}

}
