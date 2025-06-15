package OopsEx;

public class ClassC extends ClassB{
	int c = 30;
	public static void main(String args[]) {
		ClassC cc = new ClassC();
		System.out.println("a : " + cc.a);
		System.out.println("b : " + cc.b);
		System.out.println("c : " + cc.c);
	}
}
