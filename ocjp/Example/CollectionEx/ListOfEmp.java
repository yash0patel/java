package CollectionEx;

import java.util.*;

public class ListOfEmp {
	public static void main(String[] args) {
		
		Employees e = new Employees(101,"xyz",25000,"abcd");
		ArrayList list = new ArrayList();
		int ch = 0;
		while(true) 
		{	
			System.out.println("1) for insert Employee Details");
			System.out.println("2) for Display Employee Details");
			System.out.println("3) for EXIT");
			
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter Your Choice : ");
			ch = sc.nextInt();
			switch (ch) {
			case 1: 
				System.out.print("Enter id : ");
				int id = sc.nextInt();
				sc.nextLine();
				
				System.out.print("Enter name : ");
				String name = sc.nextLine();
				
				System.out.print("Enter salary : ");
				int salary = sc.nextInt();
				sc.nextLine();
				
				System.out.print("Enter orgname : ");
				String orgname = sc.nextLine();
				e = new Employees(id,name,salary,orgname);
				list.add(e);
				break;
			case 2:
				System.out.println(list.get(list.size()-1));
				break;
			case 3:
				return;
			default:
				System.out.println("Invalid Choice");
			}
		}
	}
}
class Employees
{
	private int id;
	private String name;
	private int salary;
	private String orgname;
	
	Employees(int id,String name,int salary,String orgname)
	{
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.orgname = orgname;
	}
	
	@Override
	public String toString() 
	{
		return this.id + " " + this.name + " " + this.salary + " " + this.orgname;
	}
}