package day13_ForLoop2;

import java.util.Scanner;

public class WAP01_Given_number_AndPrintALL_ItsFactor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			if(n%i==0) {
				System.out.println(i);
			}
		}
		
		System.out.println("-----------Below piece of code using while loop--------------------");
		
		int j = 1;
		while(j<=n) {
			if(n%j==0) {
				System.out.println(j);
			}
			j++;
		}

	}

}
