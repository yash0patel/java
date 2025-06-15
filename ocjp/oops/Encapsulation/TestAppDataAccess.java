package Encapsulation;

public class TestAppDataAccess {
	public static void main(String[] args)
	{
		TestAppData s = new TestAppData();
		
		s.setRno(1);
		s.setName("yash");
		s.setStd(10);
		
		System.out.println(s.getRno()+" "+s.getName()+" "+s.getStd()+" "+s.getSchoolName());
	}	
}
