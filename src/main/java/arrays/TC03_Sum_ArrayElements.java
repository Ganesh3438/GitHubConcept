package arrays;

import java.util.Scanner;

/**
 * Write a program to print sum of elements of the input array A of size N.
 *Note: the size element is removed from the list passed as input to the 
 *function main, that is only elements are present. User is supposed to 
 *add them up and return the result
 */

public class TC03_Sum_ArrayElements {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the n value:");
		int n = sc.nextInt();
		int[] arr = new int[n];

		// Scan the values
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the number:");
			arr[i] = sc.nextInt();
		}
		
		int temp = 0;
		for (int i = 0; i < n; i++) {
			temp = temp + arr[i];
		}
		
		System.out.println(temp);
		
		
		

	}

}
