package Set;

import java.util.Iterator;
import java.util.TreeSet;

public class SetTopic {
public static void main(String[] args) {
	//HashSet :- not maintain insertion order
//	HashSet<String> setObj = new HashSet<String>(); //hashing algo
//	LinkedHashSet<String> setObj = new LinkedHashSet<String>();//maintain insertion order
	TreeSet<String> setObj = new TreeSet<String>();//sorting
	
	setObj.add("ramesh");
	setObj.add("sagar");
	setObj.add("kunal");
	setObj.add("amar");
	setObj.add("sagar");
	setObj.add("kunal");
	Iterator<String> itr = setObj.iterator();
	
	while(itr.hasNext())
	{
		String name = (String) itr.next();
		System.out.println(name);
	}
}
}
