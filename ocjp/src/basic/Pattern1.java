package basic;

import java.util.Scanner;

public class Pattern1 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		for(int i = 0;i<5;i++)
		{
			for(int j = 0 ; j <= i ; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i = 5;i>0;i--)
		{
			for(int j = i ; j > 0 ; j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i = 0;i<5;i++)
		{
			for(int k = 4;k > i  ; k--)
			{
				System.out.print(" ");
			}
			for(int j = 0 ; j <= i ; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i = 5;i>0;i--)
		{
			for(int k = 5;k > i  ; k--)
			{
				System.out.print(" ");
			}
			for(int j = i ; j > 0 ; j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i = 0;i<5;i++)
		{
			for(int k = 4;k > i  ; k--)
			{
				System.out.print(" ");
			}
			for(int j = 0 ; j <= i*2 ; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i = 5;i>0;i--)
		{
			for(int k = 5;k > i  ; k--)
			{
				System.out.print(" ");
			}
			for(int j = i*2 ; j > 1 ; j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		int a=0;
		for(int i = 0;i<=10;i++)
		{
				for(int k = 0;k < (10-a)  ; k++)
				{
					System.out.print(" ");
				}
				for(int j = 0 ; j <= a ; j++)
				{
					System.out.print("* ");
				}
				if(i<10/2)
					a++;
				if(i>=10/2)
					a--;
				System.out.println();
			}		
	}
}
