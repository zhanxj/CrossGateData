package cg.data.util;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;
import org.jdom2.input.sax.XMLReaders;
import org.jdom2.output.XMLOutputter;

/**
 * @author 	com.pip
 */
public class FileUtils {
	
    /**
     * ����Դ�ļ���Ŀ���ļ���
     */
    public static void copyFile(File src, File dest) throws IOException{
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try{
            fis = new FileInputStream(src);
            fos = new FileOutputStream(dest);
            byte[] data = new byte[256];
            int len;
            while((len = fis.read(data)) >= 0){
                if(len == 0){
                    continue;
                }
                fos.write(data, 0, len);
            }
        }catch(IOException e){
            throw e;
        }finally{
            if(fis != null){
                try{
                    fis.close();
                }catch(IOException e){
                }
            }
            if(fos != null){
                try{
                    fos.close();
                }catch(IOException e){
                }
            }
        }
    }
    
    /**
	 * �ҳ�һ��Ŀ¼�е������ļ�������Ŀ¼�Լ�����
	 * @param dir ��Ŀ¼
	 * @param suffix ��չ������.���ţ�����Сд��null��ʾ������
	 * @param saveSet �����ҳ����ļ�·��
	 */
	public static void findFilesInDir(File dir, String suffix, Set<String> saveSet) {
		if (suffix == null) {
			saveSet.add(dir.getAbsolutePath());
		}
		File[] children = dir.listFiles();
		for (File child : children) {
			if (child.isFile()) {
				if (suffix == null || child.getName().toLowerCase().endsWith(suffix)) {
					saveSet.add(child.getAbsolutePath());
				}
			} else if (child.isDirectory()) {
				findFilesInDir(child, suffix, saveSet);
			}
		}
	}
	

    /**
	 * �ҳ�һ��Ŀ¼�е������ļ����ļ�������������Ŀ¼����
	 * @param dir ��Ŀ¼
	 * @param suffix ��չ��������.���ţ�����Сд
	 * @return �ҵ����ļ������ƣ�����ȫ·������
	 */
	public static String[] listFile(File dir, String suffix) {
		File[] files = dir.listFiles(new FileExtensionFilter(new String[] { suffix }, false));
		String[] ret = new String[files.length];
		for (int i = 0; i < files.length; i++) {
			ret[i] = files[i].getName();
		}
		return ret;
	}

    @SuppressWarnings({ "rawtypes", "unchecked" })
	public static void copyList(List src, List dest){
        for(int i = 0; i < src.size(); i++){
            Object srcObj = src.get(i);
            dest.add(copyObject(srcObj));
        }
    }

    public static Object copyObject(Object src){
        try {
            Object destObj = null;
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream obs = new ObjectOutputStream(bos);
            obs.writeObject(src);
            obs.flush();

            byte[] data = bos.toByteArray();

            ByteArrayInputStream bis = new ByteArrayInputStream(data);
            ObjectInputStream ois = new ObjectInputStream(bis);
            destObj = ois.readObject();
            return destObj;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * �����ļ����ݵ��ַ����顣
     */
    public static byte[] loadFileData(File src) throws IOException{
        FileInputStream fis = null;
        try{
            fis = new FileInputStream(src);
            BufferedInputStream bis = new BufferedInputStream(fis);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] data = new byte[256];
            int len;
            while((len = bis.read(data)) >= 0){
                if(len == 0){
                    continue;
                }
                bos.write(data, 0, len);
            }
            return bos.toByteArray();
        }catch(IOException e){
            throw e;
        }finally{
            if(fis != null){
                try{
                    fis.close();
                }catch(IOException e){
                }
            }
        }
    }

    /**
     * �����ļ����ݵ��ַ���������GBK���롣
     */
    public static String loadFileContent(File src) throws IOException {
    	return loadFileContent(src, "GBK");
    }
    
    public static String loadFileContent(File src, String encoding) throws IOException{
        FileInputStream fis = null;
        try{
            fis = new FileInputStream(src);
            // ����BOM
        	if ("UTF-8BOM".equals(encoding)) {
        		fis.skip(3);
        		encoding = "UTF-8";
        	} else if ("UTF-16LEBOM".equals(encoding)) {
        		fis.skip(2);
        		encoding = "UTF-16LE";
        	} else if ("UTF-16BEBOM".equals(encoding)) {
        		fis.skip(2);
        		encoding = "UTF-16BE";
        	}
            BufferedInputStream bis = new BufferedInputStream(fis);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] data = new byte[256];
            int len;
            while((len = bis.read(data)) >= 0){
                if(len == 0){
                    continue;
                }
                bos.write(data, 0, len);
            }
            return new String(bos.toByteArray(), encoding);
        }catch(IOException e){
            throw e;
        }finally{
            if(fis != null){
                try{
                    fis.close();
                }catch(IOException e){
                }
            }
        }
    }

