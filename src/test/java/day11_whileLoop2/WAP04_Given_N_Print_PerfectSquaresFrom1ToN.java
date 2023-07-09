package day11_whileLoop2;

import java.util.Scanner;

public class WAP04_Given_N_Print_PerfectSquaresFrom1ToN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int i=1;
		
		while(i*i<n) {
			System.out.println(i*i);
			i++;
		}
				
				
		
		
	}

}
