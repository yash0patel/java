package List;
import java.util.*;
public class ArrayListTopic {
	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		
		list.add(10);
		list.add(true);
		list.add(10.11);
		list.add(25.2f);
		list.add(255L);
		list.add("Royal");
		list.add('a');
		list.add("Royal");
		
		Student s = new Student(1,"yash",12);
		
		list.add(s);
		
		System.out.println("list.size : " + list.size());
		
		for(int i = 0;i<list.size();i++)
		{
			System.out.println("list.get("+i+") : " + list.get(i));
		}
	
	}
}


//Student class
class Student {
	public String name;
	public int rno;
	public int std;
	
	public Student(int rno,String name,int std) 
	{
		this.name = name;
		this.rno = rno;
		this.std = std;
	}
	
	@Override
	public String toString() {
		return this.rno + " " + this.name + " " +this.std;
	}
}