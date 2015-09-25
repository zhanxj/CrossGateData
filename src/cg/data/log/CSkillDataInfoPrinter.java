package cg.data.log;

import java.util.Iterator;
import java.util.Map;

import cg.base.util.MathUtil;
import cg.data.battle.skill.SkillLevelData;

import com.google.common.collect.Maps;

public class CSkillDataInfoPrinter extends AbstractInfoPrinter<SkillLevelData> {

	@Override
	public void print(Map<?, ?> map) {
		setOutputFile(false);
		@SuppressWarnings("unchecked")
		Map<Integer, SkillLevelData> skillDatas = (Map<Integer, SkillLevelData>) map;
		Map<Short, Short> targetTypes = Maps.newHashMap();
		Iterator<Integer> keys = skillDatas.keySet().iterator();
		while (keys.hasNext()) {
			Short targetType = skillDatas.get(keys.next()).getTargetType();
			targetTypes.put(targetType, targetType);
		}
		Iterator<Short> targetTypeKeys = targetTypes.keySet().iterator();
		while (targetTypeKeys.hasNext()) {
			short key = targetTypeKeys.next();
			System.out.println(MathUtil.shortToBinaryString(key) + "\t" + key);
		}
	}

	@Override
	protected String getFileName() {
		return "CSkillDataInfoPrinter";
	}

}
