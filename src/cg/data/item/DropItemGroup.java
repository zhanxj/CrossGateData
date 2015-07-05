package cg.data.item;

public interface DropItemGroup {
	
	DropItem[] getDropItems();
	
	int getTotalRate();
	
	public static interface DropItem {
		
		byte MIN_COUNT = 1;
		
		int getItemId();
		
		int getRate();
		
		int getMaxCount();
		
	}

}
