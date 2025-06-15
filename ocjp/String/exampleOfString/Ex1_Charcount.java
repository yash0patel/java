package exampleOfString;

public class Ex1_Charcount {
//	1) Java Program to count the total number of characters in a string
	public static void main(String[] args) {
		String str1 = "abcd efg ";
		int charnum = str1.replace(" ","").length();
		
		System.out.println("Total number of char : " + charnum);
	}
}


//basic consept of java,array,oop,string(mutable and imutable),exception(try,catch,throw,final,..other),IO topics like file reade write and readin file and write in file object write read