package cg.data.battle.skill;

import java.util.List;

public interface Shot {
	
	int TRUE = 1;
	
	int FALSE = 0;
	
	int[] getTargetQueue(int index, int count, List<Integer> list);

}
