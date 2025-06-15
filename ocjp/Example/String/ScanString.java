package String;

import java.util.Scanner;

public class ScanString {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first String : ");
		String str1 = sc.nextLine();
		
		System.out.print("Enter second String : ");
		String str2 = sc.nextLine();
		
		if (str1.equals(str2))
			System.out.println("equals");
		else
			System.out.println("not equals");
	}
}