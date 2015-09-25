package cg.data.item;

import cg.base.item.ItemInfo;

import com.google.common.collect.ListMultimap;
import com.google.common.collect.Range;

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
	
	Range<Short> getDurable();
	
	Range<Byte> getAttackCount();
	
	boolean getIsPrecent();
	
	Range<Integer> getAttribute(String type, byte valueType);
	
	ListMultimap<String, Byte> getAttributeTypes();
	
	Range<Byte> getLuck();
	
	short getSpecialType();
	
	int[] getSubTypeParam();
	
	boolean getCanComposite();
	
	byte getIdentifyRate();
	
	Range<Short> getMagicAttack();
	
	byte getElementAttribute_1();
	
	byte getElementAttribute_2();
	
	byte getElementAttributeValue_1();
	
	byte getElementAttributeValue_2();
	
	short getGemWeaponType();
	
	short getGemArmorType();

}
