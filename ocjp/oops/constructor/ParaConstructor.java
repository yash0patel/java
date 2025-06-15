package constructor;

public class ParaConstructor {
	private int rno;
	private String name;
	private int std;
	
	public ParaConstructor(int rno,String n,int s)
	{
		System.out.println("START :: Parameterized Constructor");
		System.out.println(rno + "  " + name + "  " + std);
		this.rno = rno;
		name = n;
		std = s;
		System.out.println(rno + "  " + name + "  " + std);		
		System.out.println("END :: Parameterized Constructor");

	}
	
	public static void main(String[] args)
	{
		ParaConstructor s = new ParaConstructor(2,"yash",12);
		System.out.println(s.rno + "  " + s.name + "  " + s.std);
	}
}

