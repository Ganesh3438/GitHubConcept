package day14_ForLoop3;

import java.util.Scanner;

public class WAP02_SumOfOddAndEvenDigit {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int index = 1;
		int sum_OddIndex = 0;
		int sum_EvenIndex = 0;
		
		while(n>0) {
			int d = n % 10;
			if(index%2==0) {
				sum_EvenIndex = sum_EvenIndex +  d;
			}else {
				sum_OddIndex = sum_OddIndex + d;
			}
			n = n/10;
	         index++;
		}
         System.out.println("Even digits:" + sum_EvenIndex);
         System.out.println("Odd digits:" + sum_OddIndex);
	}

}
