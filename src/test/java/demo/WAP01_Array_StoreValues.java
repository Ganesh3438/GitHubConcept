package demo;

import java.util.Scanner;

public class WAP01_Array_StoreValues {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		// Scan the values
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		//Print the values
		for(int i=0; i<n; i++) {
			System.out.println(arr[i]);
		}
		
		
		
	}
	
}
