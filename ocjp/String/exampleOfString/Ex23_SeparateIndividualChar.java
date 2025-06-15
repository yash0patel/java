package exampleOfString;

import java.util.Scanner;

public class Ex23_SeparateIndividualChar {
//	23) Java Program to separate the Individual Characters from a String
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = sc.nextLine();
        
        char charArr[] = str.toCharArray();
        
        for(int i=0;i<charArr.length;i++)
        {
        	System.out.println("charArr["+i+"] : "+charArr[i]);
        }
	}
}
