package ArrrayBasic;
import java.util.Scanner;

public class ArrayPrimeNumber {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array : ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		int num = 2;
		int i = 0;
		System.out.println("\nPrime number array : ");
		while(arr.length > i)
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
				arr[i] = num;
				System.out.println("arr["+i+"] : "+arr[i]);
				i++;
			}
			num++;
		}
	}
}
