package thread;

public class ThreadYield implements Runnable{

	@Override
	public void run() {
		for(int i=0; i<10; i++){
			System.out.println(Thread.currentThread().getName()+i);
			if(i == 3){
				System.out.print(Thread.currentThread().getName()+"线程礼让");
				Thread.currentThread().yield();
			}
		}
	}

	
	
}
