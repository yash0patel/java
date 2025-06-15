package ByThread;

public class ThreadEx2 extends Thread {
	int i = 1;
	public ThreadEx2(int i) {
		this.i = i;
	}
    public void run() {
    	System.out.println(20 + "x" + i + " = " + 20*i);
    }

    public static void main(String[] args) {
        ThreadEx2 th1 = new ThreadEx2(1);
        ThreadEx2 th2 = new ThreadEx2(2);
        ThreadEx2 th3 = new ThreadEx2(3);
        ThreadEx2 th4 = new ThreadEx2(4);
        ThreadEx2 th5 = new ThreadEx2(5);
        
        th1.start();
        try {
			th1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        th2.start();
        try {
			th2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        th3.start();
        try {
			th3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        th4.start();
        try {
			th4.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        th5.start(); 
        try {
			th5.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

}
