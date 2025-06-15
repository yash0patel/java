package basic;
import java.util.Scanner;

public class Customer {
	private int id;
	private String name;
	private String product;
	private int price;
	
	Scanner sc = new Scanner(System.in);
		
	public void scanData()
	{
		System.out.print("Enter Id : ");
		id = sc.nextInt();
		sc.nextLine();

		System.out.print("Enter Customer name : ");
		name = sc.nextLine();
		
		System.out.print("Enter product name : ");
		product = sc.nextLine();
		
		System.out.print("Enter price : ");
		price = sc.nextInt();

		System.out.println();
	}
	
	public void dispData()
	{
		System.out.println(id+"  "+name+"  "+product+"  "+price);
	}
}
