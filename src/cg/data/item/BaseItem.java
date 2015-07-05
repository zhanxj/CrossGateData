package cg.data.item;

public interface BaseItem {
	
	byte NO_INSTANCE = -1;
	
	int getId();
	
	int getInstanceId();
	
	String getName();
	
	ItemTemplate getItemTemplate();
	
	void modifyCount(int count);
	
	int getCount();
	
	int getAttribute(String type, byte valueType);
	
	byte getLuck();
	
	short getMagicAttack();
	
	boolean getIdentify();
	
	boolean identify();

}
