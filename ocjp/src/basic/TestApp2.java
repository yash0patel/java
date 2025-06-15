package basic;
import java.util.Scanner;
public class TestApp2 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n1,n2,ans;
		System.out.println("Enter two number");
		System.out.print("n1 : ");
		n1 = sc.nextInt();
		System.out.print("n2 : ");
		n2 = sc.nextInt();
		
		ans = n1+n2;
		
		System.out.print("Addition : " + ans);
	}
}
