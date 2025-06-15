package String;

import java.util.Scanner;

public class WordsCounter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter String : ");
		String str1 = sc.nextLine();
		int count = 1;
		for(int i = 0; i< str1.length() ; i++) {
			if(str1.charAt(i) < 33 || str1.charAt(i) > 126)
				count++;
		}
		System.out.println("Total Words = "+count);
	}
}
