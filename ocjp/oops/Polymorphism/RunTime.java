package Polymorphism;

public class RunTime {
	void numFun()
	{
		System.out.println("Zero argument");
	}
	void numFun(int n1)
	{
		System.out.println("One argument--> int");
	}
	void numFun(double n1)
	{
		System.out.println("One argument--> double");
	}
	
	void numFun(int n1,int n2)
	{
		System.out.println("Two argument--> int");
	}
	void numFun(double n1,double n2)
	{
		System.out.println("Two argument--> double");
	}
	public static void main(String args[])
	{
		RunTime obj = new RunTime();
		
		obj.numFun();
		obj.numFun(1);
		obj.numFun(1.1);
		obj.numFun(1,2);
		obj.numFun(1.0,2.0);
	}
}
