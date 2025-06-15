package basic;

import java.util.Scanner;

public class PrimeDimond2 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int num = 2;
		int flag=0;
		int a=0;
		int temp = 0;
		for(int i = 0;i<=10;i++)
		{
				for(int k = 0;k < (10-a)  ; k++)
				{
					System.out.print(" ");
				}
				for(int j = 0 ; j <= a ; j++)
				{
					while(flag<=35)
					{
						int count=0;
						for(int l=2;l<num;l++)
						{
							if(num%l==0)
							{							
								count++;
								num++;
								break;
							}
						}
						if(count == 0)
						{
							temp++;
							if(temp%2 != 0)
							{
								System.out.print(num+" ");
								flag++;
							}
							else
								j--;
							num++;
							break;
						}
					}
	
				}
				if(i<10/2)
					a++;
				if(i>=10/2)
					a--;
				System.out.println();
			}
		}
}
