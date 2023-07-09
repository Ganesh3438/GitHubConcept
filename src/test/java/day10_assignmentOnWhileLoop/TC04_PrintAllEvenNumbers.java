/**
 * 
 */
package day10_assignmentOnWhileLoop;

import java.util.Scanner;

/**
 * @author GANESH 
 * Problem Description Write a program to print all even numbers
 *         from 1 to N where you have to take N as input from the user. Note:
 *         Use while-loop OR for-loop, according to session flow.
 */
public class TC04_PrintAllEvenNumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int i=1;
		while(i<n) {
			if(i%2==0) {
				System.out.println(i);
			}
			i++;
		}

	}

}
