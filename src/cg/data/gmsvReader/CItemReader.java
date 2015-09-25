package cg.data.gmsvReader;

import static cg.base.sprite.Attribute.ATTRIBUTE_AGILITY;
import static cg.base.sprite.Attribute.ATTRIBUTE_ATTACK;
import static cg.base.sprite.Attribute.ATTRIBUTE_DEFEND;
import static cg.base.sprite.Attribute.ATTRIBUTE_EXTEND_AVOID;
import static cg.base.sprite.Attribute.ATTRIBUTE_EXTEND_COUNTER;
import static cg.base.sprite.Attribute.ATTRIBUTE_EXTEND_CRITICAL;
import static cg.base.sprite.Attribute.ATTRIBUTE_EXTEND_HIT;
import static cg.base.sprite.Attribute.ATTRIBUTE_EXTEND_MIND;
import static cg.base.sprite.Attribute.ATTRIBUTE_EXTEND_RECOVER;
import static cg.base.sprite.Attribute.ATTRIBUTE_HP_MAX;
import static cg.base.sprite.Attribute.ATTRIBUTE_MP_MAX;
import static cg.base.sprite.Attribute.ATTRIBUTE_RESIST_AMNESIA;
import static cg.base.sprite.Attribute.ATTRIBUTE_RESIST_CONFUSION;
import static cg.base.sprite.Attribute.ATTRIBUTE_RESIST_INTOXICATION;
import static cg.base.sprite.Attribute.ATTRIBUTE_RESIST_MAGIC;
import static cg.base.sprite.Attribute.ATTRIBUTE_RESIST_POISON;
import static cg.base.sprite.Attribute.ATTRIBUTE_RESIST_SLEEP;
import static cg.base.sprite.Attribute.ATTRIBUTE_RESIST_STONE;
import static cg.base.sprite.Attribute.ATTRIBUTE_TYPE_BASE;
import static cg.base.sprite.Attribute.ATTRIBUTE_TYPE_EXTEND;
import static cg.base.sprite.Attribute.ATTRIBUTE_TYPE_RESIST;
import static cg.base.sprite.Attribute.ATTRIBUTE_TYPE_WORK;
import static cg.base.sprite.Attribute.ATTRIBUTE_WORK_CHARM;
import static cg.base.sprite.Attribute.ATTRIBUTE_WORK_DEXTERITY;
import static cg.base.sprite.Attribute.ATTRIBUTE_WORK_INTELLIGENCE;
import static cg.base.sprite.Attribute.ATTRIBUTE_WORK_STAMINA;

import java.io.File;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import cg.base.util.MathUtil;
import cg.data.item.ItemTemplate;
import cg.data.limitValue.LimitValueFactory;
import cg.data.limitValue.LimitValueOfByte;
import cg.data.limitValue.LimitValueOfInt;
import cg.data.limitValue.LimitValueOfShort;
import cg.data.resource.MessageManager;
import cg.data.resource.ObjectReader;
import cg.data.resource.ProjectData;
import cg.data.sprite.Message;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

public class CItemReader implements ObjectReader<ItemTemplate> {
	
	private MessageManager messageManager;
	
	public CItemReader(MessageManager messageManager) {
		this.messageManager = messageManager;
	}

