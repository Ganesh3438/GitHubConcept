package day12_ForLoop1;

import java.util.Scanner;

public class WAP05_ReverseNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int rev = 0;
		for( ; n>0 ; ) {
			int rem = n % 10;
			rev = rev * 10 + rem;
			n = n / 10;
		}
		System.out.println(rev);
	}

}
