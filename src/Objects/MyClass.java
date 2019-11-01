package Objects;

public class MyClass {

	public static void main(String[] args) {
		Student mark = new Student(); // mark -> object or instance of class Student 
		
		mark.id = 1; 
		mark.name = "Mark";
		mark.age = 15; 
		
		Student test = new Student();
		
		System.out.println(mark.name + " is " + mark.age);
		
		System.out.println(test.age);
		
	}

}
