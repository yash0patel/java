package ex;

import java.util.Scanner;

public class CallCharges {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String name;
		int idno;
		int calls;
		double cost = 380;
		
		System.out.print("Enter Total Calls made by Subscriber : ");
		calls = sc.nextInt();
	
		System.out.print("Enter Subscriber Id Number : ");
		idno = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter Subscriber Name : ");
		name = sc.nextLine();
		
		if(calls > 20 && calls <= 1020)
		{
			cost += (calls-20)*1.5;
		}
		else if(calls > 1020)
		{
			cost += (1000*1.5) + ((calls-1020)*3.0);
		}
		
		System.out.println("Id\tName\tCalls\tTotal Cost");
		System.out.println(idno+"\t"+name+"\t"+calls+"\t"+cost);
	}
}
