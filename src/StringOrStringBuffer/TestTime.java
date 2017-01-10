package StringOrStringBuffer;

public class TestTime {

	public static void main(String[] args) {
//		testString();
		TestSub();
	}
	
	public static void TestSub(){
		long s = System.currentTimeMillis();
		String tempstr = "abcdefghijklmnopqrstuvwxyz";
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<5000;i++){
			sb.append(tempstr);
		}
		long e = System.currentTimeMillis();
		long time = e-s;
		System.out.println(sb.toString());
		System.out.println(time);
	}
	
	public static void testString(){
//		String str1 = "abc";
//		String str2 = "";
//		long s = System.currentTimeMillis();
//		for(int i=0;i<5000;i++){
//			str2 += str1;
//			System.out.println(str2);
//		}
//		long e = System.currentTimeMillis();
//		long time = e-s;
//		System.out.println(str1);
//		System.out.println(time);
		long lstart1 = System.currentTimeMillis();
		 String tempstr = "abcdefghijklmnopqrstuvwxyz";
	        int times = 5000;
	        String str = "";
	        for (int i = 0; i < times; i++) {
	            str += tempstr;
	        }
	        long lend1 = System.currentTimeMillis();
	        long time = (lend1 - lstart1);
	        System.out.println(time);
	}
	
}
