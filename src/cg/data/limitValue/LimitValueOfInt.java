package cg.data.limitValue;

public interface LimitValueOfInt {
	
	int getMaxValue();
	
	int getMinValue();
	
	boolean getCanEqualMinValue();
	
	boolean getCanEqualMaxValue();
	
	public static interface ValueOfInt {
		
		int getValue();
		
		boolean getCanEqual();
		
	}

}
