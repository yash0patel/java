package exampleOfString;

import java.util.Arrays;
import java.util.Scanner;

public class Ex21_FindMostRepeatedWord {
//	21) Java Program to find the most repeated word in a text file
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = sc.nextLine();
        
        String arr[] = str.split("[^a-zA-Z0-9]");
        Arrays.sort(arr);
       
        int counter[] = new int[arr.length];
        int index = 0;
     
        for(int i = 0;i<arr.length-1;i++) {
        	 if(arr[i].equals(arr[i+1])) {
                 counter[index]++;
             } else {
                 counter[i]++;
                 index = i + 1;
             }
        }
        
        int max = 0;
        String mrw = arr[0];
        for (int i = 1; i < counter.length; i++) {
            if (counter[i] > max) {
                max = counter[i];
                mrw = arr[i];
            }
        }
        System.out.println("Most Repeated word: "+mrw);
	}
}
