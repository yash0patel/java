package exampleOfString;

import java.util.Scanner;

public class Ex11_CaseConverter {
//	11) Java Program to replace lower-case characters with upper-case and vice-vers 
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = sc.nextLine();
        String newStr = "";
        for(int i = 0; i < str.length() ; i++) {
        	if(Character.isUpperCase(str.charAt(i))) 
        	{
        		newStr += Character.toLowerCase(str.charAt(i));
        	}else {
        		newStr += Character.toUpperCase(str.charAt(i));
        	}
        }
        System.out.println("New String : "+newStr);
        
	}
}
