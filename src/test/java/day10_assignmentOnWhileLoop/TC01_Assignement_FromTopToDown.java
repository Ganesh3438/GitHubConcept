package day10_assignmentOnWhileLoop;

import java.util.Scanner;

/**
 * 
 * @author GANESH 
 *        Problem Description
 * 
 *         Write a program to print all Natural numbers from 1 to N where you
 *         have to take N as input from user
 */

public class TC01_Assignement_FromTopToDown {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Entered input is:" + n);
		int i = 1;
		while(i<=n) {
			System.out.println(i);
			i++;
		}

	}

}
