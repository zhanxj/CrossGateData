package cg.data.resource;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.URI;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import jxl.Workbook;

import org.jdom2.Document;

import cg.base.log.Log;
import cg.data.map.AreaFileHandler;
import cg.data.map.AreaLoader;
import cg.data.map.AreaNetHandler;
import cg.data.resource.inputStream.ExcelInputStreamHandler;
import cg.data.resource.inputStream.InputStreamHandler;
import cg.data.resource.inputStream.InputStreamHandler.DataInfo;
import cg.data.resource.inputStream.TextInputStreamHandler;
import cg.data.resource.inputStream.XmlInputStreamHandler;
import cg.data.resource.serverResource.ServerResourceLoader;
import cg.data.resource.serverResource.ServerResourceLoader.SingleResourceLoader;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

public class ProjectData implements Reloadable, SingleResourceLoader {
	
	public static final String FILE_TYPE_TEXT = "txt";
	
	public static final String FILE_TYPE_XML = "xml";
	
	public static final String FILE_TYPE_EXCEL = "xls";
	
	@SuppressWarnings("rawtypes")
	protected Map<Class, InputStreamHandler> inputStreamHandlers;
	
	@SuppressWarnings("rawtypes")
	protected Map<String, ObjectReader> objectReaders;
	
	protected List<ProjectDataListener> listeners;
	
	protected Log log;
	
	protected String serverPath;
	
	protected AreaLoader areaLoader;
	
	public ProjectData(Log log, String serverPath, ServerResourceLoader serverResourceLoader) throws Exception {
		this.log = log;
		this.serverPath = serverPath;
		objectReaders = Maps.newHashMap();
		listeners = Lists.newLinkedList();
		inputStreamHandlers = Maps.newHashMap();
		inputStreamHandlers.put(String[].class, new TextInputStreamHandler(FILE_TYPE_TEXT, log));
		inputStreamHandlers.put(Document.class, new XmlInputStreamHandler(FILE_TYPE_XML, log));
		inputStreamHandlers.put(Workbook.class, new ExcelInputStreamHandler(FILE_TYPE_EXCEL, log));
		areaLoader = new URI(serverPath).getHost() == null ? new AreaFileHandler() : new AreaNetHandler(serverPath);
		
		serverResourceLoader.load(serverPath, this);
	}
	
	@Override
	public void load(URI uri) {
		String path = uri.getPath();
		if (path.endsWith(FILE_TYPE_TEXT)) {
			inputStreamHandlers.get(String[].class).addURI(uri);
		} else if (path.endsWith(FILE_TYPE_EXCEL)) {
			inputStreamHandlers.get(Workbook.class).addURI(uri);
		} else if (path.endsWith(FILE_TYPE_XML)) {
			inputStreamHandlers.get(Document.class).addURI(uri);
		} else {
			// This is a map.
		}
	}
	
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
		List<DataInfo> list = Lists.newArrayListWithCapacity(size);
		for (@SuppressWarnings("rawtypes") InputStreamHandler inputStreamHandler : inputStreamHandlers.values()) {
			Collection<DataInfo> dataInfos = inputStreamHandler.getDataInfos();
			size += dataInfos.size();
			list.addAll(dataInfos);
		}
		return list;
	}
	
	public void addListener(ProjectDataListener listener) {
		listeners.add(listener);
	}
	
	public void removeListener(ProjectDataListener listener) {
		listeners.remove(listener);
	}
	
	public String getServerPath() {
		return serverPath;
	}
	
	public AreaLoader createAreaLoader() {
		return areaLoader;
	}

}
