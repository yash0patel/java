package exampleOfString;

import java.util.Scanner;

public class Ex14_StringRotation {
//	14) Java Program to determine whether one string is a rotation of another
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a First string : ");
        String str1 = sc.nextLine();
        System.out.print("Enter a Second string : ");
        String str2 = sc.nextLine();
        
        if (str1.length() == str2.length() && (str1+str1).contains(str2)) {
            System.out.println("The second string is a rotation of the first string.");
        } else {
            System.out.println("The second string is not a rotation of the first string.");
        }
	}
}
