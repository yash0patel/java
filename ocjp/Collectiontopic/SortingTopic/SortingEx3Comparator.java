package SortingTopic;
import java.util.ArrayList;
import java.util.Collections;
public class SortingEx3Comparator {
	public static void main(String[] args) 
	{
		ArrayList<StudentObj> list = new ArrayList<StudentObj>();
		
		StudentObj s1 = new StudentObj(1, "yash", 9, 80);
		StudentObj s2 = new StudentObj(3, "ayush", 10, 90);
		StudentObj s3 = new StudentObj(2, "neel", 11, 80);
		StudentObj s4 = new StudentObj(4, "jay", 12, 100);
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		
		Collections.sort(list, new StdWiseComparator());
		
		System.out.println("After stdwise Sorting : ");
		for (int i = 0; i < list.size(); i++) 
		{
			StudentObj s = list.get(i);
			s.disp();
		}
		
		Collections.sort(list, new NameWiseComparator());
		
		System.out.println("After Namewise Sorting : ");
		for (int i = 0; i < list.size(); i++) 
		{
			StudentObj s = list.get(i);
			s.disp();
		}
	}
}
