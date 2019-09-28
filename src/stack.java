// Stack methods: push, pop, peek, isEmpty, size
// Think stack of plates, where the element that was just added is the next to be removed

import java.util.*;

public class stack {
	public static void main(String[] args) {
		// initialize stack
		Stack<String> stackofcards = new Stack<>(); 
		
		// push items onto stack
		stackofcards.push("Jack"); 
		stackofcards.push("Queen"); 
		stackofcards.push("King"); 
		stackofcards.push("Ace"); 
		
		System.out.println("Stack: " + stackofcards);
		
		// pop items from stack 
		
		String top = stackofcards.pop(); 
		System.out.println("Top card: " + top);
		System.out.println("Current stack: " + stackofcards);
		
		// get card at top without removing it 
		top = stackofcards.peek(); 
		System.out.println("Top: " + top);
		
		System.out.println("Empty? " + stackofcards.isEmpty());
		
	}

}
