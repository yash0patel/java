package ArrrayBasic;

import java.util.Scanner;

public class ArraySumOfEvenAndOdd {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		int evensum = 0;
		int oddsum = 0;
		
		for(int i = 0;i<arr.length;i++)
		{
			System.out.print("Enter arr["+i+"] : ");
			arr[i] = sc.nextInt();
			if(arr[i]%2 == 0)
				evensum = evensum+arr[i];
			else
				oddsum = oddsum+arr[i];
		}
		System.out.println("Sum of Even Element = "+evensum);
		System.out.println("Sum of Odd Element = "+oddsum);
	}
}
