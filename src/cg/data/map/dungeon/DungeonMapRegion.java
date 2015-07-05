package cg.data.map.dungeon;

import static cg.data.map.MapInfo.DATA_LENGTH;

import java.io.BufferedWriter;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import cg.base.util.MathUtil;

class DungeonMapRegion {

	private static final byte[] XY = new byte[]{0, -1, 1, 0, 0, 1, -1, 0};
	
	private static final byte DIR_UP = 0;
	
	private static final byte DIR_RIGHT = 1;
	
	private static final byte DIR_DOWN = 2;
	
	private static final byte DIR_LEFT = 3;
	
	private static final byte DIR_COUNT = 4;
	
	private int maxEast, maxSouth, startEast, startSouth, rate, x, y;
	
	private boolean createSub;
	
	private final Door[] doors;
	
	private final int mapCellGlobalId, cornerWallGlobalId;
	
	private final int[] southWallGlobalId, eastWallGlobalId, sizeRange;
	
	byte[] cellImageGlobalIds, objectImageGlobalIds;
	
	public DungeonMapRegion(DungeonMapRegionInfo dungeon) {
		createSub = false;
		doors = new Door[DIR_COUNT];
		mapCellGlobalId = dungeon.getMapCellGlobalId();
		cornerWallGlobalId = dungeon.getCornerWallGlobalId();
		southWallGlobalId = dungeon.getSouthWallGlobalId();
		eastWallGlobalId = dungeon.getEastWallGlobalId();
		sizeRange = dungeon.getSizeRange();
	}
	
	public void openDoor(int rate, Door parentDoor) {
		this.rate = rate;
		if (parentDoor != null) {
			int oppDir = calcOppDir(parentDoor.dir); // 计算父房间连通自己的门相对的方向
			doors[oppDir] = new Door(this, (byte) oppDir); // 创建连通父房间的门
			doors[oppDir].target = parentDoor;
			doors[oppDir].size = parentDoor.size;
		}
		
		if (MathUtil.getRandom(100) < rate) { // 可以开门
			List<Byte> dirList = new LinkedList<Byte>();
			for (byte i = 0;i < DungeonMapRegion.DIR_COUNT;i++) {
				if (doors[i] == null) {
					dirList.add(i);
				}
			}
			if (dirList.size() > 0) {
				int count = MathUtil.getRandom(dirList.size());
				for (int i = 0;i <= count;i++) {
					byte dir = dirList.remove(MathUtil.getRandom(dirList.size()));
					doors[dir] = new Door(this, dir);
					if (parentDoor != null) {
						makeRandomDoorSize(doors[dir]);
					}
				}
			}
		}
	}
	
	public void link(Map<Integer, Map<Integer, DungeonMapRegion>> mapRegions) {
		for (int i = 0;i < doors.length;i++) {
			if (doors[i] != null) {
				int x = this.x + XY[doors[i].dir << 1], y = this.y + XY[(doors[i].dir << 1) + 1];
				if (mapRegions.containsKey(x) && mapRegions.get(x).containsKey(y)) {
					DungeonMapRegion oldRegion = mapRegions.get(x).get(y);
					int oppDir = calcOppDir(doors[i].dir);
					if (oldRegion.doors[oppDir] != null) {
						setTarget(doors[i].dir, oldRegion);
						doors[i].size = oldRegion.doors[oppDir].size;
					} else {
						doors[i] = null;
					}
				} else {
					makeRandomDoorSize(doors[i]);
				}
			}
		}
	}
	
	private void makeRandomDoorSize(Door door) {
		int minIndex = door.dir % 2 == 1 ? DungeonMapRegionInfo.DOOR_SIZE_SOUTH_MIN_INDEX : DungeonMapRegionInfo.DOOR_SIZE_EAST_MIN_INDEX;
		int maxIndex = door.dir % 2 == 1 ? DungeonMapRegionInfo.DOOR_SIZE_SOUTH_MAX_INDEX : DungeonMapRegionInfo.DOOR_SIZE_EAST_MAX_INDEX;
		door.size = MathUtil.getRandomContainsMax(sizeRange[minIndex], sizeRange[maxIndex]);
	}
	
