package cg.data.resource;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.collect.Maps;

import cg.data.gmsvReader.CGarbledReader.Garbled;
import cg.data.sprite.Message;

public class MessageManager implements ProjectDataListener {
	
	private static final Logger log = LoggerFactory.getLogger(MessageManager.class);
	
	private Map<Integer, Message> messages;
	
	private Map<String, String> garbleds;
	
	public MessageManager() {
		messages = Maps.newHashMap();
		garbleds = Maps.newHashMap();
	}

	@Override
	public void reload(ProjectData  projectData) throws Exception {
		clear();
		loadMessage(projectData);
		loadGarbled(projectData);
	}
	
	public void clear() {
		messages.clear();
		garbleds.clear();
	}
	
	private void loadMessage(ProjectData  projectData) {
		List<Message> list = projectData.read(Message.class);
		for (int i = 0;i < list.size();i++) {
			Message message = list.get(i);
			messages.put(message.getId(), message);
		}
	}
	
	private void loadGarbled(ProjectData  projectData) {
		List<Garbled> list = projectData.read(Garbled.class);
		for (int i = 0;i < list.size();i++) {
			Garbled garbled = list.get(i);
			garbleds.put(garbled.garbled, garbled.realWord);
		}
	}
	
	public Message getMessage(int msgId) {
		if (msgId != Message.NO_MESSAGE && !messages.containsKey(msgId)) {
			log.warn("{}::getMessage() : {} is null.", getClass(), msgId);
		}
		return messages.get(msgId);
	}
	
	public String getRealWord(String garbled) {
		return garbleds.get(garbled);
	}

}
