package Immutable;

public class Typeof {
	public static void main(String[] args){
		//string to other type
		String n1 = "100";
		String n2 = "200";
		System.out.println("n1 + n2 :" + (n1 + n2));
		
		int n3 = Integer.parseInt(n1);
		int n4 = Integer.parseInt(n2);
		System.out.println("n3 + n4 :" + (n3 + n4));
		
		//other type to string
		int n5 = 10;
		float n6 = 20;
		String n7 = String.valueOf(n5);
		String n8 = String.valueOf(n6);
		System.out.println("n7 + n8 :" + (n7 + n8));
		
	}
}
