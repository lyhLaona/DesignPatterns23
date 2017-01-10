package test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDate {

	public static void main(String[] args) {
		try{
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyMMdd");
			String str = "2016-09-09";
			String str1 = "2016-08-09";
			Date date = sdf.parse(str);
			Date date1 = sdf.parse(str1);
			
		}catch(Exception e){
			
		}
	}
	
}
