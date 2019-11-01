package DataStructures;
import java.util.*; 

public class priority_queue {

	public static void main(String[] args) {
		// initialize priority queue
		PriorityQueue<String> pq = new PriorityQueue<>(); 
		
		// add items
		pq.add("C"); 
		pq.add("C++"); 
		pq.add("Java"); 
		pq.add("Python"); 
		pq.add("Blah");
		
		// peek function
		System.out.println("Peak: " + pq.peek()); 
		
		// poll function
		pq.poll(); 
		
		Iterator<String> itr = pq.iterator(); 
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		// remove 
		pq.remove("Java"); 
		
		// contains
		System.out.println("Contains Java? " + pq.contains("Java"));
		
		// toArray
		Object[] arr = pq.toArray(); 
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i].toString() + ", ");
		}
		
		System.out.println(pq.size());
	}

}
