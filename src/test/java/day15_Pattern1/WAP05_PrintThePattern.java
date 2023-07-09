package day15_Pattern1;

import java.util.Scanner;

public class WAP05_PrintThePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i=1; i<= n; i++) {

			System.out.print("*");

			for (int j=1; j<=n-i; j++) {
				System.out.print("-");
			}
			System.out.print("*");
			System.out.println("");
		}

	}

}
