package cg.data.resource;

import cg.base.image.CImageManager;
import cg.base.image.ImageReader;
import cg.base.io.CImageResource;
import cg.base.log.Log;
import cg.base.reader.CImageReader;

public class ReadImageResourceManager extends CImageManager implements Reloadable {
	
	protected final String clientFilePath;

	public ReadImageResourceManager(Log log, String clientFilePath) {
		super(log, clientFilePath);
		this.clientFilePath = clientFilePath;
	}

	@Override
	public void reload() throws Exception {
		resources.clear();
		int[] version = AttributesLoadManager.loadAttributesData("image_resource", "version", "version");
		String[] type = AttributesLoadManager.loadAttributesStrData("image_resource", "version", "type");
		String[] path = AttributesLoadManager.loadAttributesStrData("image_resource", "version", "path");
		String[] suffix = AttributesLoadManager.loadAttributesStrData("image_resource", "version", "suffix");
		String[] name = AttributesLoadManager.loadAttributesStrData("image_resource", "version", "name");
		String[] colorPalette = AttributesLoadManager.loadAttributesStrData("image_resource", "version", "colorPalette");
		for (int i = 0;i < version.length;i++) {
			addResource(new CImageResource((byte) version[i], type[i], path[i], suffix[i], name[i], colorPalette[i].toLowerCase().equals("true")));
		}
		imageReader = createImageReader(clientFilePath);
	}

	@Override
	protected ImageReader createImageReader(String clientFilePath) {
		return resources.size() == 0 ? null : createImageReader();
	}
	
	protected ImageReader createImageReader() {
		return new CImageReader(this, log, clientFilePath);
	}

}