	@Override
	public List<ItemTemplate> read(ProjectData projectData) {
		String[] lines = projectData.getTextResource("itemset");
		List<ItemTemplate> itemTemplates = Lists.newArrayListWithCapacity(lines.length);
		LimitValueFactory limitValueFactory = LimitValueFactory.getInstance();
		for (String line : lines) {
			String[] infos = line.split("\t", -2);
			CItemTemplate itemTemplate = new CItemTemplate();
			itemTemplate.unidentifyName = infos[0];
			itemTemplate.identifyName = infos[1];
			itemTemplate.useEffect = infos[2];
			itemTemplate.useInit = infos[3];
			// 4
			itemTemplate.useProcess = infos[5];
			// 6
			// 7
			itemTemplate.dropProcess = infos[8];
			itemTemplate.pickupProcess = infos[9];
			// 10
			itemTemplate.id = MathUtil.stringToInt(infos[11]);
			itemTemplate.iconId = MathUtil.stringToInt(infos[12]);
			itemTemplate.sellPrice = MathUtil.stringToInt(infos[13]);
			itemTemplate.type = MathUtil.stringToByte(infos[14]);
			// 15
			itemTemplate.doubleHand = infos[16].equals("1");
			itemTemplate.canDoubleClick = infos[17].equals("1");
			itemTemplate.canUseInBattle = infos[18].equals("1");
			// 19
			// 20
			// 21
			itemTemplate.groupSize = MathUtil.stringToShort(infos[22], (short) 1);
			itemTemplate.level = MathUtil.stringToByte(infos[23]);
			// 24
			itemTemplate.durable = limitValueFactory.createLimitValue(MathUtil.stringToShort(infos[25]), MathUtil.stringToShort(infos[26]));
			itemTemplate.attackCount = limitValueFactory.createLimitValue(MathUtil.stringToByte(infos[27]), MathUtil.stringToByte(infos[28]));
			// 29	[0, 1]
			itemTemplate.isPrecent = infos[30].equals("1");
			
			Map<Byte, LimitValueOfInt> values = Maps.newHashMap();
			LimitValueOfInt value = limitValueFactory.createLimitValue(MathUtil.stringToInt(infos[31]), MathUtil.stringToInt(infos[32]));
			values.put(ATTRIBUTE_ATTACK, value);
			value = limitValueFactory.createLimitValue(MathUtil.stringToInt(infos[33]), MathUtil.stringToInt(infos[34]));
			values.put(ATTRIBUTE_DEFEND, value);
			value = limitValueFactory.createLimitValue(MathUtil.stringToInt(infos[35]), MathUtil.stringToInt(infos[36]));
			values.put(ATTRIBUTE_AGILITY, value);
			itemTemplate.attributes.put(ATTRIBUTE_TYPE_BASE, values);
			
			values = Maps.newHashMap();
			value = limitValueFactory.createLimitValue(MathUtil.stringToInt(infos[37]), MathUtil.stringToInt(infos[38]));
			values.put(ATTRIBUTE_EXTEND_MIND, value);
			value = limitValueFactory.createLimitValue(MathUtil.stringToInt(infos[39]), MathUtil.stringToInt(infos[40]));
			values.put(ATTRIBUTE_EXTEND_RECOVER, value);
			value = limitValueFactory.createLimitValue(MathUtil.stringToInt(infos[41]), MathUtil.stringToInt(infos[42]));
			values.put(ATTRIBUTE_EXTEND_CRITICAL, value);
			value = limitValueFactory.createLimitValue(MathUtil.stringToInt(infos[43]), MathUtil.stringToInt(infos[44]));
			values.put(ATTRIBUTE_EXTEND_COUNTER, value);
			value = limitValueFactory.createLimitValue(MathUtil.stringToInt(infos[45]), MathUtil.stringToInt(infos[46]));
			values.put(ATTRIBUTE_EXTEND_HIT, value);
			value = limitValueFactory.createLimitValue(MathUtil.stringToInt(infos[47]), MathUtil.stringToInt(infos[48]));
			values.put(ATTRIBUTE_EXTEND_AVOID, value);
			itemTemplate.attributes.put(ATTRIBUTE_TYPE_EXTEND, values);

			value = limitValueFactory.createLimitValue(MathUtil.stringToInt(infos[49]), MathUtil.stringToInt(infos[50]));
			itemTemplate.attributes.get(ATTRIBUTE_TYPE_BASE).put(ATTRIBUTE_HP_MAX, value);
			value = limitValueFactory.createLimitValue(MathUtil.stringToInt(infos[51]), MathUtil.stringToInt(infos[52]));
			itemTemplate.attributes.get(ATTRIBUTE_TYPE_BASE).put(ATTRIBUTE_MP_MAX, value);
			
			itemTemplate.luck = limitValueFactory.createLimitValue(MathUtil.stringToByte(infos[53]), MathUtil.stringToByte(infos[54]));
			// 55	[-99490, 123]
			// 56	[-99490, 123]
			
			values = Maps.newHashMap();
			value = limitValueFactory.createLimitValue(MathUtil.stringToInt(infos[57]), MathUtil.stringToInt(infos[58]));
			values.put(ATTRIBUTE_WORK_CHARM, value);
			itemTemplate.attributes.put(ATTRIBUTE_TYPE_WORK, values);
			
			itemTemplate.elementAttribute_1 = MathUtil.stringToByte(infos[59]);
			itemTemplate.elementAttribute_2 = MathUtil.stringToByte(infos[60]);
			itemTemplate.elementAttributeValue_1 = MathUtil.stringToByte(infos[61]);
			itemTemplate.elementAttributeValue_2 = MathUtil.stringToByte(infos[62]);

			value = limitValueFactory.createLimitValue(MathUtil.stringToInt(infos[63]), MathUtil.stringToInt(infos[64]));
			itemTemplate.attributes.get(ATTRIBUTE_TYPE_WORK).put(ATTRIBUTE_WORK_STAMINA, value);
			value = limitValueFactory.createLimitValue(MathUtil.stringToInt(infos[65]), MathUtil.stringToInt(infos[66]));
			itemTemplate.attributes.get(ATTRIBUTE_TYPE_WORK).put(ATTRIBUTE_WORK_DEXTERITY, value);
			value = limitValueFactory.createLimitValue(MathUtil.stringToInt(infos[67]), MathUtil.stringToInt(infos[68]));
			itemTemplate.attributes.get(ATTRIBUTE_TYPE_WORK).put(ATTRIBUTE_WORK_INTELLIGENCE, value);
			
			values = Maps.newHashMap();
			value = limitValueFactory.createLimitValue(MathUtil.stringToInt(infos[69]), MathUtil.stringToInt(infos[70]));
			values.put(ATTRIBUTE_RESIST_POISON, value);
			value = limitValueFactory.createLimitValue(MathUtil.stringToInt(infos[71]), MathUtil.stringToInt(infos[72]));
			values.put(ATTRIBUTE_RESIST_SLEEP, value);
			value = limitValueFactory.createLimitValue(MathUtil.stringToInt(infos[73]), MathUtil.stringToInt(infos[74]));
			values.put(ATTRIBUTE_RESIST_STONE, value);
			value = limitValueFactory.createLimitValue(MathUtil.stringToInt(infos[75]), MathUtil.stringToInt(infos[76]));
			values.put(ATTRIBUTE_RESIST_INTOXICATION, value);
			value = limitValueFactory.createLimitValue(MathUtil.stringToInt(infos[77]), MathUtil.stringToInt(infos[78]));
			values.put(ATTRIBUTE_RESIST_CONFUSION, value);
			value = limitValueFactory.createLimitValue(MathUtil.stringToInt(infos[79]), MathUtil.stringToInt(infos[80]));
			values.put(ATTRIBUTE_RESIST_AMNESIA, value);
			itemTemplate.attributes.put(ATTRIBUTE_TYPE_RESIST, values);
			
			itemTemplate.specialType = MathUtil.stringToShort(infos[81]);
			itemTemplate.subTypeParam[0] = MathUtil.stringToInt(infos[82]);
			itemTemplate.subTypeParam[1] = MathUtil.stringToInt(infos[83]);
			itemTemplate.gemWeaponType = MathUtil.stringToShort(infos[84]);
			itemTemplate.gemArmorType = MathUtil.stringToShort(infos[85]);
			// 86	{6002, 6000, 411, 6003, 509, ""}
			// 87	{0, ""}
			itemTemplate.logoutDispear = infos[88].equals("1");
			itemTemplate.dropDispear = infos[89].equals("1");
			itemTemplate.canPostByPet = infos[90].equals("1");

			value = limitValueFactory.createLimitValue(MathUtil.stringToInt(infos[91]), MathUtil.stringToInt(infos[92]));
			itemTemplate.attributes.get(ATTRIBUTE_TYPE_RESIST).put(ATTRIBUTE_RESIST_MAGIC, value);
			
			itemTemplate.canComposite = infos[93].equals("1");
			itemTemplate.descriptionId = MathUtil.stringToInt(infos[94], -1);
			itemTemplate.rightButtonDescriptionId = MathUtil.stringToInt(infos[95], -1);
			itemTemplate.identifyRate = MathUtil.stringToByte(infos[96]);
			// 97	{0, 1, 5, 10, 30}
			// 98	{0, 1, 5, 10, 30}
			itemTemplate.magicAttack = limitValueFactory.createLimitValue(MathUtil.stringToShort(infos[99]), MathUtil.stringToShort(infos[100]));
			// 101	{0, 1, 20, 40}
			itemTemplates.add(itemTemplate);
		}
		return itemTemplates;
	}
	
