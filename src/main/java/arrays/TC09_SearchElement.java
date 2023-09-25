package arrays;

import java.util.Scanner;

/**
 * Problem Description
 * 
 * You are given an integer T (number of test cases). You are given array A and
 * an integer B for each test case. You have to tell whether B is present in
 * array A or not.
 */

public class TC09_SearchElement {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the  value:");
		int t = sc.nextInt();
		while(t>0) {
			
			int n = sc.nextInt();
			int[] arr = new int[n];
			
			for(int i=0; i<n; i++) {
				System.out.println("Please enter the value");
				arr[i] = sc.nextInt();
			}
			
		    System.out.println("Please enter the B value:");
		    int B = sc.nextInt();
		    int found = 0;
		    for(int i=0; i<n; i++) {
		    	if(arr[i]== B) {
		    		found = 1;
		    	}
		    }
		    System.out.println(found);
			
			t--;
		}

	}

}
