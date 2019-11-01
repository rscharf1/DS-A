package DataStructures;
// HashSet methods: add, remove, contains, size, isEmpty

import java.util.*; 

public class hashset {

	public static void main(String[] args) {
		// initialize set
		HashSet<String> countries = new HashSet<>(); 
		
		// add elements
		countries.add("India"); 
		countries.add("Australia"); 
		countries.add("South Africa"); 
		countries.add("India"); 
		
		System.out.println(countries);
		
		countries.remove("Australia"); 
		
		System.out.println(countries);
		
		System.out.println("Contains India? " + countries.contains("India"));
		
		System.out.println("Size: " + countries.size());
		
		System.out.println("Is empty? " + countries.isEmpty());

	}

}
