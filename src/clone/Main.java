package clone;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
//		System.out.println(new Date());
//		for(int i=0;i<100000000;i++){
//			Student s = new Student("laona", 23);
//		}
//		System.out.println("----------------"+new Date());
//		Student ss = new Student("laona", 23);
//		for(int i=0;i<100000000;i++){
//			Student s2 = ss.clone();
//		}
//		System.out.println(new Date());
		
		Student2 s2 = new Student2("laona", 11);
		s2.setWorkE("万德", "1992-02-03 12:12:11");
		System.out.println(s2);
		
		Student2 s3 = s2.clone();
		s3.setWorkE("优一", "2016-02-03 12:12:12");
		System.out.println(s3);
		
		Student2 s4 = s2.clone();
		s4.setWorkE("工程", "2013-09-01 13:13:13");
		
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
	}
	
}
