package day15_Pattern1;

import java.util.Scanner;

public class WAP06_PrintPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// int n = 6   
	/* The output should be: 
	                     
	                      *
	                      * 2
	                      * 2 *
	                      * 2 * 4
	                      * 2 * 4 *
	                      * 2 * 4 * 6
	                       
	*/
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			
			for(int j=1; j<=i; j++) {
				
				if(j%2==0) {
					System.out.print(j);
				}else {
					System.out.print("*");
				}
			}
			System.out.println("");
		}

	}

}
