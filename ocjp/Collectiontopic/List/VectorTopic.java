package List;
import java.util.Iterator;
import java.util.Vector;
public class VectorTopic {
	public static void main(String[] args) {
		Vector v = new Vector();
		v.add('a');
		v.add("xyz");
		v.add(5);
		v.add(100L);
		v.add(25.5);
		v.add(20.20f);
		v.add(true);
		v.add(new EmpObj(10,"yash",2000,"xyz"));
		
		Iterator itr = v.iterator();
		
		while(itr.hasNext()) 
		{
			Object obj = itr.next();
			System.out.println(obj);
		}
	}
}
