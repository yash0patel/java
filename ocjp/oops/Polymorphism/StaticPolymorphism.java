package Polymorphism;

public class StaticPolymorphism {
	static void numFun()
	{
		System.out.println("Zero argument");
	}
	static void numFun(int n1)
	{
		System.out.println("One argument--> int");
	}
	static void numFun(double n1)
	{
		System.out.println("One argument--> double");
	}
	
	static void numFun(int n1,int n2)
	{
		System.out.println("Two argument--> int");
	}
	static void numFun(double n1,double n2)
	{
		System.out.println("Two argument--> double");
	}
	public static void main(String args[])
	{
		StaticPolymorphism obj = new StaticPolymorphism();
		
		obj.numFun();
		obj.numFun(1);
		obj.numFun(1.1);
		obj.numFun(1,2);
		obj.numFun(1.1,2);
	}
}
