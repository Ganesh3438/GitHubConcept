package day23_2D_ArrayConcept;

import java.util.Scanner;

public class WAP01 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int M = scn.nextInt();
		
		int[][] mat = new int[N][M];
		
		
		
		// Scan the values
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				mat[i][j] = scn.nextInt(); 
			}
		}
		
		System.out.println("Total rows are: "+mat.length);
		System.out.println("Total columns are: "+mat[0].length);
		
		// Print the matrix  
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				System.out.print(mat[i][j] + " "); 
			}
			System.out.println("");
		}
		
		System.out.println("=========================================================");
		
		for(int j=0; j<M; j++) {
			for(int i=0; i<N; i++) {
				System.out.print(mat[i][j] + " "); 
			}
			System.out.println("");
		}

	}

}
