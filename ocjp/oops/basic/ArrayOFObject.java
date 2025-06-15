package basic;

public class ArrayOFObject {
	public static void main(String[] args)
	{
		Student s[] = new Student[3];
		
		for(int i = 0; i<s.length ; i++)
		{
			s[i] = new Student();
			s[i].scanData();
		}
		
		for(int i = 0; i<s.length ; i++)
		{
			s[i].dispData();
		}
	}
}
