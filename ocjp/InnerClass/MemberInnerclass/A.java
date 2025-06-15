package MemberInnerclass;

public class A {
	private int n1 = 20;
	
	class B
	{
		void disp()
		{
			System.out.println("n1 : " + n1);
		}
	}
	
	public static void main(String[] args) {
		A objA = new A();
		A.B objB = objA.new B();
		objB.disp();
	}
}
