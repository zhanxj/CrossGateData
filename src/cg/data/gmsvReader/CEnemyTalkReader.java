package cg.data.gmsvReader;

import java.io.File;
import java.util.Collection;
import java.util.List;

import cg.base.util.MathUtil;
import cg.data.resource.ObjectReader;
import cg.data.resource.ProjectData;
import cg.data.sprite.EnemyTalkInfo;
import cg.data.sprite.EnemyTalkInfo.TalkInfo;

import com.google.common.collect.Lists;

public class CEnemyTalkReader implements ObjectReader<EnemyTalkInfo> {

	@Override
	public List<EnemyTalkInfo> read(ProjectData projectData) {
		String[] lines = projectData.getTextResource("enemytalk");
		List<EnemyTalkInfo> list = Lists.newArrayListWithCapacity(lines.length);
		for (String line : lines) {
			if (!line.trim().substring(0, 1).equals("#")) {
				list.add(new CEnemyTalkInfo(line));
			}
		}
		return list;
	}
	
	private static class CTalkInfo implements TalkInfo {
		
		private byte talkCondition;
		
		private int talkMsgId;
		
		private byte fontSize;
		
		private byte fontColor;
		
		public CTalkInfo(String[] infos, int offset) {
			talkCondition = MathUtil.stringToByte(infos[offset + 1]);
			talkMsgId = Integer.parseInt(infos[offset + 11]);
			fontSize = MathUtil.stringToByte(infos[offset + 16]);
			fontColor = MathUtil.stringToByte(infos[offset + 21]);
		}

		@Override
		public byte getTalkCondition() {
			return talkCondition;
		}

		@Override
		public int getTalkMsgId() {
			return talkMsgId;
		}

		@Override
		public byte getFontSize() {
			return fontSize;
		}

		@Override
		public byte getFontColor() {
			return fontColor;
		}
		
	}
	
	private static class CEnemyTalkInfo implements EnemyTalkInfo {
		
		private static final byte CONDITION_COUNT = 5;
		
		private int id;
		
		private TalkInfo[] talkInfos;
		
		public CEnemyTalkInfo(String line) {
			String[] infos = line.split("\t", -2);
			id = MathUtil.stringToInt(infos[0]);
			for (int i = 0;i < CONDITION_COUNT;i++) {
				if (talkInfos != null) {
					if (talkInfos.length > i) {
						talkInfos[i] = new CTalkInfo(infos, i);
					} else {
						break;
					}
				} else if (infos[1 + i].length() == 0) {
					talkInfos = new TalkInfo[i];
					i = -1;
				} else if (i == CONDITION_COUNT - 1) {
					talkInfos = new TalkInfo[CONDITION_COUNT];
					i = -1;
				}
			}
		}

		@Override
		public int getId() {
			return id;
		}

		@Override
		public TalkInfo[] getTalkInfos() {
			return talkInfos;
		}
		
	}

	@Override
	public void output(File outFile, Collection<EnemyTalkInfo> collection)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

}
