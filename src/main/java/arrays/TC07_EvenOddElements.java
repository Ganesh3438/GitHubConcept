package arrays;

import java.util.Scanner;

/**
 * Problem Description You are given T(number of test cases) integer arrays. For
 * each array A, you have to find the value of absolute difference between the
 * counts of even and odd elements in the array.
 */

public class TC07_EvenOddElements {

	public static void main(String[] args) {

		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the tescase:");
		int t = sc.nextInt();
		
		int ce = 0;
		int co = 0;
		while(t>0) {
			
			int n = sc.nextInt();
			int[] arr = new int[n];
			
			// Scan the values
			for(int i=0; i<n; i++) {
				System.out.println("Please enter the value:");
				arr[i] = sc.nextInt();
			}
			
			for(int i=0; i<n; i++) {
				if(arr[i]%2==0) {
					ce = arr[i];
				}else {
					co = arr[i];
				}
			}
			
            int ans = ce - co;
            System.out.println(Math.abs(ans));
//            System.out.println(ans);
			
			t--;
		}
				
		

	}

}
