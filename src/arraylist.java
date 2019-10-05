import java.util.*; 

public class arraylist {

	public static void main(String[] args) {
		// initialize arraylist
		ArrayList<String> cars = new ArrayList<>();
		
		// add items
		cars.add("Volvo"); 
		cars.add("BMW"); 
		cars.add("Ford"); 
		cars.add("Mazda"); 
		
		System.out.println(cars);
		
		// access item
		System.out.println("Index 0: " + cars.get(0)); 
		
		// change an item
		cars.set(0, "Audi"); 
		System.out.println(cars);
		
		cars.add(2, "test");
		
		// remove item
		cars.remove(0); 
		System.out.println(cars);
		
		
		
		// size
		System.out.println("Size: " + cars.size());

	}

}
