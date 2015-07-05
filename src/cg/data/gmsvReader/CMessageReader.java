package cg.data.gmsvReader;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import cg.base.util.MathUtil;
import cg.data.resource.ObjectReader;
import cg.data.resource.ProjectData;
import cg.data.sprite.Message;

public class CMessageReader implements ObjectReader<Message> {

	@Override
	public List<Message> read(ProjectData projectData) {
		String[] lines = projectData.getTextResource("msg");
		List<Message> messages = new ArrayList<Message>(lines.length);
		for (String line : lines) {
			messages.add(new CMessage(line));
		}
		return messages;
	}
	
	private static class CMessage implements Message {
		
		private int id;
		
		private String content;
		
		public CMessage(String line) {
			String[] infos = line.split("\t", -2);
			id = MathUtil.stringToInt(infos[0]);
			content = infos[1];
		}

		@Override
		public int getId() {
			return id;
		}

		@Override
		public String getContent() {
			return content;
		}

		@Override
		public int get() {
			// TODO Auto-generated method stub
			return 0;
		}
		
	}

	@Override
	public void output(File outFile, Collection<Message> collection)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

}
