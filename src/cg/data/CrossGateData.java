package cg.data;

import java.net.URI;

import cg.base.CrossGateBase;
import cg.base.LoadCall;
import cg.base.animation.AnimationReader;
import cg.base.image.ImageManager;
import cg.base.log.Log;
import cg.data.gmsvReader.CBoxContainsReader;
import cg.data.gmsvReader.CDungeonReader;
import cg.data.gmsvReader.CEncountInfoReader;
import cg.data.gmsvReader.CEnemyAiReader;
import cg.data.gmsvReader.CEnemyBaseInfoReader;
import cg.data.gmsvReader.CEnemyGroupReader;
import cg.data.gmsvReader.CEnemyReader;
import cg.data.gmsvReader.CEnemyTalkReader;
import cg.data.gmsvReader.CGarbledReader;
import cg.data.gmsvReader.CGatherAreaReader;
import cg.data.gmsvReader.CItemReader;
import cg.data.gmsvReader.CItemRecipeReader;
import cg.data.gmsvReader.CJobReader;
import cg.data.gmsvReader.CMessageReader;
import cg.data.gmsvReader.CNPCReader;
import cg.data.gmsvReader.CRoleAnimationInfoReader;
import cg.data.gmsvReader.CSkillDataReader;
import cg.data.gmsvReader.CSkillTemplateReader;
import cg.data.gmsvReader.CTitleConfigReader;
import cg.data.gmsvReader.CTitleReader;
import cg.data.gmsvReader.CWarpReader;
import cg.data.map.MapReader;
import cg.data.map.WarpManager;
import cg.data.resource.AnimationReaderCreator;
import cg.data.resource.MessageManager;
import cg.data.resource.ProjectData;
import cg.data.resource.ReadImageResourceManager;
import cg.data.resource.ReloadManager;
import cg.data.resource.Reloadable;
import cg.data.title.TitleManager;

public class CrossGateData extends CrossGateBase {
	
	public static final byte MODEL_LOCAL = 0;
	
	public static final byte MODEL_EDITOR = 1;
	
	public static final byte MODEL_SERVER = 2;
	
	protected static ReloadManager reloadManager;
	
	protected static ProjectData projectData;
	
	protected static MessageManager messageManager;
	
	protected static byte model;
	
	protected static TitleManager titleManager;
	
	protected static WarpManager warpManager;
	
	protected static MapReader mapReader;
	
	protected static URI serverFilePath;
	
	protected abstract static class DataLoader extends Loader {
		
		private AnimationReaderCreator animationReaderCreator;

		public DataLoader(LoadCall call) {
			super(call);
		}

		@Override
		protected void createSimpleObject() {
			super.createSimpleObject();
			try {
				serverFilePath = loadServerFilePath();
			} catch (Exception e) {
				log.error(getClass().getName(), e);
				exit();
			}
			model = getModel();
			reloadManager = createReloadManager();
			animationReaderCreator = createAnimationReaderCreator();
		}

		@Override
		protected void load() {
			try {
				projectData = createProjectData();
				messageManager = createMessageManager();
				titleManager = createTitleManager();
				registerReload();
				loadData();
				reloadManager.reload();
				loadAnimationReader();
			} catch (Exception e) {
				log.error(getClass().getName() + "::run() : " + e.getMessage(), e);
				exit();
			}
			warpManager = createWarpManager();
			mapReader = createMapReader();
		}
		
		protected void registerReload() throws Exception {
			reloadManager.register(ProjectData.class.getName(), projectData);
			reloadManager.register(ImageManager.class.getName(), (Reloadable) imageManager);
			reloadManager.register(AnimationReaderCreator.class.getName(), animationReaderCreator);
		}
		
		protected void loadData() {
			projectData.addObjectReader(new CBoxContainsReader());
			projectData.addObjectReader(new CEnemyReader());
			projectData.addObjectReader(new CEnemyGroupReader());
			projectData.addObjectReader(new CEncountInfoReader());
			projectData.addObjectReader(new CEnemyAiReader());
			projectData.addObjectReader(new CEnemyBaseInfoReader());
			projectData.addObjectReader(new CEnemyTalkReader());
			projectData.addObjectReader(new CGarbledReader(getLog()));
			projectData.addObjectReader(new CItemRecipeReader());
			projectData.addObjectReader(new CItemReader(getMessageManager()));
			projectData.addObjectReader(new CJobReader());
			projectData.addObjectReader(new CMessageReader());
			projectData.addObjectReader(new CNPCReader());
			projectData.addObjectReader(new CSkillDataReader(getMessageManager()));
			projectData.addObjectReader(new CSkillTemplateReader(getMessageManager()));
			projectData.addObjectReader(new CTitleReader());
			projectData.addObjectReader(new CTitleConfigReader());
			projectData.addObjectReader(new CWarpReader());
			projectData.addObjectReader(new CGatherAreaReader());
			projectData.addObjectReader(new CRoleAnimationInfoReader(getImageManager(), animationReaderCreator, getLog()));
			projectData.addObjectReader(new CDungeonReader(getImageManager(), getLog()));
		}
		
		protected abstract byte getModel();
		
		protected AnimationReaderCreator createAnimationReaderCreator() {
			return new AnimationReaderCreator(getLog(), getClientFilePath(), getTimer(), getImageManager());
		}
		
		protected ReloadManager createReloadManager() {
			return new ReloadManager(getLog(), getTimer());
		}
		
		protected MessageManager createMessageManager() {
			MessageManager messageManager = new MessageManager(getLog());
			getProjectData().addListener(messageManager);
			return messageManager;
		}
		
		protected TitleManager createTitleManager() {
			TitleManager titleManager = new TitleManager();
			getProjectData().addListener(titleManager);
			return titleManager;
		}
		
		@Override
		protected ImageManager createImageManager(Log log) {
			return new ReadImageResourceManager(log, getClientFilePath());
		}

		protected abstract ProjectData createProjectData();
		
		protected abstract WarpManager createWarpManager();
		
		protected abstract MapReader createMapReader();
		
		protected abstract URI loadServerFilePath() throws Exception;

		@Override
		protected AnimationReader createAnimationReader() {
			return animationReaderCreator.getAnimationReader();
		}
		
	}
	
	public static int getVersion() {
		return version;
	}
	
	public static byte getModel() {
		return model;
	}
	
	public static ReloadManager getReloadManager() {
		return reloadManager;
	}
	
	public static ProjectData getProjectData() {
		return projectData;
	}
	
	public static MessageManager getMessageManager() {
		return messageManager;
	}
	
	public static TitleManager getTitleManager() {
		return titleManager;
	}
	
	public static WarpManager getWarpManager() {
		return warpManager;
	}
	
	public static MapReader getMapReader() {
		return mapReader;
	}

}
