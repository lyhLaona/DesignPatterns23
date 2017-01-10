package thread;

public class Consumer implements Runnable{

	private Info info = null;
	
	public Consumer(Info info) {
		this.info = info;
	}

	@Override
	public void run() {
		for(int i=0; i<50; i++){
//			try {
//				Thread.sleep(100);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
			this.info.get();
		}
		
	}
	
	
	
}
