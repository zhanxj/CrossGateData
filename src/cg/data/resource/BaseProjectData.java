package cg.data.resource;

import static cg.base.util.IOUtils.PATH_SPLIT;

import java.io.File;
import java.net.URI;

import jxl.Workbook;

import org.jdom.Document;

import cg.base.log.Log;

public class BaseProjectData extends ProjectData {

	public BaseProjectData(Log log, String clientPath) {
		super(log, clientPath);
	}

	@Override
	protected void initBase() {
		brower(new File(clientPath), null);
	}
	
	private void brower(File path, String dir) {
		String prefix = (dir != null && dir.length() > 0 ? dir + PATH_SPLIT : "");
		for (File file : path.listFiles()) {
			String name = prefix + file.getName();
			if (file.isDirectory()) {
				brower(file, name);
			} else if (file.isFile()) {
				URI uri = file.toURI();
				if (file.getName().endsWith(FILE_TYPE_TEXT)) {
					inputStreamHandlers.get(String[].class).addURI(uri);
				} else if (file.getName().endsWith(FILE_TYPE_EXCEL)) {
					inputStreamHandlers.get(Workbook.class).addURI(uri);
				} else if (file.getName().endsWith(FILE_TYPE_XML)) {
					inputStreamHandlers.get(Document.class).addURI(uri);
				} else {
					// This is a map.
				}
			} else {
				log.warning(getClass() + "::brower() : Unknow file : " + file);
			}
		}
	}

}
