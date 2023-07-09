package practise;

import java.util.Scanner;

/*
 * Given an array of size n and a value k. Write a function that returns true if k is 
 * present in arr otherwise return false
 */

public class WAP01_GivenArrayOfSizeNAndValueK_ReturnTrueIfK_IsPresent {
	
	public static boolean check_ValuePresent(int[] arr, int k) {
		int n = arr.length;
		
		for(int i=0; i<n; i++) {
			if(arr[i]==k) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		
//      Scanner sc = new Scanner(System.in);
//      int n = sc.nextInt();
//      int[] arr = new int[n];
      
      // Scan the values 
//      for(int i=0; i<n; i++) {
//    	  arr[i] = sc.nextInt();
//      }
		
		//-------------------------------------------------------
		
		int arr[] = {10, 20, 30, 40, 50};
		boolean status = check_ValuePresent(arr, 90);
		System.out.println(status);
      
      
		
	}

}
