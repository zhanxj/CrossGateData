package cg.data.resource;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import cg.base.time.Timer;

public class ReloadManager implements Reloadable {
	
	private static final Logger log = LoggerFactory.getLogger(ReloadManager.class);
	
	private Map<String, Integer> reloadSystems;
	
	private List<Reloadable> list;
	
	private final Timer timer;
	
	public ReloadManager(Timer timer) {
		this.timer = timer;
		reloadSystems = Maps.newHashMap();
		list = Lists.newArrayList();
	}

	@Override
	public void reload() throws Exception {
		int time = timer.getTime();
		for (Reloadable reloadable : list) {
			reloadable.reload();
			log.info("{}::reload() : {} reload finish.", getClass().getSimpleName(), reloadable.getClass().getName());
		}
		log.info("{}::reload() : finish in {} ms.", getClass().getSimpleName(), (timer.getTime() - time));
	}
	
	public synchronized void register(String name, Reloadable reloadable) {
		if (reloadSystems.containsKey(name)) {
			log.warn("{}::register() name {} is repeat!", getClass().getName(), name);
		} else if (reloadable == null) {
			log.warn("{}::register() name {} is null!", getClass().getName(), name);
		} else {
			reloadSystems.put(name, list.size());
			list.add(reloadable);
		}
	}
	
	public synchronized void unregister(String name) {
		int index = reloadSystems.remove(name);
		list.remove(index);
	}
	
	public void unregister(Reloadable reloadable) {
		Iterator<String> keys = reloadSystems.keySet().iterator();
		while (keys.hasNext()) {
			String key = keys.next();
			if (reloadSystems.get(key).equals(reloadable)) {
				reloadSystems.remove(key);
				log.warn("{}::unregister() {} successful!", getClass().getName(), reloadable);
				return;
			}
		}
		log.warn("{}::unregister() {} was not in ReloadManager", getClass().getName(), reloadable);
	}
	
	public void reload(String name) {
		log.info("{}::reload() {} begin.", getClass().getName(), name);
		Reloadable reloadable = list.get(reloadSystems.get(name));
		if (reloadable != null) {
			try {
				reloadable.reload();
				log.info("{}::reload() {} ok.", getClass().getName(), name);
			} catch (Exception e) {
				log.error("", e);
			}
		} else {
			log.info("{}::reload() {} was not in ReloadManager.", getClass().getName(), name);
		}
	}

}
