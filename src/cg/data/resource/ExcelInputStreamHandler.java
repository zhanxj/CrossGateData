package cg.data.resource;

import java.io.InputStream;
import java.net.URI;

import jxl.Workbook;
import jxl.WorkbookSettings;
import cg.base.log.Log;
import cg.base.util.IOUtils;
import cg.base.util.URLHandler;

public class ExcelInputStreamHandler extends TypeInputStreamHandler<Workbook> implements URLHandler {
	
	private WorkbookSettings ws;
	
	private Workbook workbook;
	
	public ExcelInputStreamHandler(String type, Log log) {
		super(type, log);
		ws = new WorkbookSettings();
		ws.setSuppressWarnings(true);
		ws.setCellValidationDisabled(true);
	}

	@Override
	protected Workbook get(URI uri) throws Exception {
		try {
			IOUtils.getStream(uri, this);
			return workbook;
		} finally {
			workbook = null;
		}
	}

	@Override
	public void handle(InputStream is, String info) throws Exception {
		workbook = Workbook.getWorkbook(is, ws);
		log.info(info);
	}

}