	private class CItemTemplate implements ItemTemplate {
		
		private int id;
		
		private String unidentifyName;
		
		private String identifyName;
		
		private int buyPrice;
		
		private int sellPrice;
		
		private short groupSize;
		
		private String useEffect;
		
		private String useInit;
		
		private String useProcess;
		
		private String dropProcess;
		
		private String pickupProcess;
		
		private int iconId;
		
		private byte type;
		
		private boolean doubleHand;
		
		private boolean canDoubleClick;
		
		private byte level;
		
		private LimitValueOfShort durable;
		
		private LimitValueOfByte attackCount;
		
		private boolean isPrecent;
		
		private Map<String, Map<Byte, LimitValueOfInt>> attributes;
		
		private Map<String, List<Byte>> attributeTypes;
		
		private LimitValueOfByte luck;
		
		private byte elementAttribute_1;
		
		private byte elementAttribute_2;
		
		private byte elementAttributeValue_1;
		
		private byte elementAttributeValue_2;
		
		private short specialType;
		
		private int[] subTypeParam;
		
		private short gemWeaponType;
		
		private short gemArmorType;
		
		private boolean logoutDispear;
		
		private boolean dropDispear;
		
		private boolean canPostByPet;
		
		private boolean canComposite;
		
		private boolean canUseInBattle;
		
