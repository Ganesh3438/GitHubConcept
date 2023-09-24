package day18_Array1;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t!=0) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			int cnto = 0;
            int cnte = 0;
			
			// Scan the values
			for(int i=0; i<n; i++) {
				arr[i] = sc.nextInt();
				if(arr[i]%2==1) {
				    cnto++;
				}else {
					cnte++;
				}
			}
			
			System.out.println("Number of odd numbers are: "+ cnto);
			System.out.println("Number of even numbers are: "+ cnte);
			
			int[] B = new int[cnto];
            int[] C = new int[cnte];
            
		}

	}

}
