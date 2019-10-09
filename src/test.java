public class test {

	public static void main(String[] args) {
		int size = 2; 
		int base = size/2*3+8*size; 
		int height = (size/2+1)+4*size; 
		System.out.println("Base: " + base); 
		System.out.println("Height: " + height); 
		
		for(int i=0; i<height; i++) {
			int stars = 2*i+1; 
			int spacesBefore = (base-stars)/2;

			for(int x=0; x<spacesBefore; x++) {
				System.out.print(" ");
			}
			for(int x=0; x<stars; x++) {
				System.out.print("*");
			}
			for(int x=0; x<spacesBefore; x++) {
				System.out.print(" ");
			}
			System.out.println();
		}

	}

}
