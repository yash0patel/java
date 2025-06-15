package basic;

import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int num = sc.nextInt();
		int temp = num;
		int newnum = 0;
		while(temp > 0)
		{
			newnum = (newnum*10)+temp%10;
			temp = temp/10;
		}
		if(newnum == num)
			System.out.print("Palindrome");
		else
			System.out.print("non Palindrome");
	}
}
