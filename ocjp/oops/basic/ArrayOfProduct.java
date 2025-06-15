package basic;

public class ArrayOfProduct {
	public static void main(String[] args)
	{
		Product p[] = new Product[10];
		

		for(int i=0; i<p.length ; i++)
		{
			p[i] = new Product();
			p[i].scanData();
		}
			
		for(int i=0; i<p.length ; i++)
		{
			p[i].dispData();
		}
		
	}
}
