package properties;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Test01 {

	public static void main(String[] args) {
//		Properties p = new Properties();
//		try {
//			InputStream in = new BufferedInputStream(new FileInputStream("alarmOrder.properties"));
//			try {
//				p.load(in);
//				in.close();
//				
//				System.out.println(p.getProperty("alarmOrder.userId"));
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
		         try{
		        	 Properties prop = new Properties();     
		            //读取属性文件a.properties
		            InputStream in = new BufferedInputStream (new FileInputStream("../DesignPatterns23/src/properties/alarmOrder.properties"));
		            
		             prop.load(in);     ///加载属性列表
		             in.close();
		             System.out.println(prop.getProperty("alarmOrder.userId"));
		         }catch(Exception e){
		             System.out.println(e);
		         }
	}
	
}