    /**
     * �������ݵ��ļ���
     */
    public static void saveFileData(File dest, byte[] data) throws IOException{
        FileOutputStream fos = null;
        try{
            fos = new FileOutputStream(dest);
            fos.write(data);
        }catch(IOException e){
            throw e;
        }finally{
            if(fos != null){
                try{
                    fos.close();
                }catch(IOException e){
                }
            }
        }
    }

    /**
     * �����ַ������ļ�������GBK���롣
     */
    public static void saveFileContent(File dest, String content) throws IOException{
    	saveFileContent(dest, content, "GBK");
    }
    
    public static void saveFileContent(File dest, String content, String encoding) throws IOException{
        FileOutputStream fos = null;
        try{
            fos = new FileOutputStream(dest);
            // ����BOM
        	if ("UTF-8BOM".equals(encoding)) {
        		fos.write(0xEF);
        		fos.write(0xBB);
        		fos.write(0xBF);
        		encoding = "UTF-8";
        	} else if ("UTF-16LEBOM".equals(encoding)) {
        		fos.write(0xFF);
        		fos.write(0xFE);
        		encoding = "UTF-16LE";
        	} else if ("UTF-16BEBOM".equals(encoding)) {
        		fos.write(0xFE);
        		fos.write(0xFF);
        		encoding = "UTF-16BE";
        	}
            fos.write(content.getBytes(encoding));
        }catch(IOException e){
            throw e;
        }finally{
            if(fos != null){
                try{
                    fos.close();
                }catch(IOException e){
                }
            }
        }
    }

    /**
     * ת���ַ�����UTF��ʽ��
     */
    public static byte[] toUTF(String s){
        try{
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            DataOutputStream dos = new DataOutputStream(bos);
            dos.writeUTF(s);
            dos.close();
            return bos.toByteArray();
        }catch(Exception e){
            return new byte[0];
        }
    }

    /**
     * ����CRC��ÿ���ֽ�һ��������
     */
    public static short CRC(byte[] data){
        byte byte1 = 0, byte2 = 0;
        for(int i = 0; i < data.length; i += 2){
            if(i < data.length - 1){
                byte1 ^= data[i];
                byte2 ^= data[i + 1];
            }else{
                byte1 ^= data[i];
            }
        }
        return (short)((byte1 << 8) | (byte2 & 0xFF));
    }

    /**
     * ִ��һ��������ѱ�׼����ͱ�׼��������ݱ��浽�ַ����з��ء�
     */
    public static String executeCommand(String cmd, File dir) throws IOException{
        Process p = Runtime.getRuntime().exec(cmd, null, dir);
        StringBuffer buf = new StringBuffer();
        new CommandOutputReader(p.getInputStream(), buf).start();
        new CommandOutputReader(p.getErrorStream(), buf).start();
        int retCode = -1;
        try{
            retCode = p.waitFor();
        }catch(InterruptedException e){
        }
        p.destroy();
        if(retCode == 0){
            return null;
        }else{
            return buf.toString();
        }
    }

    /**
     * ִ��һ�����
     */
    public static void executeCommand(String cmd, String arg, File dir) throws IOException{
        Runtime.getRuntime().exec("\"" + cmd + "\" " + arg, null, dir);
    }

