package cg.data.battle.skill;

import java.util.List;

import cg.base.util.MathUtil;

class CRandomShot implements Shot {

	@Override
	public int[] getTargetQueue(int index, int count, List<Integer> list) {
		int[] ret = new int[count];
		int size = list.size();
		for (int i = 0;i < count;i++) {
			ret[i] = list.get(MathUtil.getRandom(size));
		}
		return ret;
	}

}
