package thread;

public class Info {

	private String name = "老衲";
	private String content = "JAVA";
	
	
	public synchronized void set(String name, String content){
		this.name = name;
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.content = content;
	}
	
	public synchronized void get(){
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(this.name+"-->"+this.content);
	}
	
}
