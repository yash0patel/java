package basic;

import java.util.Scanner;

public class TwinNumber {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int num = sc.nextInt();
		int temp = num;
		int sum = 0;
		while(temp>0)
		{
			sum = sum + temp%10;
			temp = temp/10;
		}
		temp = num;
		int prod = 1;
		while(temp>0)
		{
			prod=prod*(temp%10);
			temp = temp/10;
		}
		if(sum == prod)
			System.out.print(num + " is a twin number...");
		else
			System.out.print(num + " is not a twin number...");
	}
}
