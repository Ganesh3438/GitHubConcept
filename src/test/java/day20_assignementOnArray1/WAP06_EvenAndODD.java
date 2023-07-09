package day20_assignementOnArray1;

import java.util.Scanner;

public class WAP06_EvenAndODD {

	/**
	 * You are given T(number of test cases) integer arrays. For each array A, you
	 * have to find the value of absolute difference between the counts of even and
	 * odd elements in the array.
	 * 
	 * 
	 * Input 1:
	 * 
	 * 1 4 1 2 3 4
	 * 
	 * Input 2:
	 * 
	 * 1 4 2 3 5 1
	 * 
	 * Input 3:
	 * 
	 * 1 1 4
	 * 
	 * Example Output
	 * 
	 * Output 1:
	 * 
	 * 0
	 * 
	 * Output 2:
	 * 
	 * 2
	 * 
	 * Output 3:
	 * 
	 * 1
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		
		while (t > 0) {

			int n = sc.nextInt();
			int arr[] = new int[n];
			
			for(int i=0; i<n; i++) {
				arr[i] = sc.nextInt();
			}

		   int evenSize = 0;
		   int oddSize = 0;
		   for(int i=0; i<n; i++) {
			   if(arr[i]%2==0) {
				   evenSize++;
			   }else {
				   oddSize++;
			   }
		   }
		   
		   int even[] = new int[evenSize];
		   int odd[] = new int[oddSize];
		   int j=0; int k=0;
		   for(int i=0; i<n; i++) {
			   
			   if(arr[i]%2==0) {
				   even[j] = arr[i];
				   j++;
			   }else {
				   odd[k] = arr[i];
				   k++;
			   }
			   
		   }
		   
//		   System.out.println(even.length);
		   
//		System.out.println(Math.abs(evenSize-oddSize));
		   int sum_even = 0;
		   int sum_odd = 0;
		   for(int i=0; i<even.length;i++) {
			  sum_even = sum_even + even[i];
		   }
		   
		   

		   for(int i=0; i<odd.length;i++) {
				  sum_odd = sum_odd + odd[i];
			   }
		   
		   
		   System.out.println("The difference between are:"+ Math.abs(sum_even-sum_odd));
			t--;
		}

	}

}
