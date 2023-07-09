package demo;

import java.util.Scanner;

public class WAP02_AverageMarks {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];

		// Scan the values
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int sum = 0;
		//print the values
		for(int i=0; i<n; i++) {
			sum = sum + arr[i];
		}

		double avg = sum/(double)n;
		System.out.println(avg);
		
	}

}
