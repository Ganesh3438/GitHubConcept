package day20_assignementOnArray1;

import java.util.Scanner;

/**
 * Take input an array A of size N and write a program to print maximum and
 * minimum elements of the input. The only line of the input would contain a
 * single integer N that represents the length of the array followed by the N
 * elements of the input array A.
 * 
 * @author GANESH
 *
 */

public class WAP02_FindMaxAndMinValue {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];

		// Scan the values
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int min = arr[0];
		int max = arr[0];

		// print the values
		for (int i = 0; i < n; i++) {

			if (arr[i] > max) {
				max = arr[i];
			}

			if (arr[i] < min) {
				min = arr[i];
			}
		}

		int[] result = { max, min };
		System.out.println(result[0]);
		System.out.println(result[1]);

	}

}