    private static class CommandOutputReader extends Thread{
        private InputStream input;
        private StringBuffer output;

        public CommandOutputReader(InputStream is, StringBuffer buf){
            input = is;
            output = buf;
        }

        public void run(){
            try{
                InputStreamReader isr = new InputStreamReader(input, "GBK");
                int ch;
                while((ch = isr.read()) != -1){
                    synchronized(output){
                        output.append((char)ch);
                    }
                }
            }catch(IOException e){
            }
        }
    }

    /**
     * ɾ��һ��Ŀ¼�Լ���Ŀ¼�µ������ļ���
     */
    public static void deleteDir(File dir){
    	if (dir.exists()) {
	        File[] children = dir.listFiles();
	        for(int i = 0; i < children.length; i++){
	            if(children[i].isDirectory()){
	                deleteDir(children[i]);
	            }else{
	                children[i].delete();
	            }
	        }
	        dir.delete();
    	}
    }

    /**
     * ��һ���쳣ת��Ϊ�ַ�����
     */
    public static String toString(Throwable e){
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        e.printStackTrace(pw);
        return sw.toString();
    }
    
    /**
     * ��һ���ַ����汾��ת��Ϊ������
     */
    public static int parseVersionString(String str) {
    	String[] secs = str.split("\\.");
    	return Integer.parseInt(secs[0]) * 10000 + Integer.parseInt(secs[1]) * 100 + Integer.parseInt(secs[2]);
    }
    
    /**
     * ��һ�������汾��ת��Ϊ�ַ�����
     */
    public static String versionToString(int version) {
    	int v1 = version / 10000;
    	int v2 = (version % 10000) / 100;
    	int v3 = version % 100;
    	return v1 + "." + v2 + "." + v3;
    }
    
    /**
     * �����ı�
     */
    public static void saveText(String text, File file) throws Exception {
        FileOutputStream fos = null;
        String encoding = System.getProperty("pip_xml_encoding");
        if (encoding == null) {
        	encoding = "GBK";
        }
        
        try{
        	fos = new FileOutputStream(file);
        	BufferedOutputStream bos = new BufferedOutputStream(fos);
        	// д�����ǰ׺
        	// unicode litte-endian: FF FE
        	// unicode big-endian: FE FF
        	// utf8: EF BB BF
        	// other: none
        	if (encoding.equalsIgnoreCase("UTF-16") || encoding.equalsIgnoreCase("UTF-16LE")) {
        		bos.write(0xFF);
        		bos.write(0xFE);
        	} else if (encoding.equalsIgnoreCase("UTF-16BE")) {
        		bos.write(0xFE);
        		bos.write(0xFF);
        	} else if (encoding.equalsIgnoreCase("UTF-8")) {
        		bos.write(0xEF);
        		bos.write(0xBB);
        		bos.write(0xBF);
        	}
        	bos.write(text.getBytes(encoding));
        	bos.flush();
        	bos.close();
        }catch(Exception e){
            throw e;
        }finally{
            if(fos != null){
                try{
                    fos.close();
                }catch(IOException e){
                }
            }
        }
    }
    
    /**
     * ����һ��txt�ļ���
     */
    public static void saveText(String text, OutputStream os) throws Exception{
        String encoding = System.getProperty("pip_xml_encoding");
        if (encoding == null) {
        	encoding = "GBK";
        }        
        try{
        	BufferedOutputStream bos = new BufferedOutputStream(os);
        	// д�����ǰ׺
        	// unicode litte-endian: FF FE
        	// unicode big-endian: FE FF
        	// utf8: EF BB BF
        	// other: none
        	if (encoding.equalsIgnoreCase("UTF-16") || encoding.equalsIgnoreCase("UTF-16LE")) {
        		bos.write(0xFF);
        		bos.write(0xFE);
        	} else if (encoding.equalsIgnoreCase("UTF-16BE")) {
        		bos.write(0xFE);
        		bos.write(0xFF);
        	} else if (encoding.equalsIgnoreCase("UTF-8")) {
        		bos.write(0xEF);
        		bos.write(0xBB);
        		bos.write(0xBF);
        	}
        	bos.write(text.getBytes(encoding));
        	bos.flush();
        }catch(Exception e){
            throw e;
        }
    }
    
