package cg.data.resource.loader;

import java.net.URI;
import java.util.function.Function;

public interface ServerResourceLoader {
	
	void load(String serverPath, Function<URI, Void> singleResourceLoader) throws Exception;

}
