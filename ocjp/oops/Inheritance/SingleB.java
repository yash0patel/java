package Inheritance;

public class SingleB extends SingleA{
	public int n2 = 20;
	
	public static void main(String[] args)
	{
		SingleB  B = new SingleB(); 
		System.out.println("n1 : "+B.n1);
		System.out.println("n2 : "+B.n2);
	}
}
