package exampleOfString;

import java.util.Arrays;
import java.util.Scanner;

public class Ex17_FindDuplicateChar {
//	17) Java program to find the duplicate characters in a string
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = sc.nextLine();
	
        char[] arr= str.replaceAll("\\s", "").toCharArray();
        Arrays.sort(arr);
        String duplicateChar = "";
       
        for(int i = 0;i<arr.length-1;i++)
        {
        	if(arr[i] == arr[i+1] && !duplicateChar.contains(String.valueOf(arr[i]))) 
        	{
        			if(!duplicateChar.isEmpty()) 
        			{
        				duplicateChar += " ,";
        			}
            		duplicateChar += String.valueOf(arr[i]);
        	}
        }
        
        if (!duplicateChar.isEmpty()) 
        { 
            System.out.print("Duplicate Characters in a String : [" + duplicateChar + "]");
        } else {
            System.out.print("No duplicate characters found in the string.");
        }
	}
}