		private int descriptionId;
		
		private int rightButtonDescriptionId;
		
		private byte identifyRate;
		
		private LimitValueOfShort magicAttack;
		
		public CItemTemplate() {
			attributes = Maps.newHashMap();
			attributeTypes = Maps.newHashMap();
			subTypeParam = new int[2];
		}

		@Override
		public String toString() {
			StringBuilder sb = new StringBuilder(getClass().getName());
			sb.append(" : id = " + id);
			sb.append(" ; unidentifyName = " + unidentifyName);
			sb.append(" ; identifyName = " + identifyName);
			sb.append(" ; specialType = " + specialType);
			sb.append(" ; sellPrice = " + sellPrice);
			sb.append(" ; groupSize = " + groupSize);
			sb.append(" ; useEffect = " + useEffect);
			sb.append(" ; useInit = " + useInit);
			sb.append(" ; useProcess = " + useProcess);
			sb.append(" ; dropProcess = " + dropProcess);
			sb.append(" ; pickupProcess = " + pickupProcess);
			sb.append(" ; iconId = " + iconId);
			sb.append(" ; type = " + type);
			sb.append(" ; doubleHand = " + doubleHand);
			sb.append(" ; canDoubleClick = " + canDoubleClick);
			sb.append(" ; level = " + level);
			sb.append(" ; durable " + durable);
			sb.append(" ; attackCount " + attackCount);
			sb.append(" ; isPrecent = " + isPrecent);
			Iterator<String> keySet = attributes.keySet().iterator();
			while (keySet.hasNext()) {
				String valueKey = keySet.next();
				Map<Byte, LimitValueOfInt> value = attributes.get(valueKey);
				Iterator<Byte> keys = value.keySet().iterator();
				while (keys.hasNext()) {
					if (valueKey.equals(ATTRIBUTE_TYPE_BASE)) {
						byte key = keys.next();
						switch (key) {
						case ATTRIBUTE_AGILITY : 
							sb.append(" ; ATTRIBUTE_AGILITY = " + value.get(key));
							break;
						case ATTRIBUTE_ATTACK : 
							sb.append(" ; ATTRIBUTE_ATTACK = " + value.get(key));
							break;
						case ATTRIBUTE_DEFEND : 
							sb.append(" ; ATTRIBUTE_DEFEND = " + value.get(key));
							break;
						case ATTRIBUTE_HP_MAX : 
							sb.append(" ; ATTRIBUTE_HP_MAX = " + value.get(key));
							break;
						case ATTRIBUTE_MP_MAX : 
							sb.append(" ; ATTRIBUTE_MP_MAX = " + value.get(key));
							break;
						default : 
							sb.append(" ; unknow type = " + key + " ; value = " + value.get(key));
						}
					} else if (valueKey.equals(ATTRIBUTE_TYPE_EXTEND)) {
						byte key = keys.next();
						switch (key) {
						case ATTRIBUTE_EXTEND_AVOID : 
							sb.append(" ; ATTRIBUTE_EXTEND_AVOID = " + value.get(key));
							break;
						case ATTRIBUTE_EXTEND_COUNTER : 
							sb.append(" ; ATTRIBUTE_EXTEND_COUNTER = " + value.get(key));
							break;
						case ATTRIBUTE_EXTEND_CRITICAL : 
							sb.append(" ; ATTRIBUTE_EXTEND_CRITICAL = " + value.get(key));
							break;
						case ATTRIBUTE_EXTEND_HIT : 
							sb.append(" ; ATTRIBUTE_EXTEND_HIT = " + value.get(key));
							break;
						case ATTRIBUTE_EXTEND_MIND : 
							sb.append(" ; ATTRIBUTE_EXTEND_MIND = " + value.get(key));
							break;
						case ATTRIBUTE_EXTEND_RECOVER : 
							sb.append(" ; ATTRIBUTE_EXTEND_RECOVER = " + value.get(key));
							break;
						default : 
							sb.append(" ; unknow type = " + key + " ; value = " + value.get(key));
						}
					} else if (valueKey.equals(ATTRIBUTE_TYPE_RESIST)) {
						byte key = keys.next();
						switch (key) {
						case ATTRIBUTE_RESIST_AMNESIA : 
							sb.append(" ; ATTRIBUTE_RESIST_AMNESIA = " + value.get(key));
							break;
						case ATTRIBUTE_RESIST_CONFUSION : 
							sb.append(" ; ATTRIBUTE_RESIST_CONFUSION = " + value.get(key));
							break;
						case ATTRIBUTE_RESIST_INTOXICATION : 
							sb.append(" ; ATTRIBUTE_RESIST_INTOXICATION = " + value.get(key));
							break;
						case ATTRIBUTE_RESIST_MAGIC : 
							sb.append(" ; ATTRIBUTE_RESIST_MAGIC = " + value.get(key));
							break;
						case ATTRIBUTE_RESIST_POISON : 
							sb.append(" ; ATTRIBUTE_RESIST_POISON = " + value.get(key));
							break;
						case ATTRIBUTE_RESIST_SLEEP : 
							sb.append(" ; ATTRIBUTE_RESIST_SLEEP = " + value.get(key));
							break;
						case ATTRIBUTE_RESIST_STONE : 
							sb.append(" ; ATTRIBUTE_RESIST_STONE = " + value.get(key));
							break;
						default : 
							sb.append(" ; unknow type = " + key + " ; value = " + value.get(key));
						}
					} else if (valueKey.equals(ATTRIBUTE_TYPE_WORK)) {
						byte key = keys.next();
						switch (key) {
						case ATTRIBUTE_WORK_CHARM : 
							sb.append(" ; ATTRIBUTE_WORK_CHARM = " + value.get(key));
							break;
						case ATTRIBUTE_WORK_DEXTERITY : 
							sb.append(" ; ATTRIBUTE_WORK_DEXTERITY = " + value.get(key));
							break;
						case ATTRIBUTE_WORK_INTELLIGENCE : 
							sb.append(" ; ATTRIBUTE_WORK_INTELLIGENCE = " + value.get(key));
							break;
						case ATTRIBUTE_WORK_STAMINA : 
							sb.append(" ; ATTRIBUTE_WORK_STAMINA = " + value.get(key));
							break;
						default : 
							sb.append(" ; unknow type = " + key + " ; value = " + value.get(key));
						}
					}
				}
			}
			sb.append(" ; luck " + luck);
			sb.append(" ; elementAttribute_1 = " + elementAttribute_1);
			sb.append(" ; elementAttribute_2 = " + elementAttribute_2);
			sb.append(" ; elementAttributeValue_1 = " + elementAttributeValue_1);
			sb.append(" ; elementAttributeValue_2 = " + elementAttributeValue_2);
			sb.append(" ; subTypeParam = " + subTypeParam);
			sb.append(" ; gemWeaponType = " + gemWeaponType);
			sb.append(" ; gemArmorType = " + gemArmorType);
			sb.append(" ; logoutDispear = " + logoutDispear);
			sb.append(" ; dropDispear = " + dropDispear);
			sb.append(" ; canPostByPet = " + canPostByPet);
			sb.append(" ; canComposite = " + canComposite);
			sb.append(" ; description = " + getDescription());
			sb.append(" ; rightButtonDescription = " + getRightButtonDescription());
			sb.append(" ; identifyRate = " + identifyRate);
			sb.append(" ; magicAttack " + magicAttack);
			return sb.toString();
		}

