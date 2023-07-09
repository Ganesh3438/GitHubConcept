package day11_whileLoop2;

import java.util.Scanner;

public class WAP03_GivenANumber_FindSumOf_ItsNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int temp = 0;
		
		while(n>0) {
			int rem = n % 10;
			temp = temp + rem;
			n = n/10;
		}
		
		System.out.println(temp);
		
	}
	
}
