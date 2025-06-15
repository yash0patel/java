package exampleOfString;

import java.util.Scanner;

public class Ex16_StrReverse {
//	16) Java Program to find Reverse of the string
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = sc.nextLine();
        StringBuilder revStr = new StringBuilder(str);
        
        revStr.reverse();
        
        System.out.print("Reverse String : " + revStr);
	}
}
