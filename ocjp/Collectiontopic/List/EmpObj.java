package List;
import java.util.Scanner;
import java.io.Serializable;

public class EmpObj implements Serializable{
	private int id;
	private String name;
	private int salary;
	private String orgname;
	
	EmpObj()
	{
		
	}
	
	EmpObj(int id,String name,int salary,String orgname)
	{
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.orgname = orgname;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getOrgname() {
		return orgname;
	}

	public void setOrgname(String orgname) {
		this.orgname = orgname;
	}
	
	public void scan()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter Employee details : ");
		System.out.print("Enter id : ");
		id = sc.nextInt();
		
		System.out.print("Enter name : ");
		name = sc.nextLine();
		sc.nextLine();
		
		System.out.print("Enter salary : ");
		salary = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter orgname : ");
		orgname = sc.nextLine();
		
		System.out.println("Employee Data scanned successfully");
	}
	
	public void update(int x)
	{
		System.out.println("Enter following details for update employee information : ");
		Scanner sc = new Scanner(System.in);
		if(x == 1 || x == 5)
		{
			System.out.print("Enter New Id : ");
			id = sc.nextInt();
			sc.nextLine();
		}
		
		if(x == 2 || x == 5)
		{
			System.out.print("Enter name : ");
			name = sc.nextLine();
		}
		
		if(x == 3 || x == 5)
		{
			System.out.print("Enter salary : ");
			salary = sc.nextInt();
			sc.nextLine();
		}
		
		if(x == 4 || x == 5)
		{
			System.out.print("Enter orgname : ");
			orgname = sc.nextLine();
		}	
		System.out.println("Employee Data Updated successfully");
	}
	
	public String disp()
	{
		return this.id + " " + this.name + " " + this.salary + " " + this.orgname;
	}
	
	public String toString() {
		return this.id + " " + this.name + " " + this.salary + " " + this.orgname;
	}
}
