package arrays;

/**
 * Problem Description
 * 
 * Write a program for a given integer x and a list ls to return the first
 * multiple of x that occurs in the list, and if there isn’t any multiple of x
 * in the list then return -1.
 */

public class TC15_FirstMultiple {
	
	public static int firstMultiple(int[] arr, int b) {
		
		int n = arr.length;
		int count = -1;
		
		for(int i=0; i<n; i++) {
			if(arr[i]%b==0) {
				return count = arr[i];
			}
		}
		
		return count;
	}

	public static void main(String[] args) {

		int[] arr = {1, 2, 3, 16, 20, 21};
		
		int b = 4;
		
		int status = firstMultiple(arr, b);
		System.out.println(status);
		
		
		
	}

}
