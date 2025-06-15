package ExInheritance;

public class MultylevelC extends singleB{
	public int c=20; 
	public static void main(String args[]) {
		MultylevelC obj = new MultylevelC();
		System.out.println("a : "+obj.a);
		System.out.println("b : "+obj.b);
		System.out.println("c : "+obj.c);
	}
}
