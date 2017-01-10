package thread;

public class Main {

	public static void main(String[] args) {
		/**
		 *   线程优先级
		 */
//		Thread t1 = new Thread(new ThreadPriority(),"A");
//		Thread t2 = new Thread(new ThreadPriority(),"B");
//		Thread t3 = new Thread(new ThreadPriority(),"C");
//		t1.setPriority(Thread.MAX_PRIORITY);
//		t2.setPriority(Thread.MIN_PRIORITY);
//		t3.setPriority(Thread.MIN_PRIORITY);
//		t1.start();
//		t2.start();
//		t3.start();
		
		/**
		 *   main 方法的线程优先级
		 */
//		System.out.println("主方法的优先级："+Thread.currentThread().getPriority());
		
		/**
		 *   线程礼让
		 */
//		ThreadYield y = new ThreadYield();
//		Thread t1 = new Thread(y,"A");
//		Thread t2 = new Thread(y,"B");
//		t1.start();
//		t2.start();
		
		/**
		 *   同步与死锁
		 */
//		Ticket t = new Ticket();
//		Thread t1 = new Thread(t);
//		Thread t2 = new Thread(t);
//		Thread t3 = new Thread(t);
//		Thread t4 = new Thread(t);
//		Thread t5 = new Thread(t);
//		Thread t6 = new Thread(t);
//		Thread t7 = new Thread(t);
//		Thread t8 = new Thread(t);
//		t1.start();
//		t2.start();
//		t3.start();
//		t4.start();
//		t5.start();
//		t6.start();
//		t7.start();
//		t8.start();
		
		/**
		 *   模拟死锁
		 */
//		DeadLock dl1 = new DeadLock();
//		DeadLock dl2 = new DeadLock();
//		dl1.flag = true;
//		dl2.flag = false;
//		Thread t1 = new Thread(dl1);
//		Thread t2 = new Thread(dl2);
//		t1.start();
//		t2.start();
		
		/**
		 *   生产者与消费者
		 */
		Info i = new Info();
		Producer p = new Producer(i);
		Consumer c = new Consumer(i);
		Thread t1 = new Thread(p);
		Thread t2 = new Thread(c);
		t1.start();
		t2.start();
		
		
	}
	
}
