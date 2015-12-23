package cg.data.resource.inputStream;

import org.jdom2.Document;

import jxl.Workbook;

public final class InputStreamHandlers {
	
	private InputStreamHandlers() {}
	
	public static InputStreamHandler<Workbook> createExcelHandler(String type) {
		return new ExcelInputStreamHandler(type);
	}
	
	public static InputStreamHandler<String[]> createTextHandler(String type) {
		return new TextInputStreamHandler(type);
	}
	
	public static InputStreamHandler<Document> createXmlHandler(String type) {
		return new XmlInputStreamHandler(type);
	}

}
