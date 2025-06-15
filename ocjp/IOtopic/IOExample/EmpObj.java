package IOExample;
import java.io.Serializable;
public class EmpObj implements Serializable{
	private int id;
	private String name;
	private int salary;
	private String orgname;
	private String dsgn;
	
	EmpObj(int id,String name,int salary,String orgname,String dsgn){
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.orgname = orgname;
		this.dsgn = dsgn;
	
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
	
	public String getDsgn() {
		return dsgn;
	}
	
	public void setDsgn(String dsgn) {
		this.dsgn = dsgn;
	}
}