package constructor;

public class DefaultConstructor {
	private int rno;
	private String name;
	private int std;
	
	public DefaultConstructor()
	{
		System.out.println("START :: Default Constructor");
		System.out.println(rno + "  " + name + "  " + std);
		rno = 1;
		name = "yash";
		std = 12;
		System.out.println(rno + "  " + name + "  " + std);		
		System.out.println("END :: Default Constructor");

	}
	
	public static void main(String[] args)
	{
		DefaultConstructor s = new DefaultConstructor();
		System.out.println(s.rno + "  " + s.name + "  " + s.std);
//		int i;
//		System.out.println(i);
	}
}
