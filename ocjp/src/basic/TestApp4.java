package basic;
import java.util.Scanner;
public class TestApp4 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no1 : ");
		int n1 = sc.nextInt();
		System.out.print("\nEnter no2 : ");
		int n2 = sc.nextInt();
		
		int temp = n2;
		n2 = n1;
		n1 = temp;
		System.out.println("\nn1 : "+n1);
		System.out.println("n2 : "+n2);
	}
}
