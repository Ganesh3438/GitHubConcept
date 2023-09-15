package day18_Function2;

import java.util.Scanner;

public class TestCoronaCases {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int d = 0;
		while(c>0) {
			c = c + b;
			c = c - a;
			d++;
		}
		System.out.println("Days are:"+ d);
	}

}
