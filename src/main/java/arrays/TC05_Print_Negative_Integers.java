package arrays;

import java.util.Scanner;

public class TC05_Print_Negative_Integers {

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
		
		for(int i=0; i<n; i++) {
			if(arr[i]<0) {
				System.out.print(arr[i]+ " ");
			}
		}

	}

}
