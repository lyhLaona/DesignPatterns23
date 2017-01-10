package thread;

public class DeadLock implements Runnable{
	private static ZhangSan zs = new ZhangSan();
	private static LiSi ls = new LiSi();
	public boolean flag = false;

	@Override
	public void run() {
		
		if(flag){
			synchronized(zs){
				zs.say();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				synchronized (ls) {
					zs.get();
				}
			}
		}else{
			synchronized (ls) {
				ls.say();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				synchronized (zs) {
					ls.get();
				}
			}
		}
		
	}

}
