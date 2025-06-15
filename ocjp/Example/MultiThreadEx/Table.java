package MultiThreadEx;

public class Table{
	public synchronized void PrintTable(int num) {
		for(int i = 1 ;i<=10 ;i++)
		{			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(num + "x" + i + " = " + num*i);
		}
	}
}
