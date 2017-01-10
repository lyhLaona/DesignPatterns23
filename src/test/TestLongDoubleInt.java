package test;

import java.math.BigDecimal;

public class TestLongDoubleInt {

	public static void main(String[] args) {
//		double d = 1000000000.00000000000000000000000000000002;
//		long l = 1000000000;
//		System.out.println(l/2000000000);
		BigDecimal bd = new BigDecimal("1000000000");
		BigDecimal bd2 = new BigDecimal("2000000000");
		
		System.out.println(bd.divide(bd2).doubleValue());
	}
	
}
