package Queue;
import java.util.PriorityQueue;
public class PriorityQueueTopic {
	public static void main(String[] args) {
		PriorityQueue<String> queueObj = new PriorityQueue<String>();
		queueObj.add("ramesh");
		queueObj.add("sagar");
		queueObj.add("kunal");
		queueObj.add("amar");
		queueObj.add("sagar");
		queueObj.add("kunal");
		
		while(!queueObj.isEmpty())
		{
			System.out.println(queueObj.poll());
		}
	}
}
