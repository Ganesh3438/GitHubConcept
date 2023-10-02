package arrays;

import java.util.Scanner;

public class Demo {

//	public static int[] solve(int[][] A) {

//	      Scanner sc = new Scanner(System.in);
//	        int n = A.length;
//	        int m = A[0].length;
//	        System.out.println(n + " "+ m);
//	        int[][] arr = new int[n][m];
//	        int[] ans = new int[n];
//	        
//	        // Scan the values
//	        for(int i =0; i<n; i++){
//	            for(int j=0; j<m; j++){
//	             arr[i][j] = sc.nextInt();
//	            }
//	        }
//
//
//	      for(int i=0; i<n; i++){
//
//	         for(int j=0; j<m; j++){
//	             ans[i] = ans[i] + arr[i][j];
//	         }
//
//	      }
//
//	     return ans;
//	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        int[] ans = new int[n];
        
        // Scan the values
        for(int i =0; i<n; i++){
            for(int j=0; j<m; j++){
             arr[i][j] = sc.nextInt();
            }
        }


      for(int i=0; i<n; i++){

         for(int j=0; j<m; j++){
             ans[i] = ans[i] + arr[i][j];
         }

      }
      
      for(int i=0; i<ans.length; i++) {
    	  System.out.println(ans[i] + " ");
      }
		
	}

}
