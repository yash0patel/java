package SortingTopic;

public class EmpObj implements Comparable<EmpObj>{
	private int id;
	private String name;
	private int salary;
	private String orgname;
	int temp=0;
	
	public EmpObj() {
		// TODO Auto-generated constructor stub
	}
	
	EmpObj(int id,String name,int salary,String orgname){
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.orgname = orgname;
	}

	public int getId() {
		return id;
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
	
	public void sort_opt(int x)
	{
		temp = x;
	}
	
	@Override
	public int compareTo(EmpObj e) 
	{
		if(temp == 1)
		{
			if(getId() > e.getId()) 
			{
				return 1;
				
			}else if(getId() < e.getId()) 
			{
				return -1;
			}else 
			{
				return 0;
			}	
		}
		else if(temp == 2) 
		{			
			return getName().compareTo(e.getName());
		}
		else if(temp == 3)
		{
			if(getSalary() > e.getSalary()) 
			{
				return 1;
				
			}else if(getSalary() < e.getSalary()) 
			{
				return -1;
			}else 
			{
				return 0;
			}	
		}
		else if(temp == 4) 
		{			
			return getOrgname().compareTo(e.getOrgname());
		}
		else
		{
			return 0;
		}
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id + " " + name + " " + salary + " " + orgname; 
	}
}
