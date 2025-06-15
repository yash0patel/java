package ArrrayBasic;

import java.util.Scanner;

public class ArrayFindPalindrome {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		for(int i = 0;i<arr.length;i++)
		{
			System.out.print("Enter arr["+i+"] : ");
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Palindrome number in array : ");
		
		for(int i = 0 ; i < arr.length ; i++)
		{
			int temp = arr[i];
			int newnum = 0;
			while(temp>0)
			{
				newnum = (newnum*10) + (temp%10);
				temp = temp/10;
			}
			if(arr[i] == newnum)
			{
				System.out.println("arr["+i+"] : "+arr[i]);
			}
		}
	}
}