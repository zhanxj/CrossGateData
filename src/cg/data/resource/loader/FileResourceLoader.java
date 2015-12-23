package cg.data.resource.loader;

import static cg.base.util.IOUtils.PATH_SPLIT;

import java.io.File;
import java.net.URI;
import java.util.function.Function;

public class FileResourceLoader implements ServerResourceLoader {

	@Override
	public void load(String serverPath, Function<URI, Void> singleResourceLoader) throws Exception {
		brower(new File(serverPath), null, singleResourceLoader);
	}
	
	private void brower(File path, String dir, Function<URI, Void> singleResourceLoader) throws Exception {
		String prefix = (dir != null && dir.length() > 0 ? dir + PATH_SPLIT : "");
		for (File file : path.listFiles()) {
			String name = prefix + file.getName();
			if (file.isDirectory()) {
				brower(file, name, singleResourceLoader);
			} else if (file.isFile()) {
				URI uri = file.toURI();
				singleResourceLoader.apply(uri);
			} else {
				throw new Exception(getClass() + "::brower() : Unknow file : " + file);
			}
		}
	}

}
