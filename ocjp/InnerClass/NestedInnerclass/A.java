package NestedInnerclass;

public class A {
	public static int n1 = 10;
	
	static class B{
		void disp()
		{
			System.out.println("n1 : " + n1);
		}
	}
	
	public static void main(String[] args) {
		A.B obj = new A.B();
		
		obj.disp();
	}
}
