package cg.data.resource;

import java.net.URI;
import java.util.Collection;

import cg.base.util.IOUtils;

public interface InputStreamHandler<T> extends Reloadable {
	
	void addURI(URI uri);
	
	T get(String name);
	
	void clear();
	
	Collection<DataInfo> getDataInfos();
	
	public static class DataInfo {
		
		public final String uri, type;
		
		public DataInfo(String uri, String type) {
			this.uri = uri;
			this.type = type;
		}

		@Override
		public String toString() {
			return uri + IOUtils.PATH_SPLIT + type;
		}
		
	}

}
