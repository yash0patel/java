package ArrrayBasic;

import java.util.Scanner;

public class MatrixRowColSum {
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
		System.out.println("\n Matrix row and col sum :\n");
		int sum[] = {0,0,0};
		for(int i = 0;i<=b.length;i++)
		{
			int count = 0;
			int rowsum = 0;
			for(int j = 0;j<b.length;j++)
			{
				if(i == b.length)
				{
					System.out.println("="+sum[0]+"\t="+sum[1]+"\t="+sum[2]);
					break;
				}
				else
				{
					System.out.print(b[i][j]+"\t");
					rowsum = rowsum+b[i][j];
					sum[count] = sum[count] + b[i][j];
					count++;
				}
			}
			if(i != b.length)
				System.out.println("="+rowsum);
		}
	}
}
