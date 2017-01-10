package util;

public class TestIsEmpty {

	public static void main(String[] args) {
		
		System.out.println(stringIsEmpty(null));
		
	}
	
	/*
	 *  "".equals(str)和str.equals("")的区别
		如果当str为null的话 "".equals(str)不会报空指针异常，而str.equals("")会报异常。
		这种方式主要用来防止空指针异常
	 */
	
	public static boolean stringIsEmpty(String str){
		return str.equals("");
	}
	
}
