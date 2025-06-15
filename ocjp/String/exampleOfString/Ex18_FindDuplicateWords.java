package exampleOfString;

import java.util.Arrays;
import java.util.Scanner;

public class Ex18_FindDuplicateWords {
//	18) Java program to find the duplicate words in a string
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = sc.nextLine();
	
        String[] arr = str.split("[^a-zA-Z0-9]");
        Arrays.sort(arr);
        String duplicateWords = "";
        
        for(int i = 0;i<arr.length-1;i++)
        {
        	if(arr[i].equals(arr[i+1]) && !duplicateWords.contains(String.valueOf(arr[i]))) 
        	{
       			if(!duplicateWords.isEmpty()) 
           		{
           			duplicateWords += " ,";
           		}
              	duplicateWords += String.valueOf(arr[i]);
       		}
        }
        System.out.print("Duplicate Words in a String : [" + duplicateWords + "]");
	}
}
