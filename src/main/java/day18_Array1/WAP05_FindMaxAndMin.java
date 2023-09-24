package day18_Array1;

import java.util.Scanner;

/**
 * Problem Description
 * 
 * Take input an array A of size N and write a program to print maximum and
 * minimum elements of the input. The only line of the input would contain a
 * single integer N that represents the length of the array followed by the N
 * elements of the input array A.
 */

public class WAP05_FindMaxAndMin {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the n value:");
		int n = sc.nextInt();

		int[] arr = new int[n];

		// Scan the values
		for (int i = 0; i < n; i++) {

			System.out.println("Please enter the value:");
			arr[i] = sc.nextInt();
		}

		// Find the max and min number
		int max = arr[0];
		int min = arr[0];

		for (int i = 0; i < n; i++) {

			if (arr[i] > max) {
				max = arr[i];
			}

			if (arr[i] < min) {
				min = arr[i];
			}

		}

		System.out.println(max + " " + min);

	}

}
