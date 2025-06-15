package Immutable;
import java.util.Scanner;

public class LenAndCharAt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name:");
	    String name = sc.nextLine();

	    System.out.println("name.length(): " + name.length());

	    for(int i = 0 ; i<name.length() ; i++)
	    {
	    System.out.println(name.charAt(i));
	    }    
	}
}