	public void fit(Map<Integer, Map<Integer, DungeonMapRegion>> mapRegions) {
		fitEast();
		fitSouth();

		int size = sizeRange[DungeonMapRegionInfo.ROOM_SIZE_EAST_MAX_INDEX] * sizeRange[DungeonMapRegionInfo.ROOM_SIZE_SOUTH_MAX_INDEX] * DATA_LENGTH;
		cellImageGlobalIds = new byte[size];
		objectImageGlobalIds = new byte[size];
		
		localDoor();
	}
	
	private void fitEast() {
		DungeonMapRegion upMapRegion = doors[DIR_UP] != null && doors[DIR_UP].target != null ? doors[DIR_UP].target.room : null;
		DungeonMapRegion downMapRegion = doors[DIR_DOWN] != null && doors[DIR_DOWN].target != null ? doors[DIR_DOWN].target.room : null;
		int eastMin = sizeRange[DungeonMapRegionInfo.ROOM_SIZE_EAST_MIN_INDEX];
		if (upMapRegion != null) {
			int upStart = upMapRegion.startEast + upMapRegion.doors[DIR_DOWN].start, upEnd = upStart + upMapRegion.doors[DIR_DOWN].size;
			if (downMapRegion != null) {
				int downStart = downMapRegion.startEast + downMapRegion.doors[DIR_UP].start, downEnd = downStart + downMapRegion.doors[DIR_UP].size;
				int start = upStart < downStart ? upStart : downStart, end = upEnd > downEnd ? upEnd : downEnd, range = end - start;
				maxEast = MathUtil.getRandomContainsMax(eastMin < range ? range : eastMin, sizeRange[DungeonMapRegionInfo.ROOM_SIZE_EAST_MAX_INDEX]);
				setStartEast(MathUtil.getRandom(end > maxEast ? end - maxEast + 1 : 0, start));
				doors[DIR_DOWN].start = downStart - startEast;
			} else {
				maxEast = MathUtil.getRandomContainsMax(eastMin, sizeRange[DungeonMapRegionInfo.ROOM_SIZE_EAST_MAX_INDEX]);
				setStartEast(MathUtil.getRandom(upEnd > maxEast ? upEnd - maxEast + 1 : 0, upStart));
			}
			doors[DIR_UP].start = upStart - startEast;
		} else {
			maxEast = MathUtil.getRandomContainsMax(eastMin, sizeRange[DungeonMapRegionInfo.ROOM_SIZE_EAST_MAX_INDEX]);
			if (downMapRegion != null) {
				int start = downMapRegion.startEast + downMapRegion.doors[DIR_UP].start, end = start + downMapRegion.doors[DIR_UP].size;
				setStartEast(MathUtil.getRandom(end > maxEast ? end - maxEast + 1 : 0, start));
				doors[DIR_DOWN].start = start - startEast;
			} else {
				setStartEast(MathUtil.getRandom(sizeRange[DungeonMapRegionInfo.ROOM_SIZE_EAST_MAX_INDEX] - maxEast));
			}
		}
	}
	
	private void fitSouth() {
		DungeonMapRegion rightMapRegion = doors[DIR_RIGHT] != null && doors[DIR_RIGHT].target != null ? doors[DIR_RIGHT].target.room : null;
		DungeonMapRegion leftMapRegion = doors[DIR_LEFT] != null && doors[DIR_LEFT].target != null ? doors[DIR_LEFT].target.room : null;
		int southMin = sizeRange[DungeonMapRegionInfo.ROOM_SIZE_SOUTH_MIN_INDEX];
		if (rightMapRegion != null) {
			int rightStart = rightMapRegion.startSouth + rightMapRegion.doors[DIR_LEFT].start, rightEnd = rightStart + rightMapRegion.doors[DIR_LEFT].size;
			if (leftMapRegion != null) {
				int leftStart = leftMapRegion.startSouth + leftMapRegion.doors[DIR_RIGHT].start, leftEnd = leftStart + leftMapRegion.doors[DIR_RIGHT].size;
				int start = rightStart < leftStart ? rightStart : leftStart, end = rightEnd > leftEnd ? rightEnd : leftEnd, range = end - start;
				maxSouth = MathUtil.getRandomContainsMax(southMin < range ? range : southMin, sizeRange[DungeonMapRegionInfo.ROOM_SIZE_EAST_MAX_INDEX]);
				setStartEast(MathUtil.getRandom(end > maxSouth ? end - maxSouth + 1 : 0, maxEast));
				doors[DIR_LEFT].start = leftStart - startSouth;
			} else {
				maxSouth = MathUtil.getRandomContainsMax(southMin, sizeRange[DungeonMapRegionInfo.ROOM_SIZE_SOUTH_MAX_INDEX]);
				setStartSouth(MathUtil.getRandom(rightEnd > maxSouth ? rightEnd - maxSouth + 1 : 0, rightStart));
			}
			doors[DIR_RIGHT].start = rightStart - startSouth;
		} else {
			maxSouth = MathUtil.getRandomContainsMax(southMin, sizeRange[DungeonMapRegionInfo.ROOM_SIZE_SOUTH_MAX_INDEX]);
			if (leftMapRegion != null) {
				int start = leftMapRegion.startSouth + leftMapRegion.doors[DIR_RIGHT].start, end = start + leftMapRegion.doors[DIR_RIGHT].size;
				setStartSouth(MathUtil.getRandom(end > maxSouth ? end - maxSouth + 1 : 0, start));
				doors[DIR_LEFT].start = start - startSouth;
			} else {
				setStartSouth(MathUtil.getRandom(sizeRange[DungeonMapRegionInfo.ROOM_SIZE_SOUTH_MAX_INDEX] - maxSouth));
			}
		}
	}
	
