package reflection;

import java.io.Serializable;

public class Test01 implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		// 通过一个对象获取完整的类名和包名
//		Per p = new Per();
//		System.out.println(p.getClass().getName());
		
		// 实例化Class类对象
//		Class<?> class1 = null;
//		Class<?> class2 = null;
//		Class<?> class3 = null;
//		
//		try {
//			class1 = Class.forName("reflection.Per");
//			class2 = new Per().getClass();
//			class3 = Per.class;
//			System.out.println("类名称："+class1.getName());
//			System.out.println("类名称："+class2.getName());
//			System.out.println("类名称："+class3.getName());
//			System.out.println("类名称："+getName(Per.class));
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}
		
		//获取一个对象的父类与实现的接口
		try {
			Class<?> class1 = Class.forName("reflection.Per");
			Class<?> parentClass = class1.getSuperclass();
			System.out.println("父类："+parentClass.getName());
			Class<?> inter[] = class1.getInterfaces();
			System.out.print("实现的接口：");
			for(int i=0; i<inter.length; i++){
				System.out.print(inter[i].getName()+"  ");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
	public static String getName(Class<?> class1){
		String str="";
		str = class1.getName();
		return str;
	}
	
}
