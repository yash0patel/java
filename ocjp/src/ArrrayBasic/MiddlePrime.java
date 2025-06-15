package ArrrayBasic;

import java.util.Scanner;

public class MiddlePrime {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		for(int i = 0;i<arr.length;i++)
		{
			System.out.print("Enter arr["+i+"] : ");
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Middle Prime number array : ");
		for(int i = 0;i<arr.length;i++)
		{
			int count=0;
			int temp = arr[i];
			int flag=0;
			int middle = 0;
			
			while(temp > 0)
			{
				temp = temp/10;
				count++;
			}
			
			temp = arr[i];
			
			while(count%2==0?(count/2)-1>flag:(count/2)>flag && arr[i] > 100)
			{
				temp = temp/10;
				middle = (count%2==0?(temp)%100:temp%10);
				flag++;
//				System.out.println("a = "+arr[i]+", temp = "+temp+", middle = "+middle+", flag = "+flag+", count = "+count);
			}
			
			temp = middle;
			
			if(count%2 == 0)
			{
				middle = (middle/10) + (middle%10);
			}
			
			count = 0;
			
			for(int j = 2;j<(arr[i]>100?middle:arr[i]);j++)
			{
				if((arr[i]>100?middle:arr[i])%j == 0)
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
