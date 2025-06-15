package exampleOfString;

import java.awt.print.Printable;
import java.util.Scanner;

public class Ex10_RemoveWhiteSpaces {
//	10) Java Program to remove all the white spaces from a string
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = sc.nextLine();
        
        String newStr = str.replaceAll("\\s", "");
        
        System.out.println("New String without White Spaces : "+newStr);
	}
}
