package Mmutable;

import java.util.Scanner;

public class ExStringBuilder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String input = sc.nextLine();
		StringBuilder str = new StringBuilder(input);
		StringBuffer str2 = new StringBuffer(input);
        
		System.out.println("Reversed string: " + str.reverse());
		System.out.println("Append string: " + str.append("."));
		
		System.out.println("Append string: " + str2.append("."));
		System.out.println("Reversed string: " + str2.reverse());
	}
}
