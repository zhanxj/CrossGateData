package cg.data.util;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.collect.Lists;

import cg.base.map.MapCell;
import cg.base.util.MathUtil;
import cg.data.map.LocalInfo;
import cg.data.map.MapArea;
import cg.data.map.MapInfo;
import cg.data.map.MapInfo.CLocalInfo;

public class GameMapUtil {
	
	protected static final Logger log = LoggerFactory.getLogger(GameMapUtil.class);
	
	protected GameMapUtil() {};
	
	public static LocalInfo getAEmptyLocal(MapInfo mapInfo, MapArea mapArea) {
		List<int[]> list = Lists.newLinkedList();
		for (int east = mapArea.getWest();east <= mapArea.getEast();east++) {
			for (int south = mapArea.getNorth();south <= mapArea.getSouth();south++) {
				if (mapInfo.getMark(east, south) == MapCell.MARK_NOMARL) {
					list.add(new int[]{east, south});
				}
			}
		}
		
		if (list.size() > 0) {
			int[] local = list.get(MathUtil.getRandom(list.size()));
			CLocalInfo info = new CLocalInfo();
			info.update(mapInfo.getMapId(), local[0], local[1]);
			return info;
		} else {
			log.warn("do not find empty local[{}] in map[{}][{}].", mapArea, mapInfo.getMapId(), mapInfo.getName());
			return null;
		}
	}
	
	public static boolean inArea(MapArea area, int east, int south) {
		return inArea(area.getWest(), area.getEast(), area.getNorth(), area.getSouth(), east, south);
	}
	
	public static boolean inArea(int west, int east, int north, int south, int pEast, int pSouth) {
		return west <= pEast && east >= pEast && north <= pSouth && south >= pSouth;
	}

}
