package CollectionEx;

import java.util.ArrayList;
public class ArrayListEx1 {
	public static void main(String[] args) {
//		1. Write a Java program to create an array list, add some colors (strings) and print out the collection.
		ArrayList<String> list = new ArrayList<String>();
		list.add("red");
		list.add("yellow");
		list.add("black");
		
		for(int i = 0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
	}
}
