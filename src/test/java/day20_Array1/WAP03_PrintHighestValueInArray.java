package day20_Array1;

import java.util.Scanner;

public class WAP03_PrintHighestValueInArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		//Scan the values
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int hs = 0;
		for(int i=0; i<n; i++) {
			if(arr[i]>hs) {
				hs = arr[i];
			}
		}
          System.out.println(hs); 
	}

}
