package exampleOfString;

import java.util.Scanner;

public class Ex19_FrequencyOfChar {
//	19) Java Program to find the frequency of characters
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = sc.nextLine();
        
        String strChar = "";
        int counterArr[] = new int[str.length()]; 
        int counter = 0;
        for(int i=0;i<str.length() ;i++) 
        {
        	if(!strChar.contains(String.valueOf(str.charAt(i)))) 
        	{
        		strChar += String.valueOf(str.charAt(i));
        		if(strChar.charAt(strChar.length()-1) == str.charAt(i))
        		{
        			counterArr[counter] = str.length() - str.replace(String.valueOf(str.charAt(i)), "").length();
        			counter++;
        		}
        	}
        }
        for(int i = 0;i<strChar.length();i++) {
        	System.out.println(strChar.charAt(i) + " : " + counterArr[i]);
        }
	}
}