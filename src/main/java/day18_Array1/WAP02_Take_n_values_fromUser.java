package day18_Array1;

import java.util.Scanner;

public class WAP02_Take_n_values_fromUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter number of subjects:");
		int n = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Please enter the marks:");
			arr[i] = sc.nextInt();
		}

		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum = (sum + arr[i]) ;
			
		}
		double result = (double)sum / n;
		System.out.println("The average of the students marks are:" + result);

	}

}
