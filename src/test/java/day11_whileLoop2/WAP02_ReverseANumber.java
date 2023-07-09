package day11_whileLoop2;

import java.util.Scanner;

public class WAP02_ReverseANumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
//		int i = n;
		if(n==0) {
			System.out.println("0");
		}else if(n<0) {
			 n = -n;
		}
		
		while(n>0) {
			
			int rem = n % 10;
			System.out.print(rem);
			n = n / 10;
			
		}
		

	}

}
