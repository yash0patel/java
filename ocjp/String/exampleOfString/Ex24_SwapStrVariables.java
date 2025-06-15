package exampleOfString;

import java.util.Scanner;

public class Ex24_SwapStrVariables {
//	24) Java Program to swap two string variables without using third or temp variable.
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First string : ");
        String str1 = sc.nextLine();
        System.out.print("Enter Second string : ");
        String str2 = sc.nextLine();
        
        System.out.println("str1 : " + str1);
        System.out.println("str2 : " + str2);
        
        str1 = str2+str1;
        str2 = str1.substring(str2.length());
        str1 = str1.substring(0, str2.length());
        
        System.out.println("str1 : " + str1);
        System.out.println("str2 : " + str2);
	}
}
