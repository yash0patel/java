package exampleOfString;

import java.util.Scanner;

public class Ex26_ReverseStrWordByWord {
//	26) Reverse String in Java Word by Word
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        StringBuilder str = new StringBuilder(sc.nextLine());
        
        str.reverse();
        StringBuilder newstr = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        for(int i = 0;i<str.length();i++) {
        	if (!Character.isLetterOrDigit(str.charAt(i))) {
        		temp.reverse();
        		newstr.append(temp + String.valueOf(str.charAt(i)));
        		temp = new StringBuilder();
        	}else{
        		temp.append(str.charAt(i));
        	}
        }
        temp.reverse();
        newstr.append(temp);
		
        System.out.println("Reversed String(Word by Word) : " + newstr);
	}
}