	private void localDoor() {
		for (Door door : doors) {
			if (door != null && door.start == Door.START_NONE) {
				int length = door.dir % 2 == 0 ? maxEast : maxSouth;
				door.start = MathUtil.getRandom(length - door.size);
			}
		}
	}
	
	public void fill() {
		// fill the can use cells and wall(can not move on)
		int eastWallMod = eastWallGlobalId.length, southWallMod = southWallGlobalId.length;
		for (int east = 0;east < sizeRange[DungeonMapRegionInfo.ROOM_SIZE_EAST_MAX_INDEX];east++) {
			for (int south = 0;south < sizeRange[DungeonMapRegionInfo.ROOM_SIZE_SOUTH_MAX_INDEX];south++) {
				if (east >= startEast && east < startEast + maxEast && south >= startSouth && south < startSouth + maxSouth) { // in real room
					MathUtil.intToByte(cellImageGlobalIds, calcFillShortIndex(east, south), DATA_LENGTH, mapCellGlobalId);
					
					if (east == startEast && (south == startSouth || south == startSouth + maxSouth - 1)) { // corner
						MathUtil.intToByte(objectImageGlobalIds, calcFillShortIndex(east, south), DATA_LENGTH, cornerWallGlobalId);
					} else if (east == startEast + maxEast - 1 && (south == startSouth || south == startSouth + maxSouth - 1)) { // corner
						MathUtil.intToByte(objectImageGlobalIds, calcFillShortIndex(east, south), DATA_LENGTH, cornerWallGlobalId);
					} else if (east == startEast || east == startEast + maxEast - 1) { // west or east wall
						MathUtil.intToByte(objectImageGlobalIds, calcFillShortIndex(east, south), DATA_LENGTH, eastWallGlobalId[east % eastWallMod]);
					} else if (south == startSouth || south == startSouth + maxSouth - 1) { // north or south wall
						MathUtil.intToByte(objectImageGlobalIds, calcFillShortIndex(east, south), DATA_LENGTH, southWallGlobalId[east % southWallMod]);
					} else { // use to random obstacle and exit
						
					}
				}
			}
		}
		// open the doors(on wall) and build a path to link if this room have
		for (Door door : doors) {
			if (door != null && door.target != null) { // the door it not null and have a target
				switch (door.dir) {
				case DIR_UP : 
					for (int east = startEast + door.start;east < startEast + door.start + door.size;east++) {
						for (int south = 0;south < startSouth;south++) {
							MathUtil.intToByte(cellImageGlobalIds, calcFillShortIndex(east, south), DATA_LENGTH, mapCellGlobalId);
							
							if (east == startEast + door.start || east == startEast + door.start + door.size - 1) { // west or east wall
								MathUtil.intToByte(objectImageGlobalIds, calcFillShortIndex(east, south), DATA_LENGTH, eastWallGlobalId[east % eastWallMod]);
							}
						}
					}
					MathUtil.intToByte(objectImageGlobalIds, calcFillShortIndex(startEast + door.start, startSouth), DATA_LENGTH, cornerWallGlobalId);
					MathUtil.intToByte(objectImageGlobalIds, calcFillShortIndex(startEast + door.start + door.size - 1, startSouth), DATA_LENGTH, cornerWallGlobalId);
					for (int east = startEast + door.start + 1;east < startEast + door.start + door.size - 1;east++) { // use to random obstacle and exit
						MathUtil.intToByte(objectImageGlobalIds, calcFillShortIndex(east, startSouth), DATA_LENGTH, 0);
					}
					break;
				case DIR_RIGHT : 
					for (int east = startEast + maxEast;east < sizeRange[DungeonMapRegionInfo.ROOM_SIZE_EAST_MAX_INDEX];east++) {
						for (int south = startSouth + door.start;south < startSouth + door.start + door.size;south++) {
							MathUtil.intToByte(cellImageGlobalIds, calcFillShortIndex(east, south), DATA_LENGTH, mapCellGlobalId);
							
							if (south == startSouth + door.start || south == startSouth + door.start + door.size - 1) { // west or east wall
								MathUtil.intToByte(objectImageGlobalIds, calcFillShortIndex(east, south), DATA_LENGTH, southWallGlobalId[south % southWallMod]);
							}
						}
					}
					MathUtil.intToByte(objectImageGlobalIds, calcFillShortIndex(startEast + maxEast - 1, startSouth + door.start + 1), DATA_LENGTH, cornerWallGlobalId);
					MathUtil.intToByte(objectImageGlobalIds, calcFillShortIndex(startEast + maxEast - 1, startSouth + door.start + door.size - 1), DATA_LENGTH, cornerWallGlobalId);
					for (int south = startSouth + door.start + 1;south < startSouth + door.start + door.size - 1;south++) { // use to random obstacle and exit
						MathUtil.intToByte(objectImageGlobalIds, calcFillShortIndex(startEast + maxEast - 1, south), DATA_LENGTH, 0);
					}
					break;
				case DIR_DOWN : 
					for (int east = startEast + door.start;east < startEast + door.start + door.size;east++) {
						for (int south = startSouth + maxSouth;south < sizeRange[DungeonMapRegionInfo.ROOM_SIZE_SOUTH_MAX_INDEX];south++) {
							MathUtil.intToByte(cellImageGlobalIds, calcFillShortIndex(east, south), DATA_LENGTH, mapCellGlobalId);
							
							if (east == startEast + door.start || east == startEast + door.start + door.size - 1) { // west or east wall
								MathUtil.intToByte(objectImageGlobalIds, calcFillShortIndex(east, south), DATA_LENGTH, eastWallGlobalId[east % eastWallMod]);
							}
						}
					}
					MathUtil.intToByte(objectImageGlobalIds, calcFillShortIndex(startEast + door.start, startSouth + maxSouth - 1), DATA_LENGTH, cornerWallGlobalId);
					MathUtil.intToByte(objectImageGlobalIds, calcFillShortIndex(startEast + door.start + door.size - 1, startSouth + maxSouth - 1), DATA_LENGTH, cornerWallGlobalId);
					for (int east = startEast + door.start + 1;east < startEast + door.start + door.size - 1;east++) { // use to random obstacle and exit
						MathUtil.intToByte(objectImageGlobalIds, calcFillShortIndex(east, startSouth + maxSouth - 1), DATA_LENGTH, 0);
					}
					break;
				case DIR_LEFT : 
					for (int east = 0;east < startEast;east++) {
						for (int south = startSouth + door.start;south < startSouth + door.start + door.size;south++) {
							MathUtil.intToByte(cellImageGlobalIds, calcFillShortIndex(east, south), DATA_LENGTH, mapCellGlobalId);
							
							if (south == startSouth + door.start || south == startSouth + door.start + door.size - 1) { // west or east wall
								MathUtil.intToByte(objectImageGlobalIds, calcFillShortIndex(east, south), DATA_LENGTH, southWallGlobalId[south % southWallMod]);
							}
						}
					}
					MathUtil.intToByte(objectImageGlobalIds, calcFillShortIndex(startEast, startSouth + door.start + 1), DATA_LENGTH, cornerWallGlobalId);
					MathUtil.intToByte(objectImageGlobalIds, calcFillShortIndex(startEast, startSouth + door.start + door.size - 1), DATA_LENGTH, cornerWallGlobalId);
					for (int south = startSouth + door.start + 1;south < startSouth + door.start + door.size - 1;south++) { // use to random obstacle and exit
						MathUtil.intToByte(objectImageGlobalIds, calcFillShortIndex(startEast, south), DATA_LENGTH, 0);
					}
					break;
				}
			}
		}
	}
	
