 package day15_Pattern1;

import java.util.Scanner;

public class WAP01_Print_N_Stars {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	       int n = sc.nextInt();
	       
	       for(int i=1; i<=n; i++){
	       System.out.print("*" + " ");
	       }

	}

}
