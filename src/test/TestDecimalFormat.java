package test;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class TestDecimalFormat {

	public static void main(String[] args) {
		BigDecimal bd = new BigDecimal("12546852416854.184");
		DecimalFormat df = new DecimalFormat("#,##0.#");
		df.setRoundingMode(RoundingMode.HALF_UP); 
		System.out.println(df.format(bd));
	}
	
}
