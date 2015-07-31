package cg.data.resource.serverResource;

import java.net.URI;
import java.util.List;

import cg.base.util.IOUtils;
import cg.base.util.ListURLHandler;

public class HttpResourceLoader implements ServerResourceLoader {

	@Override
	public void load(String serverPath, SingleResourceLoader singleResourceLoader) throws Exception {
		String getFileHost = serverPath + "/file/GetFile?uri=";
        ListURLHandler listURLHandler = new ListURLHandler(IOUtils.ENCODING);
        IOUtils.getStream(serverPath + "/file/GetFileList", listURLHandler);
        List<String> list = listURLHandler.getList();
        for (String element : list) {
            element = IOUtils.encode(element);
            URI uri = new URI(getFileHost + element);
            singleResourceLoader.load(uri);
        }
	}

}
