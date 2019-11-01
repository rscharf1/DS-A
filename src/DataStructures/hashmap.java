package DataStructures;
// HashMap methods: put, get, remove, size, isEmpty
import java.util.*;

public class hashmap {

	public static void main(String[] args) {
		// initialize map
		HashMap<String, String> cities = new HashMap<>();
		
		// add items
		cities.put("England", "London"); 
		cities.put("Germany", "Berlin"); 
		cities.put("Norway", "Oslo"); 
		cities.put("USA", "Washington DC"); 
		
		System.out.println(cities);
		
		System.out.println(cities.get("England"));
		
		cities.remove("England");
		
		System.out.println(cities);
		
		System.out.println("Size: " + cities.size());
		
		System.out.println("Is empty? " + cities.isEmpty());
		
		System.out.println("Contains Norway? " + cities.containsKey("Norway"));
		
		System.out.println("Contains Oslo? " + cities.containsValue("Oslo"));

	}

}
