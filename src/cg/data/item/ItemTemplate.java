package cg.data.item;

import java.util.List;
import java.util.Map;

import cg.base.item.ItemInfo;
import cg.data.limitValue.LimitValueOfByte;
import cg.data.limitValue.LimitValueOfInt;
import cg.data.limitValue.LimitValueOfShort;

public interface ItemTemplate extends ItemInfo {
	
	byte NO_ITEM_ID = -1;
	
	byte SUB_TYPE_1_SKILL_COST = 0;
	
	byte SUB_TYPE_1_LEVEL = 1;
	
	byte SUB_TYPE_1_SUCCESS_RATE = 2;
	
	byte SUB_TYPE_1_UNIT_TYPE = 3;
	
	byte SUB_TYPE_1_ENCOUNT_UPGRADE = 100;
	
	short SUB_TYPE_1_ENCOUNT_LOWER = 250;
	
	byte SUB_TYPE_2_ELEMENT = 0;
	
	byte SUB_TYPE_2_VALUE = 1;
	
	String getUnidentifyName();
	
	String getIdentifyName();
	
	int getBuyPrice();
	
	int getSellPrice();
	
	short getGroupSize();
	
	String getUseEffect();
	
	String getUseInit();
	
	String getUseProcess();
	
	String getDropProcess();
	
	String getPickupProcess();
	
	boolean getDoubleHand();
	
	boolean getCanDoubleClick();
	
	LimitValueOfShort getDurable();
	
	LimitValueOfByte getAttackCount();
	
	boolean getIsPrecent();
	
	LimitValueOfInt getAttribute(String type, byte valueType);
	
	Map<String, List<Byte>> getAttributeTypes();
	
	LimitValueOfByte getLuck();
	
	short getSpecialType();
	
	int[] getSubTypeParam();
	
	boolean getCanComposite();
	
	byte getIdentifyRate();
	
	LimitValueOfShort getMagicAttack();
	
	byte getElementAttribute_1();
	
	byte getElementAttribute_2();
	
	byte getElementAttributeValue_1();
	
	byte getElementAttributeValue_2();
	
	short getGemWeaponType();
	
	short getGemArmorType();

}
