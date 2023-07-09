package day10_assignmentOnWhileLoop;

import java.util.Scanner;

public class TC06_SumOfOddNumbers {

	/**
	 * Take an integer A as input. You have to print the sum of all odd numbers in
	 * the range [1, A].
	 * 1+3+5+7+9 = 25
	 * @param args
	 */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int i = 1;
		int temp = 0;
		while(i<=n) {
			if(i%2!=0) {
				temp = temp + i;
			}
			i++;
		}
		System.out.println(temp);

	}

}
