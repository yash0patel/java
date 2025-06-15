package exampleOfString;

import java.util.Scanner;

public class Ex20_LargestAndSmallestWord {
//	20) Java Program to find the largest and smallest word in a string
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = sc.nextLine();
        
        String arr[] = str.split("[^a-zA-Z0-9]");
        String max = arr[0];
        String min = arr[0];
        for(int i = 0;i<arr.length;i++) {
        	max = max.length()>arr[i].length()?max:arr[i];
        	min = min.length()<arr[i].length()?min:arr[i];
        }
        System.out.println("Largest word : "+max);
        System.out.println("Smallest word : "+min); 
	}
}
