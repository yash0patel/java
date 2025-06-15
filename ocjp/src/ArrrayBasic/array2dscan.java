package ArrrayBasic;

import java.util.Scanner;

public class array2dscan {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int [][]b = {{1,2,3},{4,5,6},{7,8,9}};
		int a[][] = new int[3][3];
		System.out.println("\nMatrix b :\n");
		for(int i = 0;i<b.length;i++)
		{
			for(int j = 0;j<b.length;j++)
			{
				System.out.println("b["+i+"]["+j+"] : "+b[i][j]);
			}
		}
		System.out.println();
		for(int i = 0;i<a.length;i++)
		{
			for(int j = 0;j<a.length;j++)
			{
				System.out.print("Enter a["+i+"]["+j+"] : ");
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("\nMatrix a :\n");
		for(int i = 0;i<a.length;i++)
		{
			for(int j = 0;j<a.length;j++)
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
