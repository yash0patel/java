package MapTopics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.Map;
public class MapTopic {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();//not maintain Insertion order
//		LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();//maintain Insertion order
//		TreeMap<Integer, String> map = new TreeMap<Integer, String>();//sorting
		
		map.put(1, "yash");
		map.put(2, "neel");
		map.put(3, "jay");
		map.put(4, "vrund");
		map.put(1, "yash");
	
		for (Map.Entry<Integer,String> e : map.entrySet())
		{
			System.out.println(e.getKey() + " " + e.getValue());
		}
	}
}
