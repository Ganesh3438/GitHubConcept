/**
 * 
 */
package day10_assignmentOnWhileLoop;

import java.util.Scanner;

/**
 * @author GANESH Problem Description
 * 
 *         Write a program to find sum all Natural numbers from 1 to N where you
 *         have to take N as input from user
 */
public class TC05_SumOfNaturalnumbers {

	// 1+2+3+4+5+6+7+8+9+10 = 55
	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		int n = sc.nextInt();
		
		int i = 1;
		int sum = 0;
		while(i<=n) {
			sum = sum + i;
			i++;
		}
		
		System.out.println(sum);
	}

}
