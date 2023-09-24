package arrays;

/**
 * Problem Description:
 * 
 * Write a program that returns the product of all elements present in the
 * array.
 */

public class TC04_Return_ProductOfElements {
	
	public static long productElement(int[] arr) {
		long c = 1;
		int n = arr.length;
		
		for(int i=0; i<n; i++) {
			c = c * arr[i];
		}
		
		return c;
	}

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		long prod = productElement(arr);
		System.out.println(prod);

	}

}
