package day18_Array1;

/**
 * Problem Description:
 * 
 * Write a program that returns the product of all elements present in the
 * array.
 */

public class WAP08_ProductOftheArray {

	public static long solve(int[] arr) {
		// Complete the function template here
		long prod = 1;

		for (int i = 0; i < arr.length; i++) {
			prod = prod * arr[i];
		}

		return prod;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 5 };
		long result = solve(arr);
		System.out.println("The product of the array is:" + result);
	}

}
