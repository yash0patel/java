package basic;
import java.util.Scanner;
public class TestApp5 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n1 : ");
		int n1 = sc.nextInt();
		
		if(n1 > 0)
		{
			System.out.println(n1 + " is positive");
		}
		else if(n1 < 0)
		{
			System.out.println(n1 + " is nagative");
		}
		else
		{
			System.out.println(n1 + " is zero");
		}
	}
}
