package exampleOfString;

import java.util.Scanner;

public class Ex25_SmallestAndBiggestPalindrome {
//	25) Java Program to print smallest and biggest possible palindrome word in a given string
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = sc.nextLine();
        
        String arr[] = str.split("[^a-zA-Z0-9]");
        
        String max = arr[0];
        String min = arr[0];
        for(int i = 0;i<arr.length;i++) {
        	StringBuilder temp = new StringBuilder(arr[i]);
        	String revstr = String.valueOf(temp.reverse());
        	if(arr[i].equals(revstr)) {
        		max = max.length()>arr[i].length()?max:arr[i];
        		min = min.length()<arr[i].length()?min:arr[i];
        	}
        }
        System.out.println("Largest Palindrome word : "+max);
        System.out.println("Smallest Palindrome word : "+min); 
	}
}
