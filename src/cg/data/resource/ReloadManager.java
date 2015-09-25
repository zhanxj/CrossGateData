package cg.data.resource;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import cg.base.log.Log;
import cg.base.time.Timer;

import com.google.common.collect.Lists;

public class ReloadManager implements Reloadable {
	
	private Map<String, Integer> reloadSystems;
	
	private List<Reloadable> list;
	
	private final Log log;
	
	private final Timer timer;
	
	public ReloadManager(Log log, Timer timer) {
		this.log = log;
		this.timer = timer;
		reloadSystems = new HashMap<String, Integer>();
		list = Lists.newArrayList();
	}

	@Override
	public void reload() throws Exception {
		int time = timer.getTime();
		for (Reloadable reloadable : list) {
			reloadable.reload();
			log.info(getClass().getSimpleName() + "::reload() : " + reloadable.getClass().getName() + " reload finish.");
		}
		log.info(getClass().getSimpleName() + "::reload() : finish in " + (timer.getTime() - time) + " ms.");
	}
	
	public synchronized void register(String name, Reloadable reloadable) {
		if (reloadSystems.containsKey(name)) {
			log.warning(getClass().getName() + "::register() name " + name + " is repeat!");
		} else if (reloadable == null) {
			log.warning(getClass().getName() + "::register() name " + name + " is null!");
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
				log.warning(getClass().getName() + "::unregister() " + reloadable + " successful!");
				return;
			}
		}
		log.warning(getClass().getName() + "::unregister() " + reloadable + " was not in ReloadManager");
	}
	
	public void reload(String name) {
		log.info(getClass().getName() + "::reload() " + name + " begin.");
		Reloadable reloadable = list.get(reloadSystems.get(name));
		if (reloadable != null) {
			try {
				reloadable.reload();
				log.info(getClass().getName() + "::reload() " + name + " ok.");
			} catch (Exception e) {
				log.error(getClass().getName() + "::reload() " + name + " has error : " + e.getMessage(), e);
				e.printStackTrace();
			}
		} else {
			log.info(getClass().getName() + "::reload() " + name + " was not in ReloadManager.");
		}
	}

}
