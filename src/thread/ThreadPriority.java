package thread;

public class ThreadPriority implements Runnable {

	@Override
	public void run() {
		for(int i=0; i<5; i++){
			if(Thread.currentThread().getName().equals("A")){
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println(Thread.currentThread().getName()+"运行"+i);
		}
	}

}
