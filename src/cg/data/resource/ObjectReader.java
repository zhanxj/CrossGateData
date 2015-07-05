package cg.data.resource;

import java.io.File;
import java.util.Collection;
import java.util.List;

public interface ObjectReader<T> {
	
	List<T> read(ProjectData projectData);
	
	void output(File outFile, Collection<T> collection) throws Exception;

}
