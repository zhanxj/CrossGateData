package cg.data.resource;

import java.io.File;

import dataplatform.script.IScriptEngine;

public class ScriptLoader implements Reloadable {
	
	private final String path;
	
	private final IScriptEngine scriptEngine;
	
	public ScriptLoader(String path, IScriptEngine scriptEngine) {
		this.path = path;
		this.scriptEngine = scriptEngine;
	}

	@Override
	public void reload() throws Exception {
		File dir = new File(path);
		if (dir.exists()) {
			for (File script : dir.listFiles()) {
				scriptEngine.loadScript(script);
			}
		}
	}

}
