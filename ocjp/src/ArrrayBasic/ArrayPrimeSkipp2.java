package ArrrayBasic;

import java.util.Scanner;

public class ArrayPrimeSkipp2 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[20];
		int i = 0;
		int num = 2;
		int flag = 0;
		System.out.println("\nPrime number array : ");
		while(arr.length > flag)
		{
			int count=0;
			for(int j = 2;j<num;j++)
			{
				if(num%j == 0)
				{
					count++;
					break;
				}
			}
			if(count == 0)
			{
				if(i%3==0)
				{
					arr[flag] = num;
					System.out.println("arr["+flag+"] : "+arr[flag]);
					flag++;
				}
				i++;
			}
			num++;
		}
	}
}

