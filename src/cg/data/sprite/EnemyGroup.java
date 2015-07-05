package cg.data.sprite;

public interface EnemyGroup {
	
	byte ENEMY_MAX_COUNT = 10;
	
	byte LOCAL_RANDOM = -1;
	
	String getName();
	
	byte[] getEnemyLocals();
	
	int getId();
	
	int getNeedItemId();
	
	int getForbitItemId();
	
	SingleGroupInfo[] getSingleGroupInfos();
	
	public static interface SingleGroupInfo {
		
		int getEnemyId();
		
		byte getRate();
		
		boolean getIsMustAppear();
		
	}

}
