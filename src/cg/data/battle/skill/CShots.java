package cg.data.battle.skill;

import java.util.HashMap;
import java.util.Map;

import cg.data.resource.ProjectData;

public class CShots {
	
	private Map<String, Shot> shots;
	
	public CShots(ProjectData projectData) {
		shots = new HashMap<String, Shot>();
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
