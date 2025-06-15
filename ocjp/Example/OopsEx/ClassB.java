package OopsEx;

public class ClassB extends ClassA{
	int b = 20;
	public static void main(String args[]) {
		ClassB cb = new ClassB();
		System.out.println("a : " + cb.a);
		System.out.println("b : " + cb.b);
	}
}
