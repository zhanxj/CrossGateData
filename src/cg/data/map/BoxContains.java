package cg.data.map;

public interface BoxContains {
	
	String TYPE_ITEM = "ITEM";
	
	String TYPE_GOLD = "GOLD";
	
	byte getId();
	
	int getValue();
	
	byte getCount();
	
	byte getRate();
	
	String getType();

}
