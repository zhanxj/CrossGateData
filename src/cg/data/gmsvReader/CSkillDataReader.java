package cg.data.gmsvReader;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Queue;

import cg.base.util.MathUtil;
import cg.data.battle.skill.SkillLevelData;
import cg.data.battle.skill.SkillLevelData.SelfEffect;
import cg.data.resource.MessageManager;
import cg.data.resource.ObjectReader;
import cg.data.resource.ProjectData;
import cg.data.sprite.Message;

import com.google.common.collect.Lists;

public class CSkillDataReader implements ObjectReader<SkillLevelData> {
	
	private final MessageManager messageManager;
	
	public CSkillDataReader(MessageManager messageManager) {
		this.messageManager = messageManager;
	}

	@Override
	public List<SkillLevelData> read(ProjectData projectData) {
		String[] lines = projectData.getTextResource("tech");
		List<SkillLevelData> skillDatas = new ArrayList<SkillLevelData>(lines.length);
		for (String line : lines) {
			skillDatas.add(new CSkillData(line, messageManager));
		}
		return skillDatas;
	}
	
	public static class CSkillData implements SkillLevelData {
		
		protected MessageManager messageManager;
		
		protected String name, techType;
		
		protected SelfEffect[] selfEffects;
		
		protected int skillCode, descriptionId, price;
		
		protected short skillId, costMp, targetType, produces[];
		
		protected byte level, useSpace;
		
		private CSkillData(String line, MessageManager messageManager) {
			this(messageManager);
			String[] infos = line.split("\t", -2);
			name = infos[0];
			techType = infos[1];
			String[] effects = infos[2].length() > 0 ? infos[2].split(",") : new String[0];
			selfEffects = new SelfEffect[effects.length];
			for (int i = 0;i < effects.length;i++) {
				String[] params = effects[i].split(":");
				if (params.length > 1) {
					selfEffects[i] = new CSelfEffect(params[0], MathUtil.stringToShort(params[1]), this);
				} else {
					selfEffects[i] = new CSelfEffect(params[0], (short) 0, this);
				}
			}
			skillCode = MathUtil.stringToInt(infos[3]);
			descriptionId = MathUtil.stringToInt(infos[4], Message.NO_MESSAGE);
			skillId = MathUtil.stringToShort(infos[5]);
			level = MathUtil.stringToByte(infos[6]);
			useSpace = MathUtil.stringToByte(infos[7]);
			targetType = MathUtil.stringToShort(infos[8]);
			price = MathUtil.stringToInt(infos[9]);
			costMp = MathUtil.stringToShort(infos[11]);
			Queue<Short> list = Lists.newLinkedList();
			short produce = MathUtil.stringToShort(infos[13]);
			if (produce > 0) {
				list.add(produce);
			}
			produce = MathUtil.stringToShort(infos[14]);
			if (produce > 0) {
				list.add(produce);
			}
			produces = new short[list.size()];
			for (int i = 0;!list.isEmpty();i++) {
				produces[i] = list.poll();
			}
		}
		
		protected CSkillData(MessageManager messageManager) {
			this.messageManager = messageManager;
		}

		@Override
		public String getName() {
			return name;
		}

		@Override
		public String getTechType() {
			return techType;
		}

		@Override
		public SelfEffect[] getSelfEffects() {
			return selfEffects;
		}

		@Override
		public int getSkillCode() {
			return skillCode;
		}

		@Override
		public String getDescription() {
			Message message = messageManager.getMessage(descriptionId);
			return message == null ? "" : message.getContent();
		}

		@Override
		public short getSkillId() {
			return skillId;
		}

		@Override
		public byte getLevel() {
			return level > 9 ? 0 : level;
		}

		@Override
		public byte getUseSpace() {
			return useSpace;
		}

		@Override
		public int getPrice() {
			return price;
		}

		@Override
		public short getCostMp() {
			return costMp;
		}

		@Override
		public short getTargetType() {
			return targetType;
		}

		@Override
		public int getBeginAnimation() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int getAttachAnimation() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int getHitAnimation() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int getBackAnimation() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int getTrackAnimation() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public short[] getProduces() {
			return produces;
		}
		
	}
	
	public static class CSelfEffect implements SelfEffect {
		
		protected String type;
		
		protected short value;
		
		protected SkillLevelData skillData;
		
		public CSelfEffect(String type, short value, SkillLevelData skillData) {
			this.type = type;
			this.value = value;
		}

		@Override
		public String getType() {
			return type;
		}

		@Override
		public short getValue() {
			return value;
		}

		@Override
		public String toString() {
			return getType() + ":" + getValue();
		}
		
	}

	@Override
	public void output(File outFile, Collection<SkillLevelData> collection)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

}
