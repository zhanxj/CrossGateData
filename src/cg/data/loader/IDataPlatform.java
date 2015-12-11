package cg.data.loader;

import cg.base.loader.IPlatform;
import cg.data.map.MapReader;
import cg.data.map.WarpManager;
import cg.data.resource.MessageManager;
import cg.data.resource.ProjectData;
import cg.data.resource.ReloadManager;
import cg.data.title.TitleManager;

public interface IDataPlatform extends IPlatform {
	
	byte MODEL_LOCAL = 0;
	
	byte MODEL_EDITOR = 1;
	
	byte MODEL_SERVER = 2;
	
	int getVersion();
	
	byte getModel();
	
	ReloadManager getReloadManager();
	
	ProjectData getProjectData();
	
	MessageManager getMessageManager();
	
	TitleManager getTitleManager();
	
	WarpManager getWarpManager();
	
	MapReader getMapReader();

}
