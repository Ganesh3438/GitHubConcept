package day18_Array1;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
     while(t>0) {
         
         int B = sc.nextInt();
         int n = sc.nextInt();
         int[] arr = new int[n];
        
        for(int i=0; i<n; i++){
           
           arr[i] = sc.nextInt();
        }

        int found = 0;
        for(int i=0; i<n; i++){
            if(arr[i]==B){
                found = 1;
            }
        }
         System.out.println(found);
         t--;
     }
	}

}
