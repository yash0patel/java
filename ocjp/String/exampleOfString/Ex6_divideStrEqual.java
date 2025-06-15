package exampleOfString;

import java.util.Scanner;

public class Ex6_divideStrEqual {
//	6) Java Program to divide a string in 'N' equal parts.
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = sc.nextLine();
        System.out.print("Enter a parts to divide the string : ");
        int parts = sc.nextInt();
        
        int partLength = str.length()/parts;
        int start = 0;
        int end = partLength;
        
        String[] arr = new String[parts];
        for(int i = 0;i<parts;i++) {
        	arr[i] = str.substring(start,end);
        	start = end;
        	end += (partLength);
        	System.out.println("arr["+i+"] : "+arr[i]);
        }
        System.out.print("Remaining Latters : " + str.substring(start));
	}
}
