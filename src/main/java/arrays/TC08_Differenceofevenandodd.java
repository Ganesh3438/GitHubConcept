package arrays;

import java.util.Scanner;

/**
 * Problem Description Write a program to find the difference between the sum of
 * all even elements and the sum of all odd elements from the given array, A.
 */
public class TC08_Differenceofevenandodd {

	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the tescase:");
		int t = sc.nextInt();
		
		int ce = 0;
		int co = 0;
		int sumEven = 0;
		int sumOdd = 0;
		while(t>0) {
			
			int n = sc.nextInt();
			int[] arr = new int[n];
			
			// Scan the values
			for(int i=0; i<n; i++) {
				System.out.println("Please enter the value:");
				arr[i] = sc.nextInt();
			}
			
			for(int i=0; i<n; i++) {
				if(arr[i]%2==0) {
					sumEven = sumEven + arr[i];
				}else {
					sumOdd = sumOdd + arr[i];
				}
			}
			
            int ans = sumEven-sumOdd;
            System.out.println(Math.abs(ans));
//            System.out.println(ans);
			
			t--;
		}
	}

}
