package arrays;

import java.util.Scanner;

/*
 * Problem Description
 * Write a program to print the input array A of size N in reverse order 
 * where you have to take integer N and further N elements as input from user.
 */

public class TC01_PrintReverse {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the n value:");
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		// Scan the values
		for(int i=0; i<n; i++) {
			System.out.println("Enter the number:");
			arr[i] = sc.nextInt();
		}
		
		// print in reverse 
		for(int i=n-1; i>=0; i--) {
			System.out.print(arr[i] + " ");
		}

	}

}
