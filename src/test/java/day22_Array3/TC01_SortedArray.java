package day22_Array3;

import java.util.Scanner;

public class TC01_SortedArray {

	static boolean sorted_array(int[] arr) {
		int n = arr.length;
		
		for(int i=0; i<n-1; i++) {
			
			if(arr[i]<arr[i+1]) {
		       continue;	
			}else {
				return false;
			}
		}
		
		return true;
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the value:");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
              
		
		// Scan the values
		for(int i=0; i<n; i++) {
			System.out.println("Please enter the number:");
			arr[i] = sc.nextInt();
		}
		
		boolean status = sorted_array(arr);
		System.out.println(status);

	}

}
