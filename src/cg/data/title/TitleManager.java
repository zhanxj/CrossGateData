package cg.data.title;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import cg.base.sprite.Title;
import cg.data.resource.ProjectData;
import cg.data.resource.ProjectDataListener;

public class TitleManager implements ProjectDataListener {
	
	private Map<Short, Title> titles;
	
	private Map<Short, List<TitleConfig>> titleConfigs;
	
	public TitleManager() {
		titles = new HashMap<Short, Title>();
		titleConfigs = new HashMap<Short, List<TitleConfig>>();
	}

	@Override
	public void reload(ProjectData projectData) throws Exception {
		loadTitle(projectData);
		loadTitleConfig(projectData);
	}
	
	private void loadTitle(ProjectData projectData) {
		titles.clear();
		List<Title> list = projectData.read(Title.class);
		for (Title title : list) {
			titles.put(title.getId(), title);
		}
	}
	
	private void loadTitleConfig(ProjectData projectData) {
		titleConfigs.clear();
		List<TitleConfig> list = projectData.read(TitleConfig.class);
		for (TitleConfig titleConfig : list) {
			List<TitleConfig> configs;
			short titleId = titleConfig.getTitleId();
			if (titleConfigs.containsKey(titleId)) {
				configs = titleConfigs.get(titleId);
			} else {
				configs = new LinkedList<TitleConfig>();
				titleConfigs.put(titleId, configs);
			}
			configs.add(titleConfig);
		}
	}
	
	public Title getTitle(short id) {
		return titles.get(id);
	}
	
	public List<TitleConfig> getTitleConfig(short id) {
		return titleConfigs.get(id);
	}

}
