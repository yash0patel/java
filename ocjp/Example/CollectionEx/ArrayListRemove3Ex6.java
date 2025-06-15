package CollectionEx;

import java.util.ArrayList;

public class ArrayListRemove3Ex6 {
	public static void main(String[] args) {
//		6. Write a Java program to remove the third element from an array list.
		ArrayList<String> list = new ArrayList<String>();
		list.add("first");
		list.add("second");
		list.add("third");
		list.add("fourth");
		
		list.remove(2);
		
		for(int i = 0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
	}
}
