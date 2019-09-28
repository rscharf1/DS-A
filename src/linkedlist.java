// LinkedList methods: add, remove, contains, size
import java.util.LinkedList; 

public class linkedlist {

	public static void main(String[] args) {
		// initialize list
		LinkedList<String> list = new LinkedList<>(); 
		
		// add elements 
		list.add("A"); 
		list.add("B"); 
		list.add("C"); 
		list.add(2, "X");  // adds X at 2nd index
		list.addFirst("Z");
		
		System.out.println(list);
		
		// remove elements
		list.remove("Z"); 
		list.remove(2) ;
		System.out.println(list);
		System.out.println("Contains A? " + list.contains("A"));
		System.out.println("Size: " + list.size());
	}
}
