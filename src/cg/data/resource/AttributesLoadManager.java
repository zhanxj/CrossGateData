package cg.data.resource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.WorkbookSettings;

import org.jdom2.Document;
import org.jdom2.Element;

import cg.base.util.MathUtil;

/**
 * EXCEL��ݼ��ؼ�����
 * @author 	Joyce
 */
public class AttributesLoadManager {
	
	private static HashMap<String, AttributeConfigDef> CONFIG_MAP = new HashMap<String, AttributeConfigDef>();
	
	private static HashMap<String, WorkbookCacheItem> WORKBOOK_CACHE = new HashMap<String, WorkbookCacheItem>();
	
	private static HashMap<String, SheetCacheItem> SHEET_CACHE = new HashMap<String, SheetCacheItem>();
	
	private static class AttributeConfigDef {
		
		public String name, sheetname, file;
		
		public HashMap<String, AttributeParamDef> params = new HashMap<String, AttributeParamDef>();
		
	}
	
	private static class AttributeParamDef {
		
		public String name, colnum;
		
	}
	
	private static class SheetCacheItem {
		
        public String fileName, sheetName;
        
        public Sheet sheet;
        
    }
	
	private static class WorkbookCacheItem {
		
		public String path;
		
		public Workbook book;
		
	}
	
    private static String buildCacheKey(String bookName, String sheetName){
        return bookName + "_" + sheetName;
    }
    
    private static AttributeConfigDef checkPara(String claName, String keyParamName, String[] paramNames, Object paramValues) throws Exception{
        AttributeConfigDef config = CONFIG_MAP.get(claName);
        if (config == null) {
            throw new Exception("û���ҵ�" + claName + "��Ӧ�ķ���������Ϣ.");
        }
        
        String filePath = WORKBOOK_CACHE.get(config.file).path;
        if (filePath == null) {
            throw new Exception("û���ҵ�" + config.file + "��Ӧ���ļ�·��.");
        }
        if (paramNames == null || paramValues == null) {
            throw new Exception("ָ����������");
        }
        
        if (paramValues instanceof int[][]) {
            if (paramNames.length != ((int [][])paramValues).length) {
                throw new Exception("ָ����������");
            }
        } else if(paramValues instanceof String[][]) {
            if (paramNames.length != ((String[][]) paramValues).length) {
                throw new Exception("ָ����������");
            }
        }
        
        return config;
    }
    
	public static void loadConfigData(ProjectData projectData) throws Exception {
		CONFIG_MAP.clear();
		WORKBOOK_CACHE.clear();
		SHEET_CACHE.clear();

		Document document = projectData.getXmlResource("excel_config_def");
		Element element = document.getRootElement();
		
		List<Element> list = element.getChildren("source_file");
		int len = list.size();
		for(int i = 0;i < len;i++){
			Element elem = list.get(i);
			String name = elem.getAttributeValue("name");
			String path = elem.getAttributeValue("path");
			
			WorkbookSettings ws = new WorkbookSettings();
			ws.setSuppressWarnings(true);
			ws.setCellValidationDisabled(true);
			Workbook workbook = projectData.getWorkbook(path);
			WorkbookCacheItem bookItem = new AttributesLoadManager.WorkbookCacheItem();
			bookItem.path = path;
			bookItem.book = workbook;
			WORKBOOK_CACHE.put(name, bookItem);
		}
		
		list = element.getChildren("attribute_config_def");
		len = list.size();
		for (int i = 0;i < len;i++) {
			Element elem = list.get(i);
			AttributeConfigDef config = new AttributesLoadManager.AttributeConfigDef();
			config.name = elem.getAttributeValue("name");
			config.sheetname = elem.getAttributeValue("sheetname");
			config.file = elem.getAttributeValue("file");
			
			if (!SHEET_CACHE.containsKey(buildCacheKey(config.file, config.sheetname))) {
			    WorkbookCacheItem bookItem = WORKBOOK_CACHE.get(config.file);
				if (bookItem == null) {
					throw new Exception("û���ҵ�" + config.file + "�ļ���");
				}
				
				Sheet sheet = bookItem.book.getSheet(config.sheetname);
				if (sheet == null) {
					throw new Exception("û���ҵ�sheet:" + config.sheetname);
				}
				
				SheetCacheItem sheetItem = new AttributesLoadManager.SheetCacheItem();
				sheetItem.fileName = config.file;
				sheetItem.sheetName = config.sheetname;
				sheetItem.sheet = bookItem.book.getSheet(sheetItem.sheetName);
				
				SHEET_CACHE.put(buildCacheKey(sheetItem.fileName, sheetItem.sheetName), sheetItem);
			}

			List<Element> list2 = elem.getChildren("param");
			for (Element elem2 : list2) {
				AttributeParamDef param = new AttributeParamDef();
				param.name = elem2.getAttributeValue("name");
				param.colnum = elem2.getAttributeValue("colnum");
				config.params.put(param.name, param);
			}
			
			CONFIG_MAP.put(config.name, config);
		}
	}
    
