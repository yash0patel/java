package String;

import java.util.Scanner;

public class Palindrome {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter String : ");
		String str1 = sc.nextLine();
		int count = 0;
		for(int i = 0; i< str1.length() ; i++) {
			if(str1.charAt(i) != str1.charAt(str1.length()-i-1)) {
				count++;
				break;
			}
		}
		if(count == 0) {
			System.out.println("Palindrome");
		}
		else
			System.out.println("not Palindrome");
	}
}
