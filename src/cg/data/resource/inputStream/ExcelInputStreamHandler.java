package cg.data.resource.inputStream;

import java.io.InputStream;
import java.net.URI;

import cg.base.util.URLHandler;
import jxl.Workbook;
import jxl.WorkbookSettings;

class ExcelInputStreamHandler extends TypeInputStreamHandler<Workbook> implements URLHandler {
	
	private WorkbookSettings ws;
	
	private Workbook workbook;
	
	public ExcelInputStreamHandler(String type) {
		super(type);
		ws = new WorkbookSettings();
		ws.setSuppressWarnings(true);
		ws.setCellValidationDisabled(true);
	}

	@Override
	protected Workbook get(URI uri) throws Exception {
		try {
			getStream(uri, this);
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
