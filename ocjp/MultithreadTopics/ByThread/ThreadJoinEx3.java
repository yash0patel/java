package ByThread;

public class ThreadJoinEx3 extends Thread {
    public void run() {
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

    public static void main(String[] args) {
        ThreadJoinEx3 th1 = new ThreadJoinEx3();
        ThreadJoinEx3 th2 = new ThreadJoinEx3();
        ThreadJoinEx3 th3 = new ThreadJoinEx3();
        ThreadJoinEx3 th4 = new ThreadJoinEx3();
        ThreadJoinEx3 th5 = new ThreadJoinEx3();
        
        
        th1.start();
        try {
			th1.join(2000);//first 2000 millisecond th1 run 
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        th2.start();
        th3.start();
        th4.start();
        th5.start(); 
    }
}
