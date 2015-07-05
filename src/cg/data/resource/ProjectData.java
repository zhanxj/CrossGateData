package cg.data.resource;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import jxl.Workbook;

import org.jdom.Document;

import cg.base.log.Log;
import cg.data.resource.InputStreamHandler.DataInfo;

public abstract class ProjectData implements Reloadable {
	
	public static final String FILE_TYPE_TEXT = "txt";
	
	public static final String FILE_TYPE_XML = "xml";
	
	public static final String FILE_TYPE_EXCEL = "xls";
	
	@SuppressWarnings("rawtypes")
	protected Map<Class, InputStreamHandler> inputStreamHandlers;
	
	@SuppressWarnings("rawtypes")
	protected Map<String, ObjectReader> objectReaders;
	
	protected List<ProjectDataListener> listeners;
	
	protected Log log;
	
	protected String clientPath;
	
	@SuppressWarnings("rawtypes")
	public ProjectData(Log log, String clientPath) {
		this.log = log;
		this.clientPath = clientPath;
		objectReaders = new HashMap<String, ObjectReader>();
		listeners = new LinkedList<ProjectDataListener>();
		inputStreamHandlers = new HashMap<Class, InputStreamHandler>();
		inputStreamHandlers.put(String[].class, new TextInputStreamHandler(FILE_TYPE_TEXT, log));
		inputStreamHandlers.put(Document.class, new XmlInputStreamHandler(FILE_TYPE_XML, log));
		inputStreamHandlers.put(Workbook.class, new ExcelInputStreamHandler(FILE_TYPE_EXCEL, log));
		
		initBase();
	}
	
	protected abstract void initBase();
	
	protected void clearResource() {
		for (@SuppressWarnings("rawtypes") InputStreamHandler inputStreamHandler : inputStreamHandlers.values()) {
			inputStreamHandler.clear();
		}
	}

	@Override
	public void reload() throws Exception {
		clearResource();

		for (@SuppressWarnings("rawtypes") InputStreamHandler inputStreamHandler : inputStreamHandlers.values()) {
			inputStreamHandler.reload();
		}
		
		AttributesLoadManager.loadConfigData(this);
		
		for (ProjectDataListener listener : listeners) {
			listener.reload(this);
		}
	}
	
	public String[] getTextResource(String name) {
		InputStreamHandler<String[]> handler = getInputStreamHandler(String[].class);
		return handler.get(name);
	}
	
	public Document getXmlResource(String name) {
		InputStreamHandler<Document> handler = getInputStreamHandler(Document.class);
		return handler.get(name);
	}
	
	public Workbook getWorkbook(String name) {
		InputStreamHandler<Workbook> handler = getInputStreamHandler(Workbook.class);
		return handler.get(name);
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	protected <T> InputStreamHandler<T> getInputStreamHandler(Class T) {
		return (InputStreamHandler<T>) inputStreamHandlers.get(T);
	}
	
	public <T> void addObjectReader(ObjectReader<T> reader) {
		Type[] types = reader.getClass().getGenericInterfaces();
		if (types.length > 0 && types[0] instanceof ParameterizedType) {
			ParameterizedType parameterizedType = (ParameterizedType) types[0];
			Type[] subTypes = parameterizedType.getActualTypeArguments();
			if (subTypes.length > 0 && subTypes[0] instanceof Class) {
				objectReaders.put(subTypes[0].toString(), reader);
			} else {
				log.warning(getClass().getName() + "::addObjectReader() subTypes not fit.");
			}
		} else {
			log.warning(getClass().getName() + "::addObjectReader() types not fit.");
		}
	}
	
	public <T> List<T> read(Class<T> clz) {
		return getReader(clz).read(this);
	}

	@SuppressWarnings("unchecked")
	public <X, T extends ObjectReader<X>> T getReader(Class<X> clz) {
		return (T) objectReaders.get(clz.toString());
	}
	
	@SuppressWarnings("unchecked")
	public List<DataInfo> getFileList() {
		int size = 0;
		for (@SuppressWarnings("rawtypes") InputStreamHandler inputStreamHandler : inputStreamHandlers.values()) {
			size += inputStreamHandler.getDataInfos().size();
		}
		
		List<DataInfo> list = new ArrayList<DataInfo>(size);
		for (@SuppressWarnings("rawtypes") InputStreamHandler inputStreamHandler : inputStreamHandlers.values()) {
			list.addAll(inputStreamHandler.getDataInfos());
		}
		return list;
	}
	
	public void addListener(ProjectDataListener listener) {
		listeners.add(listener);
	}
	
	public void removeListener(ProjectDataListener listener) {
		listeners.remove(listener);
	}
	
	public String getClientPath() {
		return clientPath;
	}

}
