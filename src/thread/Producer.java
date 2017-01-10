package thread;

public class Producer implements Runnable{

	private Info info = null;
	
	public Producer(Info info) {
		this.info = info;
	}

	@Override
	public void run() {
		boolean flag = false;
		for(int i=0; i<50; i++){
			if(flag){
				this.info.set("laona", "JAVA");
				flag = false;
			}else{
				this.info.set("LT", "IOS");
				flag = true;
			}
		}
		
	}
	
}
