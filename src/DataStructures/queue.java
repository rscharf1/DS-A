package DataStructures;
// Queue methods: add, remove, peek, isEmpty, size
// Think a line, where the people who joined first are the first to get off of the line

import java.util.*; 

public class queue {

	public static void main(String[] args) {
		// initialize queue
		Queue<Integer> q = new LinkedList<>(); 
		
		// add elements 0-4 to the queue
		for(int i=0; i<5; i++) {
			q.add(i); 
		}
		
		System.out.println("Queue: " + q);
		
		int remove = q.remove(); 
		System.out.println("Removed: " + remove);
		
		System.out.println("Queue: " + q);
		
		int head =  q.peek(); 
		System.out.println("Head: " + head);
		
		System.out.println("Size: " + q.size());
		
		System.out.println("Is empty? " + q.isEmpty());

	}

}
