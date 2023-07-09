package day14_ForLoop3;

import java.util.Scanner;

public class WAP01_Find_GCD_HCF {

	public static void main(String[] args) {

		/**
		 * What is GCD? Greatest common divisor for example what is the gcd for (24,12):
		 * The answer is 12 Explanation: Factor for 12 is : 1, 2, 3, 4, 6, 12 And factor
		 * for 24 is 1, 2, 3, 4, 6, 8, 12, 24 Greatest common factor between 12 and 24
		 * is 12
		 * 
		 * Example2: What is the GCD for (20, 15) Factor for 20 is 1, 2, 4, 5, 10, 20
		 * Factor for 15 is 1, 3, 5, 15 Greatest common factor between 20 and 15 is 5.
		 * 
		 * Example3: What is the GCD for (39, 65) Factor for 39 is 1, 3, 13, 39 Factor
		 * for 65 is 1, 5, 13, 65 Greatest common factor between 39 and 65 is 13.
		 */

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		int min;

		if (a < b) {
			min = a;
		} else {
			min = b;
		}

		// 1st approach
//		 int gcd = 0;
//		 for(int i=1; i<=min; i++) {
//			 
//			 if(a%i==0 && b%i==0) {
//				 gcd = i;
//			 }
//		 }
//
//		 System.out.println(gcd);

		// ==================================================================

		// 2nd approach -- Performance wise it is good
		int gcd = 0;
		for (int i = min; i >= 1; i--) {
			if (a % i == 0 && b % i == 0) {
				gcd = i;
				break;
			}
		}

		System.out.println(gcd);

	}

}
