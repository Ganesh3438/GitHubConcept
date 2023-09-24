package day18_Array1;

import java.util.Scanner;

/**
 * Problem Description
 * 
 * Write a program to print all negative numbers from input array A of size N.
 * Take integer N and N elements of the array as input from user.
 */

public class WAP09_Print_NegativeNumbers_From_Array {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the n value:");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		// Scan the values
		for(int i=0; i<arr.length; i++) {
			
			System.out.println("Please enter the values:");
			arr[i] = sc.nextInt();
		}
		
		// print the values
		for(int i=0; i<arr.length; i++) {
			if(arr[i]<0) {
				System.out.println("Negative numbers are:" + arr[i]);
			}
		}
		
		

	}

}
