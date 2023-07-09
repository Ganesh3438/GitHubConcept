/**
 * 
 */
package day10_assignmentOnWhileLoop;

import java.util.Scanner;

/**
 * @author GANESH 
 * Problem Description: Write a program to print all odd numbers
 *         from 1 to N where you have to take N as input from user. Here N is
 *         inclusive.
 */
public class TC03_PrintAllOddNumbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
		
		int i = 1;
		while(i<n) {
			if(i%2!=0) {
			System.out.println(i);
			}
			i++;
			
		}
	}

}