    /**
     * ��ȡ�ı��ļ�
     */
    public static String loadText(File file) throws Exception{
        FileInputStream fis = null;
        try{
        	byte[] buf = new byte[(int)file.length()];
            fis = new FileInputStream(file);
            new DataInputStream(fis).readFully(buf);
            
            // ����ǰ׺�Զ��жϱ��룬���û��ָ�������ȱʡGBK
            // unicode litte-endian: FF FE
        	// unicode big-endian: FE FF
        	// utf8: EF BB BF
        	// other: none
            String encoding;
            int skip = 0;
            if (buf.length >= 3 && buf[0] == (byte)0xEF && buf[1] == (byte)0xBB && buf[2] == (byte)0xBF) {
            	encoding = "UTF-8";
            	skip = 3;
            } else if (buf.length >= 2 && buf[0] == (byte)0xFE && buf[1] == (byte)0xFF) {
            	encoding = "UTF-16BE";
            	skip = 2;
            } else if (buf.length >= 2 && buf[0] == (byte)0xFF && buf[1] == (byte)0xFE) {
            	encoding = "UTF-16LE";
            	skip = 2;
            } else { 
            	encoding = "GBK";
            }
            
            return new String(buf, skip, buf.length - skip, encoding);
        }catch(IOException e){
            throw e;
        }finally{
            if(fis != null){
                try{
                    fis.close();
                }catch(IOException e){
                }
            }
        }
    	
    }

    /**
     * ����һ��XML�ļ�������JDOMģ�͡�
     */
    public static Document loadDOM(File file) throws Exception {
        SAXBuilder sb = new SAXBuilder();
        sb.setXMLReaderFactory(XMLReaders.NONVALIDATING);
        Document doc = sb.build(file);
        return doc;
    }

    /**
     * ����һ��XML�ļ�������JDOMģ�͡�
     */
    public static Document loadDOM(InputStream is) throws Exception {
        SAXBuilder sb = new SAXBuilder();
        sb.setXMLReaderFactory(XMLReaders.NONVALIDATING);
        Document doc = sb.build(is);
        return doc;
    }
    
    /**
     * ��һ��JDOMģ�ͱ��浽XML�ļ��С�
     */
    public static void saveDOM(Document doc, File file) throws Exception{
    	saveDOM(doc, file, true);
    }
    
    @SuppressWarnings({ "rawtypes", "unchecked" })
	public static void saveDOM(Document doc, File file, boolean addSpace) throws Exception{
        FileOutputStream fos = null;
        String encoding = System.getProperty("pip_xml_encoding");
        if (encoding == null) {
        	encoding = "GBK";
        }
        try{
            XMLOutputter out;
            if (!addSpace) {
            	// ɾ���������õĿո�
            	ArrayList stack = new ArrayList();
            	stack.add(doc.getRootElement());
            	while (stack.size() > 0) {
            		Object obj = stack.remove(0);
            		if (obj instanceof Element) {
            			Element element = (Element)obj;
            			List list = element.getContent();
            			for (int i = 0; i < list.size(); i++) {
            				Object child = list.get(i);
            				if (child instanceof String && ((String)child).trim().isEmpty()) {
            					list.remove(i);
            					i--;
            				} else if (child instanceof Element) {
            					stack.add(child);
            				}
            			}
            		}
            	}
            }
//            out = new XMLOutputter("    ", true, encoding);
            out = new XMLOutputter();
            fos = new FileOutputStream(file);
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            out.output(doc, bos);
            bos.flush();
        }catch(Exception e){
            throw e;
        }finally{
            if(fos != null){
                try{
                    fos.close();
                }catch(IOException e){
                }
            }
        }
    }

