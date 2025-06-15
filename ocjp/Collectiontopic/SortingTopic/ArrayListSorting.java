package SortingTopic;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayListSorting {
	public static void main(String[] args) 
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(5);
		list.add(8);
		list.add(6);
		list.add(10);
		list.add(6);

		System.out.println("List : " + list);

		Collections.sort(list);
		
		System.out.println("List : " + list);
	}
}
