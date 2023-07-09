package day10_assignmentOnWhileLoop;

import java.util.Scanner;

/**
 * 
 * @author GANESH 
 * 
 * Problem Description
 * Write a program to print all Natural numbers from N to 1 where you
 * have to take N as input from user
 */

public class TC02_Assignment_FromBottomToTop {

	public static void main(String[] args) {
		
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    int i = n;
    
    while(i>0) {
    	System.out.println(i);
    	i--;
    }
		
	}

}
