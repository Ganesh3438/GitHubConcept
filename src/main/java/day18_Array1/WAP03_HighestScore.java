package day18_Array1;

import java.util.Scanner;

public class WAP03_HighestScore {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the n value:");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		// Scan the values
		for(int i=0; i<n; i++) {
			System.out.println("Please enter the score:");
			arr[i] = sc.nextInt();
		}
		
		// Print the highest values
		int temp = 0;
		for(int i=0; i<n; i++) {
			
			if(arr[i]>temp) {
				temp = arr[i];
			}
		}
		System.out.println("-------------------------");
		
		System.out.println("Output is:"+ temp);
	}

}
