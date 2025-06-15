package basic;

import java.util.Scanner;

public class PrimeNumberInRange {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter lower limite : ");
		int start = sc.nextInt();
		System.out.print("Enter upper limite : ");
		int end = sc.nextInt();
		
		for(int i = start;i<=end;i++)
		{
			int count = 0;
			for(int j = 2;j<i;j++)
			{
				if(i%j==0)
				{
					count++;
					break;
				}
			}
			if(count == 0)
				System.out.print(i+" ");
		}
	}
}