		@Override
		public int getId() {
			return id;
		}

		@Override
		public String getUnidentifyName() {
			return unidentifyName;
		}

		@Override
		public String getIdentifyName() {
			return identifyName;
		}

		@Override
		public int getBuyPrice() {
			return buyPrice;
		}

		@Override
		public int getSellPrice() {
			return sellPrice;
		}

		@Override
		public short getGroupSize() {
			return groupSize;
		}

		@Override
		public String getUseEffect() {
			return useEffect;
		}

		@Override
		public String getUseInit() {
			return useInit;
		}

		@Override
		public String getUseProcess() {
			return useProcess;
		}

		@Override
		public String getDropProcess() {
			return dropProcess;
		}

		@Override
		public String getPickupProcess() {
			return pickupProcess;
		}

		@Override
		public int getIconId() {
			return iconId;
		}

		@Override
		public byte getType() {
			return type;
		}

		@Override
		public boolean getDoubleHand() {
			return doubleHand;
		}

		@Override
		public boolean getCanDoubleClick() {
			return canDoubleClick;
		}

		@Override
		public byte getLevel() {
			return level;
		}

		@Override
		public boolean getIsPrecent() {
			return isPrecent;
		}

		@Override
		public LimitValueOfShort getDurable() {
			return durable;
		}

