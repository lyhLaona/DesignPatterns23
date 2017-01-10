package test;

import java.math.BigDecimal;
import java.text.NumberFormat;

public class TestNumPercent {

	public static void main(String[] args) {
		
		double d1 = 1234567890;
		double d2 = 99;
		
		NumberFormat nf = NumberFormat.getPercentInstance();
		nf.setMinimumFractionDigits(2);
		System.out.println(nf.format(d1/d2));
		String str1="1234567890123.123";
        BigDecimal bd=new BigDecimal(str1);
        System.out.println(bd);
		nf.format(bd);
	}
	
}
