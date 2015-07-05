package cg.data.limitValue;

public interface LimitValueOfShort {
	
	short getMaxValue();
	
	short getMinValue();
	
	boolean getCanEqualMinValue();
	
	boolean getCanEqualMaxValue();
	
	public static interface ValueOfShort {
		
		short getValue();
		
		boolean getCanEqual();
		
	}

}
