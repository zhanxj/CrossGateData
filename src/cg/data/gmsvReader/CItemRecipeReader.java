package cg.data.gmsvReader;

import java.io.File;
import java.util.Collection;
import java.util.List;

import cg.base.item.ItemRecipe;
import cg.base.item.ItemRecipe.MaterialInfo;
import cg.base.util.MathUtil;
import cg.data.resource.ObjectReader;
import cg.data.resource.ProjectData;

import com.google.common.collect.Lists;

public class CItemRecipeReader implements ObjectReader<ItemRecipe> {

	@Override
	public List<ItemRecipe> read(ProjectData projectData) {
		String[] lines = projectData.getTextResource("itemrecipe");
		List<ItemRecipe> itemRecipes = Lists.newArrayListWithCapacity(lines.length);
		for (String line : lines) {
			itemRecipes.add(new CItemRecipe(line.split("\t", -2)));
		}
		return itemRecipes;
	}
	
	private static class CItemRecipe implements ItemRecipe {
		
		private String name;
		
		private short id;
		
		private int itemId;
		
		private short skillId;
		
		private MaterialInfo[] materials;
		
		public CItemRecipe(String[] infos) {
			name = infos[0];
			id = MathUtil.stringToShort(infos[1]);
			itemId = MathUtil.stringToInt(infos[2]);
			skillId = MathUtil.stringToShort(infos[3]);
			// 4 {0, 1, 10, 15, 45, 60, 120}
			materials = new MaterialInfo[5];
			for (int i = 0;i < materials.length;i++) {
				materials[i] = new CMaterialInfo(MathUtil.stringToInt(infos[5 + i]), MathUtil.stringToByte(infos[10 + i]));
			}
		}

		@Override
		public String getName() {
			return name;
		}

		@Override
		public short getId() {
			return id;
		}

		@Override
		public int getItemId() {
			return itemId;
		}

		@Override
		public short getSkillId() {
			return skillId;
		}

		@Override
		public MaterialInfo[] getMaterials() {
			return materials;
		}
		
	}
	
	private static class CMaterialInfo implements MaterialInfo {
		
		private final int itemId;
		
		private final byte needAmount;
		
		public CMaterialInfo(int itemId, byte needAmount) {
			this.itemId = itemId;
			this.needAmount = needAmount;
		}

		@Override
		public int getItemId() {
			return itemId;
		}

		@Override
		public byte getNeedAmount() {
			return needAmount;
		}
		
	}

	@Override
	public void output(File outFile, Collection<ItemRecipe> collection)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

}
