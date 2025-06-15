package basic;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int num = sc.nextInt();
		int temp = num;
		int sum = 0;
		int digits = 0;
		while(temp > 0)
		{
			temp = temp/10;
			digits++;
			
		}
		temp = num;
		while(temp>0)
		{
			sum = sum + (int)Math.pow(temp%10, digits);
			temp = temp/10;
		}
		if(sum == num)
			System.out.print(num + " is an Armstrong number");
		else
			System.out.print(num + " is not an Armstrong number");
		
	}
}
