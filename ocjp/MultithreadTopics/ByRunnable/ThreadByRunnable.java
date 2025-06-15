package ByRunnable;

public class ThreadByRunnable implements Runnable{
	@Override
	public void run() {
		System.out.println("==> ID : " + Thread.currentThread().getId() + "  |  Name :  " + Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		ThreadByRunnable t1 = new ThreadByRunnable(); 
		ThreadByRunnable t2 = new ThreadByRunnable();
		ThreadByRunnable t3 = new ThreadByRunnable();
		
		Thread th1 = new Thread(t1);
		Thread th2 = new Thread(t2);
		Thread th3 = new Thread(t3);
		
		th1.start();
		th2.start();
		th3.start();
	}
}
