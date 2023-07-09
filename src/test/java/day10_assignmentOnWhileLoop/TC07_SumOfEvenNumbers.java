package day10_assignmentOnWhileLoop;

import java.util.Scanner;

public class TC07_SumOfEvenNumbers {

	/**
	 * Problem Description
	 * 
	 * You are given a positive integer A. You have to print the sum of all even
	 * numbers in the range [1, A].
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int i = 0;
		int temp = 0;
		while (i <= n) {
			if (i % 2 == 0) {
				temp = temp + i;
			}
			i++;
		}
		System.out.println(temp);
	}

}
