package day13_ForLoop2;

import java.util.Scanner;

public class WAP03_FindFactorialOfN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Factorial of 5 means = 5*4*3*2*1 = 120
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp=1; 
		for(int i=n; i>=1; i--) {
			temp = temp * i;
		}
		System.out.println(temp);
		
		
	}

}
