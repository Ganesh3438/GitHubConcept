package day20_assignementOnArray1;

import java.util.Scanner;

/**
 * Problem Description
 * 
 * Write a program to print all negative numbers from input array A of size N.
 * Take integer N and N elements of the array as input from user.
 * 
 * @author GANESH
 *
 */
public class WAP05_Homework_Negative_Integers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		// Scan the values
		for(int i=0; i<n; i++) {
			
			arr[i] = sc.nextInt();
		}
		
		// Print the values
		for(int i=0; i<n; i++) {
			if(arr[i]<0) {
				System.out.println(arr[i]);
			}
		}

	}

}
