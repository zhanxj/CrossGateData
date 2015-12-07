package cg.data.gmsvReader;

import java.io.File;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import cg.data.gmsvReader.CGarbledReader.Garbled;
import cg.data.resource.ObjectReader;
import cg.data.resource.ProjectData;

public class CGarbledReader implements ObjectReader<Garbled> {
	
	private static final Logger log = LoggerFactory.getLogger(CGarbledReader.class);
	
	private Map<String, String> garbleds = Maps.newHashMap();

	@Override
	public List<Garbled> read(ProjectData projectData) {
		String[] lines = projectData.getTextResource("creature_garbled");
		List<Garbled> list = Lists.newArrayListWithCapacity(lines.length);
		for (String line : lines) {
			String[] infos = line.split(" ");
			if (line.length() == 0 || infos.length < 4) {
				// nothing
			} else if (garbleds.containsKey(infos[3])) {
				log.warn("repeat word : " + infos[3]);
			} else {
				list.add(new Garbled(infos[3], infos[2]));
			}
		}
		return list;
	}
	
	public static class Garbled {
		
		public final String garbled, realWord;
		
		Garbled(String garbled, String realWord) {
			this.garbled = garbled;
			this.realWord = realWord;
		}
		
	}

	@Override
	public void output(File outFile, Collection<Garbled> collection)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

}
