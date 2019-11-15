package DataStructures;

import java.util.Scanner; 

public class random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		getWord(scnr); 

	}
	
	public static String getWord(Scanner keyboard) {
		boolean invalid = false; //sentinel to start the loop
		String line = "";

		System.out.println("Enter the word to be converted or type quit to end the program: ");
		line = keyboard.nextLine();
		
		System.out.println("length: " + line.length());

		while ((line.length() == 0) || (invalid == true) || line.isEmpty() || line.trim().isEmpty()) {
				invalid = false;
				System.out.println("Input word required. Enter the word or phrase to be converted or type quit to end the program:");
				line = keyboard.nextLine();
		}
		return line;
		}

}
