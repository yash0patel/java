package LocalInnerClass;

public class A {
	private int n1 = 10;
	private int n2 = 20;
	void cal()
	{
		class B
		{
			void sum()
			{
				System.out.println("sum : " + (n1 + n2));
			}
		}
		B obj = new B();
		obj.sum();
	}
	
	public static void main(String[] args) {
		A obj = new A();
		obj.cal();
	}
}