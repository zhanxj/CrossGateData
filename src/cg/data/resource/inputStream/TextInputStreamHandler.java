package cg.data.resource.inputStream;

import java.net.URI;
import java.util.List;

import cg.base.util.ListURLHandler;

class TextInputStreamHandler extends TypeInputStreamHandler<String[]> {
	
	private ListURLHandler listURLHandler = new ListURLHandler();

	public TextInputStreamHandler(String type) {
		super(type);
	}

	@Override
	protected String[] get(URI uri) throws Exception {
		getStream(uri, listURLHandler);
		List<String> list = listURLHandler.getList();
		String[] ret = list.toArray(new String[list.size()]);
		listURLHandler.clear();
		return ret;
	}

}
