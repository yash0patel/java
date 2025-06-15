package AnnonymousInnerclass;

public class B {
	public static void main(String[] args) {
		A obj = new A()
		{
			public void test1()
			{
				System.out.println("test1()");
			}
		};
		
		obj.test1();
	}
}
