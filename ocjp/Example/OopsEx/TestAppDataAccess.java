// encaspppulation
package OopsEx;

public class TestAppDataAccess {
	public static void main(String[] args)
	{
		TestAppData s = new TestAppData();
		
		s.setRno(10);
		s.setName("yash");
		s.setStd(12);
		
		System.out.println(s.getRno()+" "+s.getName()+" "+s.getStd());
	}	
}
