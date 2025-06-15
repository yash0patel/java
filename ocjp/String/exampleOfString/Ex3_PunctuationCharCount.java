package exampleOfString;
import java.util.Scanner;

public class Ex3_PunctuationCharCount {
    //3) Java Program to count the total number of punctuation characters exists in a String
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = sc.nextLine();
        
        int counter = str.replaceAll("[a-zA-Z0-9]", "").length();
        
//        for(int i = 0; i < str.length(); i++) {
//            if (!Character.isLetter(str.charAt(i)) && !Character.isDigit(str.charAt(i))) {
//                counter++;
//            }
//        }
        System.out.println("Count of punctuation characters : " + counter);
    }
}
