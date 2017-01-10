package thread;

public class Demo01 {

	public static void main(String[] args) {
		
		Thread thread = new Thread(){
			@Override
			public void run() {
				int i=0;
				while(i<5){
						System.out.println("1: "+Thread.currentThread().getName());
						System.out.println("2: "+this.getName());
						i++;
				}
			}
		};
		thread.start();
		
	}
	
}
