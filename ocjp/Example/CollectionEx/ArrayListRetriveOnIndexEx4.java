package CollectionEx;

import java.util.ArrayList;

public class ArrayListRetriveOnIndexEx4 {
	public static void main(String[] args) {
//		4. Write a Java program to retrieve an element (at a specified index) from a given array list.
		ArrayList<String> list = new ArrayList<String>();
		list.add(0, "first");
		list.add(1,"second");
		list.add(2, "third");
		
		System.out.println("0 index : " + list.get(0));
		System.out.println("1 index : " + list.get(1));
		System.out.println("2 index : " + list.get(2));
	}
}
