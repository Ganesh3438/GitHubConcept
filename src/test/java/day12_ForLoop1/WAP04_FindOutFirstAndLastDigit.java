package day12_ForLoop1;

import java.util.Scanner;

public class WAP04_FindOutFirstAndLastDigit {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int ld = n%10;
		int fd = 0;
		
		for( ; n>0 ; ) {
			int rem = n % 10;
			fd = rem ;
			n=n/10;
		}
		 System.out.println("First digit is:"+ fd);
		 System.out.println("Last digit is:"+ ld);

	}

}
