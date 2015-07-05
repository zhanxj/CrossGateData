package cg.data.attribute;

public interface BirthData {
	
	byte getUnitType();
	
	double getAttributeValue(String attributeType, byte type);
	
	short[] getSkillIds();
	
	byte getBrithBP();
	
	byte getLevelUpBp();

}
