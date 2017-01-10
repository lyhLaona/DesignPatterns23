package thread;

public class Ticket implements Runnable{

	private int ticket = 5;
	
	@Override
	public void run() {
		for(int i=0; i<100; i++){
			sale();
		}
	}
	
	public synchronized void sale(){
		if(ticket > 0){
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("卖票：ticket = "+ticket--);
		}
	}

	
	
}
