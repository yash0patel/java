package basic;

import java.util.Scanner;

public class PrimeNumber2 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Quntity of Prime number : ");
		int qty = sc.nextInt();
		int i=1;
		int flag=0;
		while(flag<qty)
		{
			i++;
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
			{
				flag++;
				System.out.print(i+" ");
			}
		}
	}
}
