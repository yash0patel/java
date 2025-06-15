package exampleOfString;

import java.util.Scanner;

public class Ex4_VowelsConsonantsCount {
//	Java Program to count the total number of vowels and consonants in a string
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = sc.nextLine();
        
        int vowelcount = str.toLowerCase().replaceAll("[^aeiou]", "").length();
        int consonantcount = str.toLowerCase().replaceAll("[^a-z]", "").length() - vowelcount;
        		
        System.out.println("Total count of Vowels : " + vowelcount);
        System.out.println("Total count of Consonants : " + consonantcount);
	}
}
