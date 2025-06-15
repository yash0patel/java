package ex;

import java.util.Scanner;

public class LibraryCharges {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String name;
		int cn;
		int days;
		double fine=0;
		
		System.out.print("Enter Name : ");
		name = sc.nextLine();
		
		System.out.print("Enter Card Number: ");
		cn = sc.nextInt();
		
		System.out.print("Enter Numbers of Days : ");
		days = sc.nextInt();
		
		if(days <= 5)
		{
			fine = days*1;
		}
		else if(days > 5 && days <= 10)
		{
			fine = 5 + ((days-5)*2);
		}
		else if(days > 10)
		{
			fine = 15 + ((days-10)*4);
		}
		
		System.out.println("Name\t\tCard Number\tDays Late\tFine Amount");
		System.out.println(name+"\t\t"+cn+"         \t"+days+"\t        "+fine);
	}
}
