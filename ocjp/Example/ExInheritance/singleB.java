package ExInheritance;

public class singleB extends SingleA{
	public int b=20; 
	public static void main(String args[]) {
		singleB obj = new singleB();
		System.out.println("a : "+obj.a);
		System.out.println("b : "+obj.b);
	}
}
