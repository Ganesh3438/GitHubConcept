package day20_Array1;

import java.util.Scanner;

public class WAP02_AvgOfArray {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int marks[] = new int[n];
		
		// Scan the values
		for(int i=0; i<n; i++) {
			marks[i] = sc.nextInt();
		}
		int sum = 0;
		// print the values
		for(int i=0; i<n; i++) {
			
			sum = sum + marks[i];
			
		}
//		System.out.println(sum/n);
		double avg = (double)sum/n;
		System.out.println(avg);
	}

}
