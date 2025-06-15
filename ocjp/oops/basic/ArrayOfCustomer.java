package basic;

public class ArrayOfCustomer {
	public static void main(String[] args)
	{
		Customer c[] = new Customer[5];
	
		for(int i=0; i<c.length ; i++)
		{
			c[i] = new Customer();
			c[i].scanData();
		}
		
		for(int i=0; i<c.length ; i++)
		{
			c[i].dispData();
		}
	}
}
