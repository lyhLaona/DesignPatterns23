package test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestCalendar {

	public static void main(String[] args) {
        try {
        	SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
//        	String str = "2016-09-02";
//			Date date = sdf.parse(str);
			Calendar ca = Calendar.getInstance();
			ca.set(2015,2,31);
			ca.add(Calendar.MONTH, -1);
			System.out.println(sdf.format(ca.getTime()));
//			ca.setTime(date);
			/*
			 * year - the value used to set the YEAR calendar field.
			 * 年用于设置日历字段的值。   
			   month - the value used to set the MONTH calendar field. Month value is 0-based. e.g., 0 for January.
			         月,用于设置月日历字段的值。月值是基于0。如。1,0。  (0代表一月份，1代表2月份。。。)
			   date - the value used to set the DAY_OF_MONTH calendar field.
			         日期——用于设置DAY_OF_MONTH日历字段的值。
			 */
//			ca.set(2015, 2, 02);      
//			ca.add(Calendar.MONTH,-1);
//			ca.set(Calendar.DATE, 1);
//			ca.add(Calendar.DAY_OF_MONTH, -1);
//			System.out.println(ca.getTime());
//			System.out.println(sdf.format(ca.getTime()));
//			ca.set(Calendar.YEAR, 2016);
//			ca.set(Calendar.MONTH, 5);
			
//			System.out.println(sdf.format(ca.getActualMaximum(ca.DATE)));
        	
//        	System.out.println(getLastDayOfMonth(2015,3));
//        	System.out.println(getDateStr("M",6));
//        	testY();
        	
        } catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static String getDateStr(String MOY,int months){
		try{
			String dateStr = "";
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
			Calendar ca = Calendar.getInstance();
			
			if(MOY.equals("Y")){
				Date endDate = ca.getTime();
				int year = ca.get(Calendar.YEAR);
				ca.set(year, 0, 1);
				Date startDate = ca.getTime();
				ca = Calendar.getInstance();
				ca.set(Calendar.DATE, 1);
				ca.add(Calendar.DAY_OF_MONTH, -1);
				System.out.println(sdf.format(startDate));
				System.out.println(sdf.format(endDate));
				while(startDate.before(ca.getTime()) && endDate.after(ca.getTime())){
					dateStr += sdf.format(ca.getTime())+",";
					ca.set(Calendar.DATE, 1);
					ca.add(Calendar.DAY_OF_MONTH, -1);
				}
			}else if(MOY.equals("M")){
				if(months>2 && months<13){
					for(int i=1;i<months;i++){
						ca.set(Calendar.DATE, 1);
						ca.add(Calendar.DAY_OF_MONTH, -1);
						dateStr += sdf.format(ca.getTime())+",";
					}
				}
			}
			if(dateStr != ""){
				dateStr.subSequence(0, dateStr.length()-1);
			}
			return dateStr;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	
	private static int getLastDayOfMonth(int year, int month) {  
        Calendar cal = Calendar.getInstance();  
        cal.set(Calendar.YEAR, year);  
        cal.set(Calendar.MONTH, month);  
        // 某年某月的最后一天  
        return cal.getActualMaximum(Calendar.DATE);  
    }
	
	public static void testY(){
		String dateStr = "";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		Calendar ca = Calendar.getInstance();
		dateStr += sdf.format(ca.getTime())+",";
		
		Date endDate = ca.getTime();
		int year = ca.get(Calendar.YEAR);
		ca.set(year, 0, 1);
		Date startDate = ca.getTime();
		
		ca = Calendar.getInstance();
		ca.set(Calendar.DATE, 1);
		ca.add(Calendar.DAY_OF_MONTH, -1);
		System.out.println("startDate"+sdf.format(startDate));
		System.out.println("endDate"+sdf.format(endDate));
		while(startDate.before(ca.getTime()) && endDate.after(ca.getTime())){
			dateStr += sdf.format(ca.getTime())+",";
			ca.set(Calendar.DATE, 1);
			ca.add(Calendar.DAY_OF_MONTH, -1);
		}
		if(dateStr != ""){
			dateStr.subSequence(0, dateStr.length()-1);
		}
		System.out.println(dateStr);
	}
	
	
	
}
