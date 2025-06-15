package ArrrayBasic;

import java.util.Scanner;

public class MatrixDiagonal {
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
		System.out.println("\nDiagonal Matrix(left to right) b :\n");
		for(int i = 0;i<b.length;i++)
		{
			for(int j = 0;j<b.length;j++)
			{
				if(i == j)
					System.out.print(b[i][j]+"\t");
				else
					System.out.print(" \t");
			}
			System.out.println();
		}
		
		System.out.println("\nDiagonal Matrix(right to left) b :\n");
		for(int i = 0;i<b.length;i++)
		{
			for(int j = 0;j<b.length;j++)
			{
				if(i+j == 2)
					System.out.print(b[i][j]+"\t");
				else
					System.out.print(" \t");
			}
			System.out.println();
		}
	}
}
