package cg.data.gmsvReader;

import cg.base.image.ImageManager;
import cg.base.item.ItemRecipe;
import cg.base.skill.SkillTemplate;
import cg.base.sprite.Title;
import cg.data.ai.EnemyAiInfo;
import cg.data.battle.skill.SkillLevelData;
import cg.data.gmsvReader.CGarbledReader.Garbled;
import cg.data.item.ItemTemplate;
import cg.data.job.Job;
import cg.data.loader.IDataPlatform;
import cg.data.map.BoxContains;
import cg.data.map.GatherArea;
import cg.data.map.MapReader;
import cg.data.map.Warp;
import cg.data.map.dungeon.Dungeon;
import cg.data.resource.MessageManager;
import cg.data.resource.ObjectReader;
import cg.data.sprite.CreatureTemplate;
import cg.data.sprite.EncountInfo;
import cg.data.sprite.EnemyGroup;
import cg.data.sprite.EnemyInfo;
import cg.data.sprite.EnemyTalkInfo;
import cg.data.sprite.Message;
import cg.data.sprite.NpcTemplate;
import cg.data.title.TitleConfig;

public final class GMSVReaders {
	
	private GMSVReaders() {}
	
	public static ObjectReader<BoxContains> createBoxContainsReader() {
		return new CBoxContainsReader();
	}
	
	public static ObjectReader<Dungeon> createDungeonReader(ImageManager imageManager) {
		return new CDungeonReader(imageManager);
	}
	
	public static ObjectReader<EncountInfo> createEncountInfoReader() {
		return new CEncountInfoReader();
	}
	
	public static ObjectReader<EnemyAiInfo> createEnemyAiReader() {
		return new CEnemyAiReader();
	}
	
	public static ObjectReader<CreatureTemplate> createEnemyBaseInfoReader() {
		return new CEnemyBaseInfoReader();
	}
	
	public static ObjectReader<EnemyGroup> createEnemyGroupReader() {
		return new CEnemyGroupReader();
	}
	
	public static ObjectReader<EnemyInfo> createEnemyReader() {
		return new CEnemyReader();
	}
	
	public static ObjectReader<EnemyTalkInfo> createEnemyTalkReader() {
		return new CEnemyTalkReader();
	}
	
	public static MapReader createFileMapReader(String pathName, IDataPlatform platform) {
		return new CFileMapReader(pathName, platform);
	}
	
	public static ObjectReader<Garbled> createGarbledReader() {
		return new CGarbledReader();
	}
	
	public static ObjectReader<GatherArea> createGatherAreaReader() {
		return new CGatherAreaReader();
	}
	
	public static ObjectReader<ItemTemplate> createItemReader(MessageManager messageManager) {
		return new CItemReader(messageManager);
	}
	
	public static ObjectReader<ItemRecipe> createItemRecipeReader() {
		return new CItemRecipeReader();
	}
	
	public static ObjectReader<Job> createJobReader() {
		return new CJobReader();
	}
	
	public static ObjectReader<Message> createMessageReader() {
		return new CMessageReader();
	}
	
	public static ObjectReader<NpcTemplate> createNPCReader() {
		return new CNPCReader();
	}
	
	public static ObjectReader<SkillLevelData> createSkillDataReader(MessageManager messageManager) {
		return new CSkillDataReader(messageManager);
	}
	
	public static ObjectReader<SkillTemplate> createSkillTemplateReader(MessageManager messageManager) {
		return new CSkillTemplateReader(messageManager);
	}
	
	public static ObjectReader<TitleConfig> createTitleConfigReader() {
		return new CTitleConfigReader();
	}
	
	public static ObjectReader<Title> createTitleReader() {
		return new CTitleReader();
	}
	
	public static ObjectReader<Warp> createWarpReader() {
		return new CWarpReader();
	}

}
