package cg.data.limitValue;

public interface LimitValueOfByte {
	
	byte getMaxValue();
	
	byte getMinValue();
	
	boolean getCanEqualMinValue();
	
	boolean getCanEqualMaxValue();
	
	public static interface ValueOfByte {
		
		byte getValue();
		
		boolean getCanEqual();
		
	}

}