    /**
     * ��һ��JDOMģ�ͱ��浽XML�ļ��С�
     */
    public static void saveDOM(Document doc, OutputStream os) throws Exception{
        try{
        	String encoding = System.getProperty("pip_xml_encoding");
            if (encoding == null) {
            	encoding = "GBK";
            }
            XMLOutputter out = new XMLOutputter();
            BufferedOutputStream bos = new BufferedOutputStream(os);
            out.output(doc, bos);
            bos.flush();
        } catch(Exception e) {
            throw e;
        }
    }
    
    /**
     * ����16���Ƶ������ַ�����
     */
    public static int parseHex(String text) {
        text = text.toLowerCase().trim();
        if (text.startsWith("0x")) {
            text = text.substring(2);
        } else if (text.startsWith("x") || text.startsWith("#")) {
            text = text.substring(1);
        }
        if (text.length() < 8) {
            return Integer.parseInt(text, 16);
        } else {
            text = text.substring(text.length() - 8);
            int low = Integer.parseInt(text.substring(1), 16);
            int high = Integer.parseInt(text.substring(0, 1), 16);
            return (high << 28) | low;
        }
    }
    
    /**
     * ��һ��ָ�򱾵��ļ���urlת��Ϊ�ļ�·����
     * @param url
     * @return
     */
    public static String urlToPath(URI url) {
    	String path = url.getPath();
    	if (path.indexOf(':') >= 0) {
    		path = path.substring(1);
    	}
    	return path;
    }
    
    /**
     * �ı�һ������ĳ��ȡ�
     * @param arr
     * @param length
     * @return
     */
    public static int[] realloc(int[] arr, int length) {
        int[] ret = new int[length];
        System.arraycopy(arr, 0, ret, 0, length > arr.length ? arr.length : length);
        return ret;
    }
    
    /**
     * �ı�һ������ĳ��Ȳ�����Ĭ��ֵ��
     * @param arr
     * @param length
     * @return
     */
    public static int[] realloc(int[] arr, int length, int defaultValue) {
        int[] ret = new int[length];
        System.arraycopy(arr, 0, ret, 0, length > arr.length ? arr.length : length);
        for(int i = arr.length;i<length;i++){
        	ret[i] = defaultValue;
        }
        return ret;
    }

    /**
     * �ı�һ������ĳ��ȡ�
     * @param arr
     * @param length
     * @return
     */
    public static float[] realloc(float[] arr, int length) {
        float[] ret = new float[length];
        System.arraycopy(arr, 0, ret, 0, length > arr.length ? arr.length : length);
        return ret;
    }

    /**
     * �ı�һ������ĳ��ȡ�
     * @param arr
     * @param length
     * @return
     */
    public static String[] realloc(String[] arr, int length, String defaultValue) {
        String[] ret = new String[length];
        if (defaultValue != null) {
            Arrays.fill(ret, defaultValue);
        }
        System.arraycopy(arr, 0, ret, 0, length > arr.length ? arr.length : length);
        return ret;
    }
    
    /**
     * ��һ���ַ����ֳ���ָ���ַ������Ķ���ַ���.
     * @param s ԭʼ�ַ���
     * @param ch �ָ��ַ�
     * @return �ָ�������
     */
    public static String[] splitString(String s, char ch) {
        int startIndex = 0;
        int endIndex = 0;
        List<String> vs = new ArrayList<String>();
        while (true) {
            endIndex = s.indexOf(ch, startIndex);
            if (endIndex == -1) {
                vs.add(s.substring(startIndex));
                break;
            } else {
                vs.add(s.substring(startIndex, endIndex));
                startIndex = endIndex + 1;
            }
        }
        String[] strs = new String[vs.size()];
        vs.toArray(strs);
        return strs;
    }
    
    /**
     * �Ѹ�ʽΪn,n,n���ַ�������Ϊint���顣
     * @param str
     * @param delimiter
     * @return
     */
    public static int[] stringToIntArray(String str, char delimiter) {
        if (str == null || str.length() == 0) {
            return new int[0];
        }
        String[] tmp = splitString(str, delimiter);
        int[] ret = new int[tmp.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = Integer.parseInt(tmp[i]);
        }
        return ret;
    }
    
