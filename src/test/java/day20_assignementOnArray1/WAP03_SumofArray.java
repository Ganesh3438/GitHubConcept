package day20_assignementOnArray1;

import java.util.Scanner;

public class WAP03_SumofArray {

	/**
	 * Problem Description Write a program to print sum of elements of the input
	 * array A of size N.
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		// Scan the values
		for(int i=0; i<n; i++) {
		
			arr[i] = sc.nextInt();
		}
		
		int sum = 0;
		// Print the values
		for(int i=0; i<n; i++) {
			sum = sum + arr[i];
		}
		System.out.println(sum);
		
		

	}

}
