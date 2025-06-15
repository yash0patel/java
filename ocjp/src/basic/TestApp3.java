package basic;
import java.util.Scanner;
public class TestApp3 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Name : ");
		String name = sc.next();
		sc.nextLine();
		System.out.print("Enter Full Name : ");
		String fname = sc.nextLine();
		System.out.println(name + "     " + fname);
	}
}
