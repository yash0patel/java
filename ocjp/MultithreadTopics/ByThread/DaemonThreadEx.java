package ByThread;

public class DaemonThreadEx extends Thread{
	@Override
	public void run() {
		if(Thread.currentThread().isDaemon())
		{
			System.out.println("Daemon Thread : " + Thread.currentThread().getName());
		}
		else
		{
			for(int i = 1; i <= 5;i++)
	        {
	        	try {
	        		Thread.sleep(500);
				} catch (Exception e) {
					// TODO: handle exception
				}        
	        	System.out.println(i + "==> ID : " + Thread.currentThread().getId() + "  |  Name :  " + Thread.currentThread().getName());
	        }
		}
	}
	public static void main(String[] args) {
		DaemonThreadEx th1 = new DaemonThreadEx();
		DaemonThreadEx th2 = new DaemonThreadEx();
		DaemonThreadEx th3 = new DaemonThreadEx();
		DaemonThreadEx th4 = new DaemonThreadEx();
		DaemonThreadEx th5 = new DaemonThreadEx();
		
		th1.setName("C");
		th2.setName("C++");
		th3.setName("Java");
		th4.setName("Python");
		th5.setName("Cool");
		
		th2.setDaemon(true);
		
		th1.setPriority(Thread.MAX_PRIORITY);
		th2.setPriority(Thread.MAX_PRIORITY);
		th3.setPriority(Thread.NORM_PRIORITY);
		th4.setPriority(Thread.MIN_PRIORITY);
		th5.setPriority(Thread.MIN_PRIORITY);
		
		th1.start();
		th2.start();
		th3.start();
		th4.start();		
		th5.start();
	}
}
