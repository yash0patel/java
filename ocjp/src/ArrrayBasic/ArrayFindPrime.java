package ArrrayBasic;

import java.util.Scanner;

public class ArrayFindPrime {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		for(int i = 0;i<arr.length;i++)
		{
			System.out.print("Enter arr["+i+"] : ");
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Prime number in array : ");
		for(int i = 0;i<arr.length;i++)
		{
			int count=0;
			for(int j = 2;j<arr[i];j++)
			{
				if(arr[i]%j == 0)
				{
					count++;
					break;
				}
			}
			if(count == 0)
				System.out.println("arr["+i+"] : "+arr[i]);
		}
	}
}
