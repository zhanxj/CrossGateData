package cg.data.util;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CommonUtil {
	
	private static final SimpleDateFormat format = new SimpleDateFormat("yy-MM-dd HH:mm");
    public static String getDateString(Date date){
    	if(date==null){
    		return "";
    	}
        return format.format(date);
    }

    private static final DecimalFormat percentFormat = new DecimalFormat("####.#"); 
 
    public static String formatValue(int value) {
        return String.valueOf(Math.abs(value));
    }
    
    public static String formatValue(float value) {
        return formatFloat(Math.abs(value));
    }
    
    public static String formatValue(String value) {
        return value;
    }
    
    public static String formatPercent(float p) {
        return percentFormat.format(Math.abs(p)) + "%";
    }

    public static String formatFloat(double p) {
        return percentFormat.format(Math.abs(p));
    }
    
    public static String HOUR = "小时";
    public static String MINUTE = "分";
    public static String SECOND = "秒";
   
    
    public static String formatSecond(int sec) {
        if (sec < 60) {
            return sec + SECOND;
        } else if (sec < 3600) {
            return (sec / 60) + MINUTE + (sec % 60) + SECOND;
        } else {
            return (sec / 3600) + HOUR + ((sec % 3600) / 60) + MINUTE;
        }
    }
    
    public static String formatMillSecond(int ms) {
        int sec = ms / 1000;;
        float sec2 = ms / 1000.0f;
        if (sec < 60) {
            return formatFloat(sec2) + SECOND;
        } else if (sec < 3600) {
            return (sec / 60) + MINUTE + (sec % 60) + SECOND;
        } else {
            return (sec / 3600) + HOUR + ((sec % 3600) / 60) + MINUTE;
        }
    }
	
	public static final int currentMillis(){
		return (int)(System.currentTimeMillis()&0xFFFFFFFF);
	}
	
	public static final int getMapId(int globalId){
		return globalId>>12;
	}
	

    public static boolean hit(Random rnd, int chance, int base){
    	if (chance <= 0) {
    		return false;
    	}
        int r = rnd.nextInt(base);
        if (r <= chance)
            return true;
        return false;
    }
    
    public static int getCount(Random rnd, int min, int max){
    	if(min==max)
    		return min;
        return rnd.nextInt(max - min + 1) + min;
    }
    
    public static int getInt(byte[] bytes,int offset){
    	return (((bytes[offset] << 24)&0xFF000000) | ((bytes[offset+1] << 16)&0xFF0000) | ((bytes[offset+2] << 8)&0xFF00) | ((bytes[offset+3]&0xFF)));
    }
    
    public static void main(String[] args){
//    	int angle = Unit.calcAngle(220, 155, 274, 159);
//    	int angle1 = Unit.calcAngle(274, 159, 193, 212);
//    	int angle2 = Unit.calcAngle(192, 212, 220, 155);
////    	int angle = Unit.calcAngle(274, 159, 220, 155);
////    	int angle1 = Unit.calcAngle(212, 193, 274, 159);
////    	int angle2 = Unit.calcAngle(220, 155, 192, 212);
//    	System.out.println(String.format("%d  %d  %d", angle,angle1,angle2));
//    	Random rnd = new Random();
//    	for(int i=0;i<50;i++){
//    		System.out.println(rnd.nextInt(1000000));
//    	}
//    	System.out.println(true^true);
//    	System.out.println(false^false);
//    	System.out.println(true^false);
//    	try {
//			f(0);
//		}finally{
//			
//		}
//		int j= 0;
    	Pattern pattern = Pattern.compile("/\\d\\d");
    	String s = "sjfksasdfkdfdsa;/11/1sdfdsfj1i28384/23";
    	Matcher matcher = pattern.matcher(s);
    	boolean m = matcher.find();
    	while(m){
    		String g = matcher.group();
    		System.out.println(g);
    		m = matcher.find();
    	}
    }
    
    public static String ip2str(int ip) {
    	return ((ip >> 24) & 0xFF) + "." + ((ip >> 16) & 0xFF) + "." + 
			((ip >> 8) & 0xFF) + "." + (ip & 0xFF);
    }
    
    public static void f(int i){
    	if(i==0)
    		throw new IllegalArgumentException();
    }
    
    /**
     * @brief 检查一个数字ID是否在一个ID列表中（用字符串表示，逗号分隔）
     * @param id
     * @param idList
     * @return
     */
    public static boolean existsInArr(int id, String idList) {
    	String[] secs = idList.split(",");
    	String idStr = String.valueOf(id);
    	for (int i = 0; i < secs.length; i++) {
    		if (idStr.equals(secs[i])) {
    			return true;
    		}
    	}
    	return false;
    }
    
    public static boolean inDistance(int srcX, int srcY, int destX, int destY , int distance){
  		int xdist = Math.abs(destX - srcX);
  		int ydist = Math.abs(destY - srcY);
  		return xdist * xdist + ydist * ydist <= distance * distance;
  	}
    
}
