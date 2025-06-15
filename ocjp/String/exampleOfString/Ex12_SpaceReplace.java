package exampleOfString;

import java.util.Scanner;

public class Ex12_SpaceReplace {
//	12) Java Program to replace the spaces of a string with a specific character
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = sc.nextLine();
        
        System.out.print("Enter a Character to replace a space : ");
        String ch = sc.nextLine();
        
        String newStr = str.replaceAll(" ", ch);
        
        System.out.println("New String without White Spaces : "+newStr);
	}
}
