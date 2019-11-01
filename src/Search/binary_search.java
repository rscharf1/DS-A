package Search;

public class binary_search {

	public static void main(String[] args) {
		int[] arr = {2, 3, 4, 10, 40}; 
		int find=3; 
		System.out.println(search(arr, 0, arr.length-1, find));

	}
	
	public static int search(int arr[], int low, int high, int find) {
		if(high<low) return -1; 
		
		int mid = (low+high)/2; 
			
		if(arr[mid]==find) {
			return mid; 
		}
		else if (arr[mid]<find){
			return search(arr, mid+1, high, find); 
		}
		else {
			return search(arr, low, mid-1, find);
		}


	}

}
