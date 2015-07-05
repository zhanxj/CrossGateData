package cg.data.gmsvReader;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cg.base.skill.SkillTemplate;
import cg.base.sprite.Attribute;
import cg.base.sprite.AttributeCell;
import cg.base.util.MathUtil;
import cg.data.resource.MessageManager;
import cg.data.resource.ObjectReader;
import cg.data.resource.ProjectData;
import cg.data.sprite.Message;

public class CSkillTemplateReader implements ObjectReader<SkillTemplate> {
	
	private final MessageManager messageManager;
	
	public CSkillTemplateReader(MessageManager messageManager) {
		this.messageManager = messageManager;
	}

	@Override
	public List<SkillTemplate> read(ProjectData projectData) {
		String[] lines = projectData.getTextResource("skill");
		List<SkillTemplate> list = new ArrayList<SkillTemplate>(lines.length);
		for (String line : lines) {
			list.add(new CSkillTemplate(line, messageManager));
		}
		return list;
	}
	
	public static class CSkillTemplate implements SkillTemplate {
		
		protected String name;
		
		protected short id, studyPrice, needWeaponType, doubleExpType, priceRate;
		
		protected int descriptionId;
		
		protected byte type, useSpace, expType, effectWorkLevel;
		
		protected boolean notGainExp;
		
		protected Map<String, AttributeCell> attributeCells;
		
		protected final MessageManager messageManager;
		
		private CSkillTemplate(String line, MessageManager messageManager) {
			this(messageManager);
			String[] infos = line.split("\t", -2);
			name = infos[0];
			id = MathUtil.stringToShort(infos[1]);
			descriptionId = MathUtil.stringToInt(infos[2], Message.NO_MESSAGE);
			type = MathUtil.stringToByte(infos[3]);
			effectWorkLevel = MathUtil.stringToByte(infos[5]);
			studyPrice = MathUtil.stringToShort(infos[6]);
			priceRate = MathUtil.stringToShort(infos[7]);
			needWeaponType = MathUtil.stringToShort(infos[8]);
			expType = MathUtil.stringToByte(infos[9]);
			useSpace = MathUtil.stringToByte(infos[10]);
			attributeCells = new HashMap<String, AttributeCell>();
			AttributeCell attributeCell = new AttributeCell(Attribute.ATTRIBUTE_TYPE_WORK);
			attributeCell.setValue(Attribute.ATTRIBUTE_WORK_STAMINA, MathUtil.stringToByte(infos[13]));
			attributeCell.setValue(Attribute.ATTRIBUTE_WORK_DEXTERITY, MathUtil.stringToByte(infos[14]));
			attributeCell.setValue(Attribute.ATTRIBUTE_WORK_INTELLIGENCE, MathUtil.stringToByte(infos[15]));
			attributeCells.put(attributeCell.getAttributeType(), attributeCell);
			notGainExp = infos[16].equals("1");
			doubleExpType = MathUtil.stringToShort(infos[17]);
		}
		
		protected CSkillTemplate(MessageManager messageManager) {
			this.messageManager = messageManager;
		}

		@Override
		public String getName() {
			return name;
		}

		@Override
		public short getId() {
			return id;
		}

		@Override
		public String getDescription() {
			Message message = messageManager.getMessage(descriptionId);
			return message == null ? "" : message.getContent();
		}

		@Override
		public byte getType() {
			return type;
		}

		@Override
		public short getStudyPrice() {
			return studyPrice;
		}

		@Override
		public short getNeedWeaponType() {
			return needWeaponType;
		}

		@Override
		public byte getUseSpace() {
			return useSpace;
		}

		@Override
		public byte getExpType() {
			return expType;
		}

		@Override
		public short getDoubleExpType() {
			return doubleExpType;
		}

		@Override
		public byte getEffectWorkLevel() {
			return effectWorkLevel;
		}

		@Override
		public short getPriceRate() {
			return priceRate;
		}

		@Override
		public Map<String, AttributeCell> getAttributes() {
			return attributeCells;
		}

		@Override
		public boolean getNotGainExp() {
			return notGainExp;
		}
		
	}

	@Override
	public void output(File outFile, Collection<SkillTemplate> collection)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

}
