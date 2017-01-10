package thread;

public class ThreadJoin implements Runnable{

	@Override
	public void run() {
		for(int i=0; i<50; i++){
			System.out.println(Thread.currentThread().getName()+"运行"+i);
		}
	}

	
	
}
