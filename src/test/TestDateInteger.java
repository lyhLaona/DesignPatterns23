package test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDateInteger {

	public static void main(String[] args) {
		Date d = new Date();
		SimpleDateFormat sf = new SimpleDateFormat("yyyyMMdd");
		String str = sf.format(d);
		Integer i = Integer.valueOf(str);
		System.out.println(i);
	}
	
}