	public void output(BufferedWriter bw) throws Exception {
		bw.write("(" + x + ", " + y + ") east(" + startEast + ", " + maxEast + ") south(" + startSouth + ", " + maxSouth + ")");
		for (Door door : doors) {
			if (door != null) {
				bw.write(" " + door.dir);
			}
		}
		bw.write("\r\n");
		for (int east = 0;east < sizeRange[DungeonMapRegionInfo.ROOM_SIZE_EAST_MAX_INDEX];east++) {
			for (int south = 0;south < sizeRange[DungeonMapRegionInfo.ROOM_SIZE_SOUTH_MAX_INDEX];south++) {
				int imageGlobalId = getImageGlobalId(east, south);
				bw.write(imageGlobalId == 0 ? "■" : "○");
			}
			bw.write("\r\n");
		}
		bw.write("\r\n");
	}
	
	public int getImageGlobalId(int east, int south) {
		return MathUtil.bytesToInt2(cellImageGlobalIds, calcShortIndex(east, south), DATA_LENGTH);
	}
	
	public void createSubRoom(Map<Integer, Map<Integer, DungeonMapRegion>> mapRegions, DungeonMapRegionInfo dungeon) {
		createSub = true;
		// Breadth-first
		for (int i = 0;i < doors.length;i++) {
			if (doors[i] != null && doors[i].target == null) {
				int x = this.x + XY[doors[i].dir << 1], y = this.y + XY[(doors[i].dir << 1) + 1];
				if (!mapRegions.containsKey(x) || !mapRegions.get(x).containsKey(y)) { // The direction local is empty, will create a sub room.
					DungeonMapInfo.createRoom(rate >> 1, dungeon, mapRegions, x, y, doors[i]);
				} else { // This direction local has been created once, but it do not link to this room, so close the door.
					doors[i] = null;
				}
			}
		}
		// Depth-Second
		for (Door door : doors) {
			if (door != null && door.target != null && !door.target.room.createSub) {
				door.target.room.createSubRoom(mapRegions, dungeon);
			}
		}
	}
	
