package basic;

import java.util.Scanner;

public class TestApp8 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int oddsum = 0;
		System.out.println("Even number between 1 to 100 : ");
		for(int i = 1;i <= 100; i+=2)
		{
			System.out.println(i+1);
			oddsum = oddsum + (i);
		}
		System.out.print("\nSum of odd number between 1 to 100 : "+ oddsum); 
	}
}
