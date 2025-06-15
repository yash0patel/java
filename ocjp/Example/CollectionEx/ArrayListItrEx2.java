package CollectionEx;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListItrEx2 {
	public static void main(String[] args) {
//		2. Write a Java program to iterate through all elements in an array list.
		ArrayList<String> list = new ArrayList<String>();
		list.add("red");
		list.add("yellow");
		list.add("black");
		
		Iterator itr = list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
