package ByThread;

public class ThreadEx1 extends Thread {
    public void run() {
        for(int i = 1; i <= 5;i++)
        {
        	try {
        		Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}        
        	System.out.println(i + "====" + Thread.currentThread().getId() + "----" + Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        ThreadEx1 th1 = new ThreadEx1();
        ThreadEx1 th2 = new ThreadEx1();
        ThreadEx1 th3 = new ThreadEx1();
        ThreadEx1 th4 = new ThreadEx1();
        ThreadEx1 th5 = new ThreadEx1();
        
        //th1,th2,th3,th4,th5 --- object --- convert into[thread] ---- Personal CALLSTACK(Execution Area)
        th1.start();// -- Thread --- Job Define ---- run()
        th2.start();
        th3.start();
        th4.start();
        th5.start(); 
    }
}