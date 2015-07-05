package cg.data.gmsvReader;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import cg.base.util.MathUtil;
import cg.data.item.DropItemGroup;
import cg.data.item.DropItemGroup.DropItem;
import cg.data.map.GatherArea;
import cg.data.map.GatherArea.GatherInfo;
import cg.data.map.MapArea;
import cg.data.map.ReaderMapArea;
import cg.data.resource.ObjectReader;
import cg.data.resource.ProjectData;

public class CGatherAreaReader implements ObjectReader<GatherArea> {

	@Override
	public List<GatherArea> read(ProjectData projectData) {
		String[] lines = projectData.getTextResource("techarea");
		List<GatherArea> list = new ArrayList<GatherArea>(lines.length);
		for (String line : lines) {
			list.add(new CGatherArea(line));
		}
		return list;
	}
	
	private static class CGatherInfo implements GatherInfo {
		
		private static final byte DROP_ITEM_COUNT = 10;
		
		private String name;
		
		private int id;
		
		private short skillId, failRate;
		
		private DropItemGroup itemGroup;
		
		public CGatherInfo(String[] infos) {
			name = infos[0];
			id = MathUtil.stringToInt(infos[1]);
			skillId = MathUtil.stringToShort(infos[2]);
			// 2, 3, 4, 5, 11
			failRate = MathUtil.stringToShort(infos[12]);
			List<DropItem> list = new LinkedList<DropItem>();
			for (int i = 0;i < DROP_ITEM_COUNT;i++) {
				list.add(new CDropItem(MathUtil.stringToInt(infos[13 + i]), MathUtil.stringToInt(infos[23 + i], 100)));
			}
			itemGroup = new CDropItemGroup(list.toArray(new DropItem[list.size()]));
		}

		@Override
		public String getName() {
			return name;
		}

		@Override
		public int getId() {
			return id;
		}

		@Override
		public short getSkillId() {
			return skillId;
		}

		@Override
		public short getFailRate() {
			return failRate;
		}

		@Override
		public DropItemGroup getDropItems() {
			return itemGroup;
		}
		
	}
	
	private static class CGatherArea implements GatherArea {
		
		private GatherInfo gatherInfo;
		
		private MapArea area;
		
		public CGatherArea(String line) {
			String[] infos = line.split("\t", -2);
			gatherInfo = new CGatherInfo(infos);
			area = new ReaderMapArea(infos, 6);
		}

		@Override
		public GatherInfo getGatherInfo() {
			return gatherInfo;
		}

		@Override
		public MapArea getArea() {
			return area;
		}
		
	}

	private static class CDropItem implements DropItem {
		
		private static final byte MAX_COUNT = 3;
		
		private int itemId, rate;
		
		public CDropItem(int itemId, int rate) {
			this.itemId = itemId;
			this.rate = rate;
		}
	
		public int getItemId() {
			return itemId;
		}
	
		public int getRate() {
			return rate;
		}

		@Override
		public int getMaxCount() {
			return MAX_COUNT;
		}
	
	}
	
	private static class CDropItemGroup implements DropItemGroup {
		
		private DropItem[] dropItems;
		
		private int totalRate;
		
		public CDropItemGroup(DropItem[] dropItems) {
			this.dropItems = dropItems;
			for (DropItem dropItem : dropItems) {
				totalRate += dropItem.getRate();
			}
		}
	
		@Override
		public DropItem[] getDropItems() {
			return dropItems;
		}
	
		@Override
		public int getTotalRate() {
			return totalRate;
		}
		
	}

	@Override
	public void output(File outFile, Collection<GatherArea> collection)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

}