    /**
     * ��int����ת��Ϊ��ʽΪn,n,n���ַ�����
     * @param arr
     * @param delimiter
     * @return
     */
    public static String intArrayToString(int[] arr, char delimiter) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (i > 0) {
                sb.append(delimiter);
            }
            sb.append(arr[i]);
        }
        return sb.toString();
    }
    
    /**
     * ��Listת��Ϊ��ʽΪn,n,n���ַ�����
     * @param arr
     * @param delimiter
     * @return
     */
    public static String intListToString(List<Integer> list, char delimiter) {
    	StringBuilder sb = new StringBuilder();
    	for (int i = 0; i < list.size(); i++) {
    		if (i > 0) {
    			sb.append(delimiter);
    		}
    		sb.append(list.get(i));
    	}
    	return sb.toString();
    }
    
    /**
     * �Ѹ�ʽΪn,n,n���ַ�������Ϊfloat���顣
     * @param str
     * @param delimiter
     * @return
     */
    public static float[] stringToFloatArray(String str, char delimiter) {
        if (str.length() == 0) {
            return new float[0];
        }
        String[] tmp = splitString(str, delimiter);
        float[] ret = new float[tmp.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = Float.parseFloat(tmp[i]);
        }
        return ret;
    }
    
    /**
     * ��float����ת��Ϊ��ʽΪn,n,n���ַ�����
     * @param arr
     * @param delimiter
     * @return
     */
    public static String floatArrayToString(float[] arr, char delimiter) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (i > 0) {
                sb.append(delimiter);
            }
            sb.append(arr[i]);
        }
        return sb.toString();
    }
    
    /**
     * �Ѹ�ʽΪn,n,n���ַ�������ΪString���顣
     * @param str
     * @param delimiter
     * @return
     */
    public static String[] stringToStringArray(String str, char delimiter) {
        if (str.length() == 0) {
            return new String[] { "" };
        }
        return splitString(str, delimiter);
    }
    
    /**
     * ��String����ת��Ϊ��ʽΪn,n,n���ַ�����
     * @param arr
     * @param delimiter
     * @return
     */
    public static String stringArrayToString(String[] arr, char delimiter) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (i > 0) {
                sb.append(delimiter);
            }
            sb.append(arr[i]);
        }
        return sb.toString();
    }
    
    /**
     * ��ת���ַ���
     */
    public static String reverseConv(String msg) {
        StringBuffer buf = new StringBuffer();
        for (int i = 0; i < msg.length(); i++) {
            switch (msg.charAt(i)) {
            case '\n':
                buf.append("\\n");
                break;
            case '\r':
                buf.append("\\r");
                break;
            case '\t':
                buf.append("\\t");
                break;
            case '"':
                buf.append("\\\"");
                break;
            case '\\':
                buf.append("\\\\");
                break;
            default:
                buf.append(msg.charAt(i));
                break;
            }
        }
        return buf.toString();
    }
    
    /**
     * ȡ��Ŀ���ļ������ԭʼ·�������·����
     * @param target
     * @param ref
     * @return ��������ļ�����һ���̷��£�����null��
     */
    public static String getRelatePath(String target, String ref) {
    	File tf = new File(target);
    	File reff = new File(ref);
    	if (!reff.isDirectory()) {
    		reff = reff.getParentFile();
    	}
    	
    	// ���ҵ���ͬ�ĸ��ڵ�
    	File[] path1 = getPathes(tf.getParentFile());
    	File[] path2 = getPathes(reff);
    	int rootIndex = 0;
    	while (rootIndex < path1.length && rootIndex < path2.length && path1[rootIndex].equals(path2[rootIndex])) {
    		rootIndex++;
    	}
    	if (rootIndex == 0) {
    		return null;
    	}
    	StringBuilder sb = new StringBuilder();
    	for (int i = rootIndex; i < path2.length; i++) {
    		sb.append("../");
    	}
    	for (int i = rootIndex; i < path1.length; i++) {
    		sb.append(path1[i].getName() + "/");
    	}
    	sb.append(tf.getName());
    	return sb.toString();
    }
    
    public static String getRelatePath(File target, File ref) {
    	return getRelatePath(target.getAbsolutePath(), ref.getAbsolutePath());
    }
    
    public static File[] getPathes(File f) {
    	List<File> retList = new ArrayList<File>();
    	File ff = f;
    	while (ff != null) {
    		retList.add(0, ff);
    		ff = ff.getParentFile();
    	}
    	File[] ret = new File[retList.size()];
    	retList.toArray(ret);
    	return ret;
    }
    
    /**
     * �滻һ���ļ��ĺ�׺����
     * @param newSuffix ����'.'�ĺ�׺��
     */
    public static File replaceSuffix(File src, String newSuffix) {
    	return new File(replaceSuffix(src.getAbsolutePath(), newSuffix));
    }
    
    /**
     * �滻һ���ļ��ĺ�׺����
     * @param newSuffix ����'.'�ĺ�׺��
     */
    public static String replaceSuffix(String src, String newSuffix) {
    	int pos = src.lastIndexOf('.');
    	if (pos != -1) {
    		return src.substring(0, pos + 1) + newSuffix;
    	} else {
    		return src + "." + newSuffix;
    	}
    }
    
    /**
     * ȡ���ļ��ĺ�׺����
     * @param fname
     * @return
     */
    public static String getSuffix(String fname) {
    	int pos = fname.lastIndexOf('.');
    	if (pos == -1) {
    		return "";
    	} else {
    		return fname.substring(pos + 1);
    	}
    }
    
    /**
     * ���check�ǲ���target�ĸ�Ŀ¼��
     * @param check
     * @param target
     * @return
     */
    public static boolean isAncestorDir(File check, File target) {
    	File p = target.getParentFile();
    	while (p != null) {
    		if (p.equals(check)) {
    			return true;
    		}
    		p = p.getParentFile();
    	}
    	return false;
    }
    
    /**
     * ����һ����ά�ֽ����顣
     * @param source
     * @return
     */
    public static byte[][] dupByteArr2(byte[][] source) {
    	byte[][] ret = new byte[source.length][];
    	for (int i = 0; i < source.length; i++) {
    		ret[i] = Arrays.copyOf(source[i], source[i].length);
    	}
    	return ret;
    }
    
    /**
     * �Ƚ�������ά�ֽ����顣
     * @param source
     * @param target
     * @return
     */
    public static boolean byteArr2Equals(byte[][] source, byte[][] target) {
    	if (source.length != target.length) {
    		return false;
    	}
    	for (int i = 0; i < source.length; i++) {
    		if (!Arrays.equals(source[i], target[i])) {
    			return false;
    		}
    	}
    	return true;
    }
    
    /**
     * ��GZIP�㷨ѹ��һ�����ݡ�
     * @param src
     * @return
     * @throws IOException
     */
    public static byte[] compressGZIP(byte[] src) throws IOException {
    	ByteArrayOutputStream bos = new ByteArrayOutputStream(src.length);
        GZIPOutputStream zos = new GZIPOutputStream(bos);
        zos.write(src);
        zos.flush();
        zos.close();
        return bos.toByteArray();
    }

    /**
     * ��ѹ��GZIP��ʽ���ļ���
     * @param src
     * @return
     * @throws IOException
     */
    public static byte[] decomppressGZIP(byte[] src) throws IOException {
    	ByteArrayOutputStream bos = new ByteArrayOutputStream(src.length * 10);
    	GZIPInputStream gis = new GZIPInputStream(new ByteArrayInputStream(src));
    	while (true) {
    		int ch = gis.read();
    		if (ch == -1) {
    			break;
    		} else {
    			bos.write(ch);
    		}
    	}
    	gis.close();
    	return bos.toByteArray();
    }
}
