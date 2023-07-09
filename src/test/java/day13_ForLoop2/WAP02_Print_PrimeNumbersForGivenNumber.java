package day13_ForLoop2;

import java.util.Scanner;

public class WAP02_Print_PrimeNumbersForGivenNumber {
	
	// What is prime number?
//	A positive number with only two factors (1 and number itself)
	
	// What is composite number?
	// A positive number with more than two factors
	
	// Note: 1 is neither prime or composite

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		
		int count = 0;
		
		
		for(int i=1; i<=n; i++) {
			
			if(n%i==0) {	
				count++;
				
			}
		}
		
		if(count == 2) {
			System.out.println("The number is prime");
		}else {
			System.out.println("The number is Composite not a prime number");
		}
		
	}

}