	private void setTarget(int dir, DungeonMapRegion target) {
		setTarget(doors[dir], target);
	}
	
	private void setTarget(Door door, DungeonMapRegion target) {
		int oppDir = calcOppDir(door.dir);
		door.target = target.doors[oppDir];
		target.doors[oppDir].target = door;
	}
	
	private static int calcOppDir(int dir) {
		return (dir + 2 + DIR_COUNT) % DIR_COUNT;
	}
	
	private void setStartEast(int startEast) {
		this.startEast = Math.max(0, startEast);
		this.startEast = this.startEast + maxEast > sizeRange[DungeonMapRegionInfo.ROOM_SIZE_EAST_MAX_INDEX] ? sizeRange[DungeonMapRegionInfo.ROOM_SIZE_EAST_MAX_INDEX] - maxEast : this.startEast;
	}
	
	private void setStartSouth(int startSouth) {
		this.startSouth = Math.max(0, startSouth);
		this.startSouth = this.startSouth + maxSouth > sizeRange[DungeonMapRegionInfo.ROOM_SIZE_SOUTH_MAX_INDEX] ? sizeRange[DungeonMapRegionInfo.ROOM_SIZE_SOUTH_MAX_INDEX] - maxSouth : this.startSouth;
	}
	
	private int calcFillIndex(int east, int south) {
		return east * sizeRange[DungeonMapRegionInfo.ROOM_SIZE_SOUTH_MAX_INDEX] + south;
	}
	
	private int calcFillShortIndex(int east, int south) {
		return calcFillIndex(east, south) * DATA_LENGTH;
	}
	
	public int calcIndex(int east, int south) {
		return south * sizeRange[DungeonMapRegionInfo.ROOM_SIZE_EAST_MAX_INDEX] + east;
	}
	
	public int calcShortIndex(int east, int south) {
		return calcIndex(east, south) * DATA_LENGTH;
	}
	
	public void setLocal(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
}

class Door {
	
	public static final int START_NONE = -1;
	
	public final DungeonMapRegion room;
	
	public final byte dir;
	
	public Door target;
	
	public int size, start;
	
	public Door(DungeonMapRegion room, byte dir) {
		start = START_NONE;
		this.room = room;
		this.dir = dir;
	}
	
}
