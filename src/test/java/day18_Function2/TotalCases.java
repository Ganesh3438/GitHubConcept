package day18_Function2;

import java.util.Scanner;

public class TotalCases {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter inputs:");
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();

		int d = 0;

		while (C > 0) {

			C = C + B;
			C = C - A;

			d++;
		}

		System.out.println("Number of days:"+d);
	}

}
