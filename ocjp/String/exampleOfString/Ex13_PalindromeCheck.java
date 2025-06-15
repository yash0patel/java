package exampleOfString;

import java.util.Scanner;

public class Ex13_PalindromeCheck {
//	13) Java Program to determine whether a given string is palindrome
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String input = sc.nextLine();
        StringBuilder str = new StringBuilder(input);
        
        System.out.println(input.equals(String.valueOf(str.reverse()))?"string is palindrome":"string is not palindrome");
	}
}
