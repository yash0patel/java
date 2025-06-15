package CollectionEx;

import java.util.ArrayList;

public class ArrayListSearchEx7 {
	public static void main(String[] args) {
//		7. Write a Java program to search for an element in an array list.
		ArrayList<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		
		System.out.println(list.get(list.indexOf("b")));
	}
}
