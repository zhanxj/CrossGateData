package cg.data.limitValue;

import java.util.Random;

import com.google.common.collect.Range;

import cg.data.limitValue.LimitValueOfByte.ValueOfByte;
import cg.data.limitValue.LimitValueOfInt.ValueOfInt;
import cg.data.limitValue.LimitValueOfShort.ValueOfShort;

public class LimitValueFactory {
	
	private static final Random random = new Random();
	
	protected static class SingletonHolder {
		
		private static LimitValueFactory instance = new LimitValueFactory();
		
	}
	
	public static LimitValueFactory getInstance() {  
		return SingletonHolder.instance;  
	}
	
	private LimitValueFactory() {}
	
	public ValueOfByte createValueOfByte(final byte value, final boolean canEqual) {
		return new ValueOfByte() {
			
			@Override
			public byte getValue() {
				return value;
			}
			
			@Override
			public boolean getCanEqual() {
				return canEqual;
			}
			
		};
	}
	
	public LimitValueOfByte createLimitValue(final byte min, final byte max, final boolean equalMin, final boolean equalMax) {
		return new LimitValueOfByte() {
			
			@Override
			public String toString() {
				return "min = " + min + " ; max = " + max;
			}

			@Override
			public byte getMaxValue() {
				return max;
			}

			@Override
			public byte getMinValue() {
				return min;
			}

			@Override
			public boolean getCanEqualMinValue() {
				return equalMin;
			}

			@Override
			public boolean getCanEqualMaxValue() {
				return equalMax;
			}
			
		};
	}
	
	public LimitValueOfByte createLimitValue(final byte min, final byte max) {
		return createLimitValue(min, max, true, true);
	}
	
	public LimitValueOfByte createLimitValue(final ValueOfByte min, final ValueOfByte max) {
		return createLimitValue(min.getValue(), max.getValue(), min.getCanEqual(), max.getCanEqual());
	}
	
	public ValueOfShort createValueOfShort(final short value, final boolean canEqual) {
		return new ValueOfShort() {
			
			@Override
			public short getValue() {
				return value;
			}
			
			@Override
			public boolean getCanEqual() {
				return canEqual;
			}
			
		};
	}
	
	public LimitValueOfShort createLimitValue(final short min, final short max, final boolean equalMin, final boolean equalMax) {
		return new LimitValueOfShort() {
			
			@Override
			public String toString() {
				return "[min = " + min + " , max = " + max + "]";
			}
			
			@Override
			public short getMinValue() {
				return min;
			}
			
			@Override
			public short getMaxValue() {
				return max;
			}

			@Override
			public boolean getCanEqualMinValue() {
				return equalMin;
			}

			@Override
			public boolean getCanEqualMaxValue() {
				return equalMax;
			}
			
		};
	}
	
	public LimitValueOfShort createLimitValue(final short min, final short max) {
		return createLimitValue(min, max, true, true);
	}
	
	public LimitValueOfShort createLimitValue(final ValueOfShort min, final ValueOfShort max) {
		return createLimitValue(min.getValue(), max.getValue(), min.getCanEqual(), max.getCanEqual());
	}
	
	public ValueOfInt createValueOfInt(final int value, final boolean canEqual) {
		return new ValueOfInt() {
			
			@Override
			public int getValue() {
				return value;
			}
			
			@Override
			public boolean getCanEqual() {
				return canEqual;
			}
			
		};
	}
	
	public LimitValueOfInt createLimitValue(final int min, final int max, final boolean equalMin, final boolean equalMax) {
		return new LimitValueOfInt() {
			
			@Override
			public String toString() {
				return "min = " + min + " ; max = " + max;
			}
			
			@Override
			public int getMinValue() {
				return min;
			}
			
			@Override
			public int getMaxValue() {
				return max;
			}

			@Override
			public boolean getCanEqualMinValue() {
				return equalMin;
			}

			@Override
			public boolean getCanEqualMaxValue() {
				return equalMax;
			}
			
		};
	}
	
	public LimitValueOfInt createLimitValue(final int min, final int max) {
		return createLimitValue(min, max, true, true);
	}
	
	public LimitValueOfInt createLimitValue(final ValueOfInt min, final ValueOfInt max) {
		return createLimitValue(min.getValue(), max.getValue(), min.getCanEqual(), max.getCanEqual());
	}
	
	public int random(LimitValueOfInt limitValue) {
		int rang = limitValue.getMaxValue() - limitValue.getMinValue() + (limitValue.getCanEqualMaxValue() ? 1 : 0) + (limitValue.getCanEqualMinValue() ? 0 : -1);
		return random(rang, limitValue.getMinValue());
	}
	
	public short random(LimitValueOfShort limitValue) {
		int rang = limitValue.getMaxValue() - limitValue.getMinValue() + (limitValue.getCanEqualMaxValue() ? 1 : 0) + (limitValue.getCanEqualMinValue() ? 0 : -1);
		return (short) random(rang, limitValue.getMinValue());
	}
	
	public byte random(LimitValueOfByte limitValue) {
		int rang = limitValue.getMaxValue() - limitValue.getMinValue() + (limitValue.getCanEqualMaxValue() ? 1 : 0) + (limitValue.getCanEqualMinValue() ? 0 : -1);
		return (byte) random(rang, limitValue.getMinValue());
	}
	
	private int random(int rang, int min) {
		return random.nextInt(rang) + min;
	}
	
	public Range<Integer> getRange(ValueOfInt min, ValueOfInt max) {
		if (min.getCanEqual()) {
			return max.getCanEqual() ? Range.closed(min.getValue(), max.getValue()) : Range.closedOpen(min.getValue(), max.getValue());
		} else {
			return max.getCanEqual() ? Range.openClosed(min.getValue(), max.getValue()) : Range.open(min.getValue(), max.getValue());
		}
	}
	
	public Range<Short> getRange(ValueOfShort min, ValueOfShort max) {
		if (min.getCanEqual()) {
			return max.getCanEqual() ? Range.closed(min.getValue(), max.getValue()) : Range.closedOpen(min.getValue(), max.getValue());
		} else {
			return max.getCanEqual() ? Range.openClosed(min.getValue(), max.getValue()) : Range.open(min.getValue(), max.getValue());
		}
	}
	
	public Range<Byte> getRange(ValueOfByte min, ValueOfByte max) {
		if (min.getCanEqual()) {
			return max.getCanEqual() ? Range.closed(min.getValue(), max.getValue()) : Range.closedOpen(min.getValue(), max.getValue());
		} else {
			return max.getCanEqual() ? Range.openClosed(min.getValue(), max.getValue()) : Range.open(min.getValue(), max.getValue());
		}
	}

}
