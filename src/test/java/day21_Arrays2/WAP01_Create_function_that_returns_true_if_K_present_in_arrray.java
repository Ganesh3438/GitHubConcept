package day21_Arrays2;

import java.util.Scanner;

public class WAP01_Create_function_that_returns_true_if_K_present_in_arrray{

	public static boolean searchForValueInArray(int arr[], int k) {
		
		int len = arr.length;
		
		for(int i=0; i<len; i++) {
			if(arr[i]==k) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		
//		int arr[] = {10, 20, 30, 40, 50};
//        boolean status = searchForValueInArray(arr, 40);
//		System.out.println("The value is present in arr or not?:"+" "+ status);
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		//Scan the values
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		boolean status = searchForValueInArray(arr, 40);
		System.out.println("The value is present in arr or not?:"+" "+ status);
		
	}

}
