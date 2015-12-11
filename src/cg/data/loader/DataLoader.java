package cg.data.loader;

import java.net.URI;

import cg.base.animation.AnimationReader;
import cg.base.image.ImageManager;
import cg.base.loader.Loader;
import cg.data.gmsvReader.GMSVReaders;
import cg.data.map.MapReader;
import cg.data.map.WarpManager;
import cg.data.newReader.NewReaders;
import cg.data.resource.AnimationReaderCreator;
import cg.data.resource.MessageManager;
import cg.data.resource.ProjectData;
import cg.data.resource.ReadImageResourceManager;
import cg.data.resource.ReloadManager;
import cg.data.resource.Reloadable;
import cg.data.title.TitleManager;

public abstract class DataLoader extends Loader implements IDataPlatform {
	
	protected ReloadManager reloadManager;
	
	protected ProjectData projectData;
	
	protected MessageManager messageManager;
	
	protected byte model;
	
	protected TitleManager titleManager;
	
	protected WarpManager warpManager;
	
	protected MapReader mapReader;
	
	protected URI serverFilePath;
	
	protected AnimationReaderCreator animationReaderCreator;

	@Override
	protected final void loadMore() {
		try {
			serverFilePath = loadServerFilePath();
		} catch (Exception e) {
			log.error("", e);
		}
		model = createModel();
		reloadManager = createReloadManager();
		animationReaderCreator = createAnimationReaderCreator();

		projectData = createProjectData();
		try {
			registerReload();
			loadData();
			reloadManager.reload();
			loadAnimationReader();
		} catch (Exception e) {
			log.error("", e);
			exit();
		}
		messageManager = createMessageManager();
		titleManager = createTitleManager();
		warpManager = createWarpManager();
		mapReader = createMapReader();
		
		loadMore0();
	}
	
	protected abstract void loadMore0();
	
	protected void registerReload() throws Exception {
		reloadManager.register(ProjectData.class.getName(), projectData);
		reloadManager.register(ImageManager.class.getName(), (Reloadable) imageManager);
		reloadManager.register(AnimationReaderCreator.class.getName(), animationReaderCreator);
	}
	
	private void loadData() {
		projectData.addObjectReader(GMSVReaders.createBoxContainsReader());
		projectData.addObjectReader(GMSVReaders.createDungeonReader(imageManager));
		projectData.addObjectReader(GMSVReaders.createEncountInfoReader());
		projectData.addObjectReader(GMSVReaders.createEnemyAiReader());
		projectData.addObjectReader(GMSVReaders.createEnemyBaseInfoReader());
		projectData.addObjectReader(GMSVReaders.createEnemyGroupReader());
		projectData.addObjectReader(GMSVReaders.createEnemyReader());
		projectData.addObjectReader(GMSVReaders.createEnemyTalkReader());
		projectData.addObjectReader(GMSVReaders.createGarbledReader());
		projectData.addObjectReader(GMSVReaders.createGatherAreaReader());
		projectData.addObjectReader(GMSVReaders.createItemReader(messageManager));
		projectData.addObjectReader(GMSVReaders.createItemRecipeReader());
		projectData.addObjectReader(GMSVReaders.createJobReader());
		projectData.addObjectReader(GMSVReaders.createMessageReader());
		projectData.addObjectReader(GMSVReaders.createNPCReader());
		projectData.addObjectReader(GMSVReaders.createSkillDataReader(messageManager));
		projectData.addObjectReader(GMSVReaders.createSkillTemplateReader(messageManager));
		projectData.addObjectReader(GMSVReaders.createTitleConfigReader());
		projectData.addObjectReader(GMSVReaders.createTitleReader());
		projectData.addObjectReader(GMSVReaders.createWarpReader());
		projectData.addObjectReader(NewReaders.createRoleAnimationInfoReader(imageManager, animationReaderCreator));
	}
	
	protected abstract byte createModel();
	
	protected AnimationReaderCreator createAnimationReaderCreator() {
		return new AnimationReaderCreator(getClientFilePath(), getTimer(), getImageManager());
	}
	
	protected ReloadManager createReloadManager() {
		return new ReloadManager(getTimer());
	}
	
	protected MessageManager createMessageManager() {
		MessageManager messageManager = new MessageManager();
		getProjectData().addListener(messageManager);
		return messageManager;
	}
	
	protected TitleManager createTitleManager() {
		TitleManager titleManager = new TitleManager();
		getProjectData().addListener(titleManager);
		return titleManager;
	}
	
	@Override
	protected ImageManager createImageManager() {
		return new ReadImageResourceManager(getClientFilePath());
	}

	protected abstract ProjectData createProjectData();
	
	protected abstract WarpManager createWarpManager();
	
	protected abstract MapReader createMapReader();
	
	protected abstract URI loadServerFilePath() throws Exception;

	@Override
	protected AnimationReader createAnimationReader() {
		return animationReaderCreator.getAnimationReader();
	}

	@Override
	public final int getVersion() {
		return version;
	}

	@Override
	public final byte getModel() {
		return model;
	}

	@Override
	public final ReloadManager getReloadManager() {
		return reloadManager;
	}

	@Override
	public final ProjectData getProjectData() {
		return projectData;
	}

	@Override
	public final MessageManager getMessageManager() {
		return messageManager;
	}

	@Override
	public final TitleManager getTitleManager() {
		return titleManager;
	}

	@Override
	public final WarpManager getWarpManager() {
		return warpManager;
	}

	@Override
	public final MapReader getMapReader() {
		return mapReader;
	}

}
