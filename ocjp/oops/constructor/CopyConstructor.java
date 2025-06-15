package constructor;

public class CopyConstructor {
	private int rno;
	private String name;
	private int std;
	
	public CopyConstructor(int rno,String name,int std)
	{
		System.out.println("START :: Parameterized Constructor");
		System.out.println(this.rno + "  " + this.name + "  " + this.std);
		this.rno = rno;
		this.name = name;
		this.std = std;
		System.out.println(this.rno + "  " + this.name + "  " + this.std);		
		System.out.println("END :: Parameterized Constructor");
	}
	
	public CopyConstructor(CopyConstructor s)
	{
		System.out.println("START ::  Copy Constructor");
		System.out.println(rno + "  " + name + "  " + std);
		rno = s.rno;
		name = s.name;
		std = s.std;
		System.out.println(rno + "  " + name + "  " + std);		
		System.out.println("END :: Copy Constructor");
	}
	
	public static void main(String[] args)
	{
		CopyConstructor s1 = new CopyConstructor(1,"yash",12);
		System.out.println(s1.rno + "  " + s1.name + "  " + s1.std);
		CopyConstructor s2 = new CopyConstructor(s1);
		System.out.println(s2.rno + "  " + s2.name + "  " + s2.std);
	}
}
