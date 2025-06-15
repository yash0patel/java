package exampleOfString;

import java.util.Arrays;
import java.util.Scanner;

public class Ex5_AnagramStrCheck {
//		5>Java Program to determine whether two strings are the anagram
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a First string : ");
        String str1 = sc.nextLine();
        System.out.print("Enter a Second string : ");
        String str2 = sc.nextLine();
      
        char[] arr1 = str1.toLowerCase().toCharArray();
        Arrays.sort(arr1);
        char[] arr2 = str2.toLowerCase().toCharArray();
        Arrays.sort(arr2);
        
        System.out.println(Arrays.equals(arr1, arr2) ? "Anagram" : "not An agram");
	}
}