package thread;

public class RunDemo01Main {

	public static void main(String[] args) {
//		RunDemo01 r1 = new RunDemo01();
//		new Thread(r1,"线程一").start();
//		new Thread(r1,"线程二").start();
//		new Thread(r1,"线程三").start();
		RunDemo02 r2 = new RunDemo02();
//		new Thread(r2).start();
//		r2.run();
//		new Thread(r1).start();
		Thread t1 = new Thread(r2,"线程");
		System.out.println("运行之前-->"+t1.isAlive());
		t1.start();
		System.out.println("运行之后-->"+t1.isAlive());
		for(int i=0; i<3; i++){
			System.out.println("main代码"+i);
		}
		System.out.println("main代码执行之后-->"+t1.isAlive());
	}
	
}
