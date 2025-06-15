package basic;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int num = sc.nextInt();
		int count = 0;
		for(int i = 2; i < num;i++)
		{
			if(num%i == 0)
			{	
				count++;
				break;
			}
		}
		if(num == 0)
			System.out.println("Zero");
		else if(count == 0)
			System.out.println(num + " is a prime number");
		else
			System.out.println(num + " is not a prime number");
	}
}
