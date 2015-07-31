package cg.data.resource.serverResource;

import java.net.URI;

public interface ServerResourceLoader {
	
	void load(String serverPath, SingleResourceLoader singleResourceLoader) throws Exception;
	
	public static interface SingleResourceLoader {
		
		void load(URI uri);
		
	}

}
