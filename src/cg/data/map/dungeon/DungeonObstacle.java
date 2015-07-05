package cg.data.map.dungeon;

import cg.base.util.MathUtil;

public class DungeonObstacle {
	
	private int imageGlobalId;
	
	private byte[] rates;
	
	public void load(String[] infos, int i) {
		int index = 57 + i * 4;
		imageGlobalId = MathUtil.stringToInt(infos[index]);
		rates = new byte[3];
		for (int j = 0;j < rates.length;j++) {
			rates[j] = MathUtil.stringToByte(infos[index + 1 + j]);
		}
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder("{imageGlobalId = " + imageGlobalId + " [");
		for (byte rate : rates) {
			builder.append(rate + ", ");
		}
		builder.append("]}");
		return builder.toString();
	}
	
	public int getImageGlobalId() {
		return imageGlobalId;
	}
	
	public byte[] getRates() {
		return rates;
	}

}
