package day10_assignmentOnWhileLoop;

import java.util.Scanner;

public class TC08_FindTheValueofAPowB {

	/**
	 * Problem Description
	 * 
	 * You are given two integers A and B. You have to find the value of AB.
	 * 
	 * NOTE: The value of AB will always be less than or equal to 10 pow 9.
	 * 
	 * Explanation:
	 *  For A = 2 and B = 3, the value of 2pow3 = 2 * 2 * 2 = 8. 
	 * 
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int c = 1;
		while (B >= 1) {
			c = c * A; 
			B--;
		}
		System.out.print(c);

	}

}
