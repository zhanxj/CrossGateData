package cg.data.sprite;

public interface CreatureTemplate {
	
	byte RACE_HUMAN = 0;
	
	byte RACE_DRAGON = 1;
	
	byte RACE_UNDEAD = 2;
	
	byte RACE_FLY = 3;
	
	byte RACE_INSECT = 4;
	
	byte RACE_PLANT = 5;
	
	byte RACE_BEAST = 6;
	
	byte RACE_AMORPHAS = 7;
	
	byte RACE_METAL = 8;
	
	byte RACE_BOSS = 9;
	
	byte RACE_ALL = 10;
	
	String getName();
	
	int getId();
	
	short getBasePointCount();
	
	byte getBasePointFloat();
	
	byte getRace();
	
	short getAttributeValue(String attributeType, byte type);
	
	short getDifficultyOfCatch();
	
	byte getCardLevel();
	
	byte getNeedCharm();
	
	byte[] getElements();
	
	byte getCardType();
	
	byte getSkillAmount();
	
	int getCardFileId();
	
	int getAnimationId();
	
	boolean getCanCatch();
	
	int[] getSkillIds();

}
