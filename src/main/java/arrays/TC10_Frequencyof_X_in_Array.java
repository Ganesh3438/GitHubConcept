package arrays;

/**
 * Problem Description Given an integer array A. Find and return the frequency
 * of number B in array A.
 */

public class TC10_Frequencyof_X_in_Array {
	
	public static int frequency(int[] arr, int b) {
		int count = 0;
		int n = arr.length;
		
		for(int i=0; i<n; i++) {
			if(arr[i]==b) {
				count++;
			}
		}
		
		return count;
	}

	public static void main(String[] args) {

		int[] arr = {1,2, 3, 4, 5, 3};
		int b = 3;
		int count = frequency(arr, b);
		System.out.println("The count of b in array is: "+ count);
	}

}
