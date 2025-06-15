package basic;

import java.util.Scanner;

public class Employee {
	private int id;
	private String name;
	private int salary;
	private String dsgn;
	private String orgname;

	Scanner sc = new Scanner(System.in);
	
	public void scanData()
	{	
		System.out.print("Enter Employee Id : ");
		id = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter Employee Name : ");
		name = sc.nextLine();
		
		System.out.print("Enter Employee Salary : ");
		salary = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter Employee Dsgn : ");
		dsgn = sc.nextLine();

		System.out.print("Enter Org Name : ");
		orgname = sc.nextLine();
		
		System.out.println();
	}
	
	public void dispData()
	{
		System.out.println(id + " " + name + " " + salary + " " + dsgn + " " + orgname);		
	}
}