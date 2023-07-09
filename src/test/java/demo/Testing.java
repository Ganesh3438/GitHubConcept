package demo;

import java.util.Scanner;

public class Testing {
	public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
 
       

        // Scan the values
        for(int i=0; i<n; i++){
        arr[i] = sc.nextInt();
        }

        int pos = sc.nextInt();
        int value = sc.nextInt();

        int idx = pos-1;
        int[] ans = new int[n+1];

       for(int i=0; i<idx; i++){
           ans[i] = arr[i];
       }

       ans[idx] = value;

       for(int i=idx; i<n; i++){
           ans[i+1] = arr[i];
       }

       System.out.println("===================");
       for(int i=0; i<ans.length; i++) {
    	   System.out.print(ans[i]+ " ");
       }
    }
}