		@Override
		public LimitValueOfByte getAttackCount() {
			return attackCount;
		}

		@Override
		public LimitValueOfInt getAttribute(String type, byte valueType) {
			return attributes.get(type).get(valueType);
		}

		@Override
		public LimitValueOfByte getLuck() {
			return luck;
		}

		@Override
		public byte getElementAttribute_1() {
			return elementAttribute_1;
		}

		@Override
		public byte getElementAttribute_2() {
			return elementAttribute_2;
		}

		@Override
		public byte getElementAttributeValue_1() {
			return elementAttributeValue_1;
		}

		@Override
		public byte getElementAttributeValue_2() {
			return elementAttributeValue_2;
		}

		@Override
		public short getSpecialType() {
			return specialType;
		}

		@Override
		public int[] getSubTypeParam() {
			return subTypeParam;
		}

		@Override
		public short getGemWeaponType() {
			return gemWeaponType;
		}

		@Override
		public short getGemArmorType() {
			return gemArmorType;
		}

		@Override
		public boolean getLogoutDispear() {
			return logoutDispear;
		}

		@Override
		public boolean getDropDispear() {
			return dropDispear;
		}

		@Override
		public boolean getCanPostByPet() {
			return canPostByPet;
		}

		@Override
		public boolean getCanComposite() {
			return canComposite;
		}

		@Override
		public String getDescription() {
			Message message = descriptionId == -1 ? null : messageManager.getMessage(descriptionId);
			return message == null ? "" : message.getContent();
		}

		@Override
		public String getRightButtonDescription() {
			Message message = rightButtonDescriptionId == -1 ? null : messageManager.getMessage(rightButtonDescriptionId);
			return message == null ? "" : message.getContent();
		}

		@Override
		public byte getIdentifyRate() {
			return identifyRate;
		}

		@Override
		public LimitValueOfShort getMagicAttack() {
			return magicAttack;
		}

		@Override
		public Map<String, List<Byte>> getAttributeTypes() {
			return attributeTypes;
		}

		@Override
		public boolean getCanUseInBattle() {
			return canUseInBattle;
		}
		
	}

	@Override
	public void output(File outFile, Collection<ItemTemplate> collection)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

}
