package cg.data.attribute;

import cg.base.sprite.Attribute;

public interface AttributeEx extends Attribute {
	
	byte SOUL_MAX = 5;
	
	byte INJURED_MAX = 4;
	
	BirthData getBirthData();
	
	void setAttributeCalculator(AttributeCalculator attributeCalculator);
	
	void calculator();
	
	AttributeEx clone();
	
	public static interface AttributeCalculator {
		
		void calculator(AttributeEx attribute);
		
	}

}
