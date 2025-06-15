package exampleOfString;

public class Ex2_Charcountstr2 {
//	2) Java Program to count the total number of characters in a string 2
	public static void main(String[] args) {
		String str1 = "abcd efg ";
		int charnum = str1.replaceAll("\\s","").length();
		String str2 = "a b cd";
		charnum += str2.replaceAll("\\s","").length();
		
		System.out.println("Total number of char : " + charnum);
	}
}
