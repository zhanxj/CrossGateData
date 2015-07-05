package cg.data.resource;

import cg.base.animation.AnimationReader;
import cg.base.image.ImageManager;
import cg.base.log.Log;
import cg.base.reader.CAnimationReader;
import cg.base.time.Timer;

public class AnimationReaderCreator implements Reloadable {
	
	protected AnimationReader animationReader;
	
	protected Log log;
	
	protected String clientFilePath;
	
	protected Timer timer;
	
	protected ImageManager imageManager;
	
	public AnimationReaderCreator(Log log, String clientFilePath, Timer timer, ImageManager imageManager) {
		this.log = log;
		this.clientFilePath = clientFilePath;
		this.timer = timer;
		this.imageManager = imageManager;
	}
	
	@Override
	public void reload() throws Exception {
		animationReader = new CAnimationReader(log, clientFilePath, imageManager, timer);
	}
	
	public AnimationReader getAnimationReader() {
		return animationReader;
	}

}
