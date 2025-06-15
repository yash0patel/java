package basic;

import java.util.Scanner;

public class Product {
	private int id;
	private String name;
	private int prize;
	private String mdate;
	private String orgname;
	
	Scanner sc = new Scanner(System.in);
		
	public void scanData()
	{
		System.out.print("Enter Id : ");
		id = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter Product name : ");
		name = sc.nextLine();

		System.out.print("Enter prize : ");
		prize = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter Manufacturing date : ");
		mdate = sc.nextLine();

		System.out.print("Enter orgname : ");
		orgname = sc.nextLine();
		
		System.out.println();
	}
	
	public void dispData()
	{
		System.out.println(id+"  "+name+"  "+prize+"  "+mdate+"  "+orgname);
	}
}
