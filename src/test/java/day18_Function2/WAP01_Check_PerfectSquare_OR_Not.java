package day18_Function2;

import java.util.Scanner;

/**
 * Given n, return 1 if n is perfect square otherwise return 0 
 */

public class WAP01_Check_PerfectSquare_OR_Not {
	
	public static int checkPerfectSquare(int n) {
		
		int ans = 0;
		for(int i=1; i*i<=n; i++) {
			
			if(i*i==n) {
				
				return 1;
				
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number:");
		int n = sc.nextInt();
		
		int n1 = checkPerfectSquare(n);
		System.out.println(n1);
		

	}

}
