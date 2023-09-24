package day18_Array1;

import java.util.Scanner;

/**
 * Problem Description
 * 
 * Write a program to print sum of elements of the input array A of size N.
 * 
 * Note: the size element is removed from the list passed as input to the
 * function main, that is only elements are present. User is supposed to add
 * them up and return the result
 */

public class WAP07_SumOftheArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the n value");

		int n = sc.nextInt();

		int[] arr = new int[n];

		// Scan the value
		for (int i = 0; i < n; i++) {
			System.out.println("Please enter the values:");
			arr[i] = sc.nextInt();
		}

		int sum = 0;
		// print the result
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}

		System.out.println("The sum of the array is:" + sum);

	}

}
