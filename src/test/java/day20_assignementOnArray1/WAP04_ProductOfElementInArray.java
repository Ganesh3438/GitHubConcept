package day20_assignementOnArray1;

import java.util.Scanner;

public class WAP04_ProductOfElementInArray {

	/**
	 * Write a program that returns the product of all elements present in the array.
	 * @param args
	 */
	public static void main(String[] args) {
		
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int arr[] = new int[n];
     
     // scan the values
     for(int i=0; i<n; i++) {
    	 arr[i] = sc.nextInt();
     }
		
     // Print
     int prod = 1;
     for(int i=0; i<n; i++) {
    	 prod = prod * arr[i];
     }
     
     System.out.println(prod);
     
	}

}
