package exampleOfString;

import java.util.Scanner;

public class Ex15_MaxAndMinOccurrencesChar {
//	15) Java Program to find maximum and minimum occurring character in a string
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = sc.nextLine();
        
        char[] arr = str.toCharArray();
        int strCount = str.replace("\\s","").length();
        int max = 0;
        int min = str.length();
        String minch = String.valueOf(arr[0]);
        String maxch = String.valueOf(arr[0]);
        for(int i = 0;i<arr.length;i++)
        {
        	int newStrCount = str.replace(String.valueOf(arr[i]),"").replace("\\s","").length(); 	
  
        	minch = min > strCount-newStrCount?(String.valueOf(arr[i])):minch;
        	min = min > strCount-newStrCount?strCount-newStrCount:min;
        	
        	maxch = max < strCount-newStrCount?(String.valueOf(arr[i])):maxch;
        	max = max > strCount-newStrCount?max:strCount-newStrCount;
        }
        
        for(int i = 0;i<arr.length;i++)
        {
        	int newStrCount = str.replace(String.valueOf(arr[i]),"").replace("\\s","").length(); 	
        	if(strCount-newStrCount == min && !minch.contains(String.valueOf(arr[i]))) {
        		minch += " , "+String.valueOf(arr[i]);
        	}
        	if(strCount-newStrCount == max && !maxch.contains(String.valueOf(arr[i]))) {
        		maxch += " , "+String.valueOf(arr[i]);
        	}
        }
        
        System.out.println("maximum Characters occurrences in the string : [" + maxch + "]("+max+" Times)");
        System.out.println("Minimum Characters occurrences in the string : [" + minch + "] ("+min+" Times)");
	}
}
