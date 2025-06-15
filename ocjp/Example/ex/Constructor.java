package ex;

public class Constructor {
	int id;
	int salary;
	String name;
	String orgname;
	String dsgn;
	
	public Constructor()
	{
		orgname = "xyz";
	}
	
	public Constructor(int id,String name,int salary,String dsgn)
	{
		this.dsgn = dsgn;
		this.id =id;
		this.name = name;
		this.salary = salary;
	}
	
	public Constructor(Constructor c)
	{
		this.dsgn = c.dsgn;
		this.id =c.id;
		this.name = c.name;
		this.salary = c.salary;
	}
	
	public static void main(String args[])
	{
		Constructor e1 = new Constructor();
		Constructor e2 = new Constructor(201,"yash",250000,"pqrs.xyz");
		Constructor e3 = new Constructor(e2);
		
		System.out.println(e1.id+"   "+e1.name+"   "+e1.salary+"   "+e1.orgname+"   "+e1.dsgn);
		System.out.println(e2.id+"   "+e2.name+"   "+e2.salary+"   "+e2.orgname+"   "+e2.dsgn);
		System.out.println(e3.id+"   "+e3.name+"   "+e3.salary+"   "+e3.orgname+"   "+e3.dsgn);		
	}
}