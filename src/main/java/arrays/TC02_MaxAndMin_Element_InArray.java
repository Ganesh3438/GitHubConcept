package arrays;

import java.util.Scanner;

public class TC02_MaxAndMin_Element_InArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the n value:");
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		// Scan the values
		for(int i=0; i<n; i++) {
			System.out.println("Enter the number:");
			arr[i] = sc.nextInt();
		}
		
		int max= arr[0];
		int min = arr[0];
		
		for(int i=0; i<n; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
			
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		
		System.out.print(max +" "+ min);

	}

}
