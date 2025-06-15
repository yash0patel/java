package constructor;

public class Employee {
	int id;
	String name;
	int salary;
	String dsgn;
	String orgname;
	
	public Employee()
	{
		dsgn = "None";
		orgname = "xyz";
	}
	public Employee(int id,String name,int salary)
	{
		this.id = id;
		this.salary = salary;
		this.name = name;
	}
	public Employee(Employee e)
	{
		this.id = e.id;
		this.name = e.name;
		this.salary = e.salary;
	}
	public static void main(String[] args)
	{
		Employee e1 = new Employee();
		Employee e2 = new Employee(123,"yash",250000);
		Employee e3 = new Employee(e2);
		
		System.out.println(e1.id+"   "+e1.name+"   "+e1.salary+"   "+e1.orgname+"   "+e1.dsgn);
		System.out.println(e2.id+"   "+e2.name+"   "+e2.salary+"   "+e2.orgname+"   "+e2.dsgn);
		System.out.println(e3.id+"   "+e3.name+"   "+e3.salary+"   "+e3.orgname+"   "+e3.dsgn);
	}
}