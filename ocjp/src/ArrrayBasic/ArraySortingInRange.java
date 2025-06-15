package ArrrayBasic;

import java.util.Scanner;

public class ArraySortingInRange {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[20];
		for(int i = 0;i<arr.length;i++)
		{
			System.out.print("Enter arr["+i+"] : ");
			arr[i] = sc.nextInt();
		}
		
		System.out.println("\nEnter indexes to sorting :");
		System.out.print("\nEnter First Index : ");
		int start = sc.nextInt();
		System.out.print("Enter Last Index : ");
		int end = sc.nextInt();
		System.out.println("Sorted array Between Index "+start+" to "+end+" : \n");
		for(int i = start ; i <= end ; i++)
		{
			for(int j = start ; j <= end ; j++)
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

