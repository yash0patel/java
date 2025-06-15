package Inheritance;

public class MultyLevel extends SingleB{
	int n3 = 30;
	
	public static void main(String args[])
	{
		MultyLevel M = new MultyLevel();
		System.out.println("n1 : "+M.n1);
		System.out.println("n2 : "+M.n2);
		System.out.println("n3 : "+M.n3);
	}
}
