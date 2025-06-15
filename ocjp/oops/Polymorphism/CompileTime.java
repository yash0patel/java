package Polymorphism;

public class CompileTime {
	void add()
	{
		System.out.println("Zero argument");
	}
	void add(int n1)
	{
		System.out.println("One argument");
	}
	void add(int n1,int n2)
	{
		System.out.println("Two argument");
	}
	void add(int n1,int n2,int n3)
	{
		System.out.println("Three argument");
	}
	public static void main(String args[])
	{
		CompileTime obj = new CompileTime();
		
		obj.add();
		obj.add(1);
		obj.add(1,2);
		obj.add(1,2,3);
	}
}
