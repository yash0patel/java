package Encapsulation;

public class TestAppData {
	private int rno;
	private String name;
	private int std;
	static String schoolname = "\"xyz ab\"";
	
	public void setRno(int rno)
	{
		this.rno = rno;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setStd(int std)
	{
		this.std = std;
	}
	
	public int getRno()
	{
		return this.rno;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public int getStd()
	{
		return this.std;
	}
	
	public String getSchoolName()
	{
		return schoolname;
	}
}
