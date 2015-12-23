package cg.data.resource.inputStream;

import java.io.InputStream;
import java.net.URI;

import org.jdom2.Document;

import cg.base.util.URLHandler;
import cg.data.util.FileUtils;

class XmlInputStreamHandler extends TypeInputStreamHandler<Document> implements URLHandler {
	
	private Document document;

	public XmlInputStreamHandler(String type) {
		super(type);
	}

	@Override
	protected Document get(URI uri) throws Exception {
		try {
			getStream(uri, this);
			return document;
		} finally {
			document = null;
		}
	}

	@Override
	public void handle(InputStream is, String info) throws Exception {
		document = FileUtils.loadDOM(is);
		log.info(info);
	}

}
