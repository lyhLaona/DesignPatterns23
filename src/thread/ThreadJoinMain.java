package thread;

public class ThreadJoinMain {

	public static void main(String[] args) {
		
		ThreadJoin j = new ThreadJoin();
		Thread t = new Thread(j,"线程");
		t.start();
		try {
			t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
//		new Thread(j,"线程").start();
		for(int i=0; i<50; i++){
			System.out.println("main运行"+i);
		}
		
	}
	
}
