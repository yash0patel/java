package exampleOfString;

import java.util.Arrays;
import java.util.Scanner;

public class Ex8_FindLongestRepeatingSequence {
//	8) Java Program to find the longest repeating sequence in a string
/*	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = sc.nextLine();
        
        StringBuilder substring[] = new StringBuilder[(str.length()*(str.length()+1))/2];
        int index = 0;
        //for loop (i) start 
        for (int i = 0; i < str.length(); i++) {
        	//for loop (j) start
            for (int j = i; j < str.length(); j++) {
            	//create stringBuilder object for subsets elements and append on substring
                substring[index] = new StringBuilder();
                substring[index++].append(str.substring(i, j+1));
            }
        }
        
        Arrays.sort(substring);
        int counter = 0;
        String lrs = "";
        int temp = 0;
        for (int i = 0; i < index - 1; i++) {
            if (substring[i].equals(substring[i + 1])) {
                counter++;
            } else {
                if (temp < counter && lrs.length() < substring[i].length()) {
                    lrs = substring[i];
                    temp = counter;
                }
                counter = 0;
            }
        }

        // Check for the last substring
        if (temp < counter && lrs.length() < substring[index - 1].length()) {
            lrs = substring[index - 1];
        }
    	System.out.println( "lrs : " + lrs);
	}*/
}
