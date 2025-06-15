package ex;

public class MethodOverloading {
	public void add(int a, int b) {
        System.out.println("Sum = "+(a+b));
    }
	public void add(int a, int b, int c) {
        System.out.println("Sum = "+(a+b+c));
    }
	public void add(int a, int b, int c, int d) {
        System.out.println("Sum = "+(a+b+c+d));
    }
	
	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		obj.add(1,2);
		obj.add(1,2,3);
		obj.add(1,2,3,4);		
	}
}
