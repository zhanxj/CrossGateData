package cg.data.resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cg.base.animation.AnimationReader;
import cg.base.image.ImageManager;
import cg.base.reader.CAnimationReader;
import cg.base.time.Time;

public class AnimationReaderCreator implements Reloadable {
	
	protected static final Logger log = LoggerFactory.getLogger(AnimationReaderCreator.class);
	
	protected AnimationReader animationReader;
	
	protected String clientFilePath;
	
	protected Time timer;
	
	protected ImageManager imageManager;
	
	public AnimationReaderCreator(String clientFilePath, Time timer, ImageManager imageManager) {
		this.clientFilePath = clientFilePath;
		this.timer = timer;
		this.imageManager = imageManager;
	}
	
	@Override
	public void reload() throws Exception {
		animationReader = new CAnimationReader(clientFilePath, imageManager, timer);
	}
	
	public AnimationReader getAnimationReader() {
		return animationReader;
	}

}
