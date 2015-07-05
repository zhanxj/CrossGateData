package cg.data.sprite;

import cg.base.sprite.Unit;

public class NpcInfo implements NpcTemplate {
	
	public static final int SPECIAL_NPC_ID_BOX = -1;
	
	public static final int SPECIAL_NPC_ID_WARP = -2;
	
	private int npcId, resourcesId, coordinates[], refreshTime;
	
	private String talkType;
	
	public NpcInfo(int npcId) {
		this.npcId = npcId;
	}

	@Override
	public int getId() {
		return npcId;
	}

	@Override
	public int getRefreshTime() {
		return refreshTime;
	}

	public void setRefreshTime(int refreshTime) {
		this.refreshTime = refreshTime;
	}

	@Override
	public int getResourcesId() {
		return resourcesId;
	}

	public void setResourcesId(int resourcesId) {
		this.resourcesId = resourcesId;
	}

	@Override
	public int[] getCoordinates() {
		return coordinates;
	}

	public void setCoordinates(int[] coordinates) {
		this.coordinates = coordinates;
	}

	@Override
	public String getName() {
		return getType();
	}

	@Override
	public byte getDir() {
		return Unit.DIR_SOUTH;
	}

	@Override
	public String getType() {
		return getId() == SPECIAL_NPC_ID_BOX ? TYPE_Box : getId() == SPECIAL_NPC_ID_WARP ? TYPE_NONE : null;
	}

	@Override
	public int getMapId() {
		return coordinates[2];
	}

	@Override
	public String getTalkType() {
		return talkType;
	}

	@Override
	public byte getAppearTime() {
		return APPEAR_TIME_ALL_DAY;
	}
	
	public void setTalktype(String talkType) {
		this.talkType = talkType;
	}

}
