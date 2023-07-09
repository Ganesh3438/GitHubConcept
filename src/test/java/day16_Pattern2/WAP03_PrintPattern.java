package day16_Pattern2;

import java.util.Scanner;

public class WAP03_PrintPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			
			for(int j=1; j<=n-i+1; j++) {
				System.out.print("*");
			}
			
			for(int k=1; k<=i-1; k++) {
				System.out.print("-");
			}
			for(int m=1; m<=i-1; m++) {
				System.out.print("-");
			}
			
			for(int l=1; l<=n-i+1; l++) {
				System.out.print("*");
			}
//			System.out.println("");
			
			
			
			System.out.println("");
		}

	}

}
