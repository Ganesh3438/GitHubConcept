package day10_assignmentOnWhileLoop;

import java.util.Scanner;

public class TC09_PrintMultiplicationTables {

	/**
	 * Problem Description Take a number A as input, print its multiplication table
	 * having the first 10 multiples.
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int i = 1;
		int product = 2;
		while(i<=n) {
			System.out.println(product +"*"+ i + "="+ (product * i));
			i++;
		}
		
		
				
	}

}