	/**
	 * �����������
	 * ������һ��������һ������ֵ
	 * @param claName ���������
	 * @param keyParamName �ؼ��ֲ�����
	 * @param paramName ������ 
	 * @param paramValue ����ֵ�����ַ
	 * @throws Exception
	 */	
	public static int[] loadAttributesData(String claName, String keyParamName, String paramName) throws Exception {
		return loadAttributesData(claName, keyParamName, paramName, 0);
	}

	public static int[] loadAttributesData(String claName, String keyParamName, String paramName, int defaultValue) throws Exception {
		int[][] tmpData = new int[1][0];
		loadAttributesData(claName, keyParamName, new String[]{paramName}, tmpData, defaultValue);
		return tmpData[0];
	}
	
	/**
	 * �����������
	 * ֧��һ�μ���ͬ�����ݵĶ������ֵ
	 * @param claName ���������
	 * @param keyParamName �ؼ��ֲ�����
	 * @param paramNames �������б� 
	 * @param paramValues ֵ�б?���ؽ��������ַ
	 * @throws Exception
	 */	
    public static void loadAttributesData(String claName, String keyParamName, String[] paramNames, int[][] paramValues, int defaultValue) throws Exception {
        AttributeConfigDef config = checkPara(claName, keyParamName, paramNames, paramValues);
        SheetCacheItem cacheItem = SHEET_CACHE.get(buildCacheKey(config.file, config.sheetname));
        if (cacheItem == null) {
            throw new Exception("û���ҵ�sheet: " + claName + " , " + keyParamName);
        }

        AttributeParamDef keyParamDef = config.params.get(keyParamName); // �ؼ�����Ŀ
        Cell[] keyCells = cacheItem.sheet.getColumn(MathUtil.charToInt(keyParamDef.colnum));

        int startRow = 0;
        for (Cell cell : keyCells) {
            String content = cell.getContents().trim();
            if(content.matches("\\d+")){
                break;
            }
            startRow++;
        }

        int paramIdx = 0;
        for (String paramName : paramNames) {
            AttributeParamDef paramDef = config.params.get(paramName);
            Cell[] cellValues = cacheItem.sheet.getColumn(MathUtil.charToInt(paramDef.colnum));
            int[] values = new int[cellValues.length];
            int c = 0;
            for (int i = startRow; i < cellValues.length; i++) {
                String content = cellValues[i].getContents().trim();
                if (!content.matches("\\d+")) {
                    break;
                }
                values[c++] = Integer.parseInt(content);
            }
            paramValues[paramIdx] = new int[c];
            System.arraycopy(values, 0, paramValues[paramIdx], 0, c);
            paramIdx++;
        }
    }
	
	public static String[] loadAttributesStrData(String claName, String keyParamName, String paramName) throws Exception {
		String[][] tmpData = new String[1][0];
		loadAttributesStrData(claName, keyParamName, new String[]{paramName}, tmpData);
		return tmpData[0];
	}
	
    public static void loadAttributesStrData(String claName, String keyParamName, String[] paramNames, String[][] paramValues) throws Exception {
        AttributeConfigDef config = checkPara(claName, keyParamName, paramNames, paramValues);
        SheetCacheItem cacheItem = SHEET_CACHE.get(buildCacheKey(config.file, config.sheetname));

        if (cacheItem == null) {
            throw new Exception("û���ҵ�sheet: " + claName + " , " + keyParamName);
        }

        AttributeParamDef keyParamDef = config.params.get(keyParamName);//�ؼ�����Ŀ
        Cell[] keyCells = cacheItem.sheet.getColumn(MathUtil.charToInt(keyParamDef.colnum));

        int startRow = 0;
        for (Cell cell : keyCells) {
            String content = cell.getContents().trim();
            if (content.matches("\\d+")) {
                break;
            }
            startRow++;
        }

        int paramIdx = 0;
        for (String paramName : paramNames) {
            ArrayList<String> values = new ArrayList<String>();
            AttributeParamDef paramDef = config.params.get(paramName);
            Cell[] cellValues = cacheItem.sheet.getColumn(MathUtil.charToInt(paramDef.colnum));
            for(int i = startRow;i < cellValues.length;i++){
                String content = cellValues[i].getContents().trim();
                values.add(content);
            }
            String[] tmpV = values.toArray(new String[0]);
            int len = tmpV.length;
            paramValues[paramIdx] = new String[len];
            System.arraycopy(tmpV, 0, paramValues[paramIdx], 0, tmpV.length);
            paramIdx++;
        }
    }
	
}
