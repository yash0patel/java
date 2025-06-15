package constructor;

public class ConstructorOverloading {
	private int rno;
	private String name;
	private int std;
	
	public ConstructorOverloading()
	{
		System.out.println("START :: Default Constructor");
		System.out.println(rno + "  " + name + "  " + std);
		rno = 1;
		name = "yash";
		std = 12;
		System.out.println(rno + "  " + name + "  " + std);		
		System.out.println("END :: Default Constructor");

	}
	
	public ConstructorOverloading(int r)
	{
		System.out.println("START :: ONE- Parameterized Constructor");
		System.out.println(rno + "  " + name + "  " + std);
		rno = r;
		System.out.println(rno + "  " + name + "  " + std);		
		System.out.println("END :: ONE- Parameterized Constructor");
	}
	
	public ConstructorOverloading(int r,String n)
	{
		System.out.println("START :: TWO-- Parameterized Constructor");
		System.out.println(rno + "  " + name + "  " + std);
		rno = r;
		name = n;
//		std = 0;
		System.out.println(rno + "  " + name + "  " + std);		
		System.out.println("END :: TWO-- Parameterized Constructor");
	}
	
	public ConstructorOverloading(int r,String n,int s)
	{
		System.out.println("START :: THREE--- Parameterized Constructor");
		System.out.println(rno + "  " + name + "  " + std);
		rno = r;
		name = n;
		std = s;
		System.out.println(rno + "  " + name + "  " + std);		
		System.out.println("END :: THREE--- Parameterized Constructor");

	}
	
	public static void main(String[] args)
	{
		ConstructorOverloading s = new ConstructorOverloading();
		ConstructorOverloading s1 = new ConstructorOverloading(11);
		ConstructorOverloading s2 = new ConstructorOverloading(12,"abc");
		ConstructorOverloading s3 = new ConstructorOverloading(13,"xyz",12);

		System.out.println(s.rno + "  " + s.name + "  " + s.std);
		System.out.println(s1.rno + "  " + s1.name + "  " + s1.std);
		System.out.println(s2.rno + "  " + s2.name + "  " + s2.std);
		System.out.println(s3.rno + "  " + s3.name + "  " + s3.std);
	}
}