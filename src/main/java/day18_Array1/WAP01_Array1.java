package day18_Array1;

import java.util.Scanner;

public class WAP01_Array1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// Take 5 values from user and store them in array
		int[] arr = new int[5];
		
		for(int i=0; i<5; i++) {
			System.out.println("Please enter a value:");
			arr[i] = sc.nextInt();
		}
		
		// Print the values
		System.out.println("Output is:");
		for(int i=0; i<5; i++) {
			System.out.println(arr[i]);
		}
		
		
		
		

	}

}
