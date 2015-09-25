package cg.data.gmsvReader;

import static cg.data.battle.skill.SkillLevelData.NO_SKILL;

import java.io.File;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import cg.base.util.MathUtil;
import cg.data.attribute.AttributeEx;
import cg.data.resource.ObjectReader;
import cg.data.resource.ProjectData;
import cg.data.sprite.CreatureTemplate;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

public class CEnemyBaseInfoReader implements ObjectReader<CreatureTemplate> {

	@Override
	public List<CreatureTemplate> read(ProjectData projectData) {
		String[] lines = projectData.getTextResource("enemybase");
		List<CreatureTemplate> list = Lists.newArrayListWithCapacity(lines.length);
		for (String line : lines) {
			list.add(new CCreatureTemplate(line.split("\t", -2)));
		}
		return list;
	}
	
	private class CCreatureTemplate implements CreatureTemplate {
		
		private String name;
		
		private int id;
		
		private short basePointCount;
		
		private byte basePointFloat;
		
		private byte race;
		
		private Map<String, Map<Byte, Short>> attributes;
		
		private short difficultyOfCatch;
		
		private byte cardLevel;
		
		private byte needCharm;
		
		private byte[] elementAttributes;
		
		private byte cardType;
		
		private byte skillAmount;
		
		private int cardFileId;
		
		private int animationId;
		
		private boolean canCatch;
		
		private int[] skillCodes;
		
		public CCreatureTemplate(String[] infos) {
			attributes = Maps.newHashMap();
			name = infos[0];
			id = MathUtil.stringToInt(infos[1]);
			basePointCount = MathUtil.stringToShort(infos[2]);
			basePointFloat = MathUtil.stringToByte(infos[3]);
			race = MathUtil.stringToByte(infos[4]);
			
			Map<Byte, Short> values = Maps.newHashMap();
			values.put(AttributeEx.BP_VITALITY, MathUtil.stringToShort(infos[5]));
			values.put(AttributeEx.BP_STRENGTH, MathUtil.stringToShort(infos[6]));
			values.put(AttributeEx.BP_TOUGH, MathUtil.stringToShort(infos[7]));
			values.put(AttributeEx.BP_QUICK, MathUtil.stringToShort(infos[8]));
			values.put(AttributeEx.BP_MAGIC, MathUtil.stringToShort(infos[9]));
			attributes.put(AttributeEx.ATTRIBUTE_TYPE_BP, values);
			
			difficultyOfCatch = MathUtil.stringToShort(infos[10]);
			cardLevel = MathUtil.stringToByte(infos[11]);
			needCharm = MathUtil.stringToByte(infos[12]);
			
			values = Maps.newHashMap();
			values.put(AttributeEx.ATTRIBUTE_EXTEND_HIT, MathUtil.stringToShort(infos[13]));
			values.put(AttributeEx.ATTRIBUTE_EXTEND_AVOID, MathUtil.stringToShort(infos[14]));
			attributes.put(AttributeEx.ATTRIBUTE_TYPE_EXTEND, values);
			
			elementAttributes = new byte[4];
			for (int i = 0;i < elementAttributes.length;i++) {
				elementAttributes[i] = MathUtil.stringToByte(infos[15 + i]);
			}
			
			values = Maps.newHashMap();
			values.put(AttributeEx.ATTRIBUTE_RESIST_POISON, MathUtil.stringToShort(infos[19]));
			values.put(AttributeEx.ATTRIBUTE_RESIST_INTOXICATION, MathUtil.stringToShort(infos[20]));
			values.put(AttributeEx.ATTRIBUTE_RESIST_SLEEP, MathUtil.stringToShort(infos[21]));
			values.put(AttributeEx.ATTRIBUTE_RESIST_CONFUSION, MathUtil.stringToShort(infos[22]));
			values.put(AttributeEx.ATTRIBUTE_RESIST_STONE, MathUtil.stringToShort(infos[23]));
			values.put(AttributeEx.ATTRIBUTE_RESIST_AMNESIA, MathUtil.stringToShort(infos[24]));
			attributes.put(AttributeEx.ATTRIBUTE_TYPE_RESIST, values);
			
			cardType = MathUtil.stringToByte(infos[25]);
			// 26
			
			attributes.get(AttributeEx.ATTRIBUTE_TYPE_EXTEND).put(AttributeEx.ATTRIBUTE_EXTEND_CRITICAL, MathUtil.stringToShort(infos[27]));
			attributes.get(AttributeEx.ATTRIBUTE_TYPE_EXTEND).put(AttributeEx.ATTRIBUTE_EXTEND_COUNTER, MathUtil.stringToShort(infos[28]));

			skillAmount = MathUtil.stringToByte(infos[29]);
			animationId = MathUtil.stringToInt(infos[30]);
			// 31
			// 32
			cardFileId = MathUtil.stringToInt(infos[33]);
			// 34
			canCatch = infos[35].equals("1");
			
			List<Integer> list = Lists.newArrayListWithCapacity(skillAmount);
			for (int i = 0;i < skillAmount;i++) {
				int skillCode = MathUtil.stringToInt(infos[36 + i], NO_SKILL);
				if (skillCode != NO_SKILL) {
					list.add(skillCode);
				}
			}
			skillCodes = new int[list.size()];
			for (int i = 0;i < skillCodes.length;i++) {
				skillCodes[i] = list.get(i);
			}
		}

		@Override
		public String getName() {
			return name;
		}

		@Override
		public int getId() {
			return id;
		}

		@Override
		public short getBasePointCount() {
			return basePointCount;
		}

		@Override
		public byte getBasePointFloat() {
			return basePointFloat;
		}

		@Override
		public byte getRace() {
			return race;
		}

		@Override
		public short getAttributeValue(String attributeType, byte type) {
			return attributes.get(attributeType).get(type);
		}

		@Override
		public short getDifficultyOfCatch() {
			return difficultyOfCatch;
		}

		@Override
		public byte getCardLevel() {
			return cardLevel;
		}

		@Override
		public byte getNeedCharm() {
			return needCharm;
		}

		@Override
		public byte getCardType() {
			return cardType;
		}

		@Override
		public byte getSkillAmount() {
			return skillAmount;
		}

		@Override
		public int getCardFileId() {
			return cardFileId;
		}

		@Override
		public int getAnimationId() {
			return animationId;
		}

		@Override
		public boolean getCanCatch() {
			return canCatch;
		}

		@Override
		public int[] getSkillIds() {
			return skillCodes;
		}

		@Override
		public byte[] getElements() {
			return elementAttributes;
		}
		
	}

	@Override
	public void output(File outFile, Collection<CreatureTemplate> collection) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
