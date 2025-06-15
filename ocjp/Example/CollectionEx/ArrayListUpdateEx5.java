package CollectionEx;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListUpdateEx5 {
	public static void main(String[] args) {
//		5. Write a Java program to update an array element by the given element.
		ArrayList<String> list = new ArrayList<String>();
		list.add("red");
		list.add("yellow");
		list.add("black");
		
		list.set(0, "blue");
		
		Iterator itr = list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
