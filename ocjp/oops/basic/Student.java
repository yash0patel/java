package basic;
import java.util.Scanner;
public class Student {
	private int rno;
	private String name;
	private int std;
	
	Scanner sc = new Scanner(System.in);
		
	public void scanData()
	{	
		System.out.print("Enter Rno : ");
		rno = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter Name : ");
		name = sc.nextLine();
		
		System.out.print("Enter Std : ");
		std = sc.nextInt();
		
		System.out.println();
	}
	
	public void dispData()
	{
		System.out.println(rno + " " + name + " " + std);		
	}
}