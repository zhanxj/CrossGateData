package cg.data.resource.serverResource;

import java.net.URI;

import cg.data.resource.AWSS3;

import com.amazonaws.services.s3.model.ObjectListing;
import com.amazonaws.services.s3.model.S3ObjectSummary;

public class AWSS3ResourceLoader implements ServerResourceLoader {

	@Override
	public void load(String serverPath, SingleResourceLoader singleResourceLoader) throws Exception {
		String[] infos = serverPath.split("\\/");
		ObjectListing objectListing = AWSS3.listObjects(infos[0].split("\\.")[0], infos[1] + "/");
		for (S3ObjectSummary objectSummary : objectListing.getObjectSummaries()) {
		    if (objectSummary.getSize() > 0) {
		    	URI uri = new URI(AWSS3.SCHEME_S3 + "://" + infos[0] + "/" + objectSummary.getKey());
		    	singleResourceLoader.load(uri);
		    }
		}
	}

}
