package ArrrayBasic;

import java.util.Scanner;

public class MatrixRowSum {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int [][]b = {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println("\nMatrix b :\n");
		for(int i = 0;i<b.length;i++)
		{
			for(int j = 0;j<b.length;j++)
			{
				System.out.print(b[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("\n Matrix row sum :\n");
		for(int i = 0;i<b.length;i++)
		{
			int sum = 0;
			for(int j = 0;j<b.length;j++)
			{
				System.out.print(b[i][j]+"\t");
				sum = sum + b[i][j];
			}
			System.out.println("="+sum);
		}
	}
}
