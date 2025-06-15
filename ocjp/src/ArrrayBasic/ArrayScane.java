package ArrrayBasic;
import java.util.Scanner;
public class ArrayScane {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		
		for(int i = 0; i<arr.length ; i++)
		{
			System.out.print("Enter arr["+i+"] : ");
			arr[i] = sc.nextInt();
		}
		
		for(int i = arr.length-1;i>0;i--)
			System.out.println("arr["+i+"] = "+arr[i]);
	}
}
