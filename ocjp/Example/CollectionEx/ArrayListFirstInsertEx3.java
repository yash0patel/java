package CollectionEx;

import java.util.ArrayList;

public class ArrayListFirstInsertEx3 {
	public static void main(String[] args) {
//		3. Write a Java program to insert an element into the array list at the first position.
		ArrayList<String> list = new ArrayList<String>();
		list.add(0, "third");
		list.add(0,"second");
		list.add(0, "first");
		
		for(int i = 0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
	}
}
