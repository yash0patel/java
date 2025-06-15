package ArrrayBasic;

import java.util.Scanner;

public class ArraySorting {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		for(int i = 0;i<arr.length;i++)
		{
			System.out.print("Enter arr["+i+"] : ");
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0 ; i < arr.length ; i++)
		{
			for(int j = 0 ; j < arr.length ; j++)
			{
				if(arr[i] < arr[j])
				{
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		
		for(int i = 0 ; i<arr.length ; i++)
		{
			System.out.println("arr["+i+"] : "+arr[i]);
		}
	}
}
