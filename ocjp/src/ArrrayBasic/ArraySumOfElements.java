package ArrrayBasic;

import java.util.Scanner;

public class ArraySumOfElements {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		int sum = 0;
		
		for(int i = 0; i<arr.length ; i++)
		{
			System.out.print("Enter arr["+i+"] : ");
			arr[i] = sc.nextInt();
			sum = sum+arr[i];
		}
		
		System.out.println("Sum of Elements = "+sum);
	}
}
