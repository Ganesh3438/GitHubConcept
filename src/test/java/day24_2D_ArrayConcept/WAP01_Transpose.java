package day24_2D_ArrayConcept;

import java.util.Scanner;

public class WAP01_Transpose {

	public static void transpose(int[][] A) {

		int N = A.length;
		int M = A[0].length;

		for (int i = 0; i < N; i++) {

			for (int j = 0; j < M; j++) {
				System.out.print(A[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}
	
	public static int[][] trans(int[][] A){
		
		int N = A.length;
		int M = A[0].length;
		
		int[][] ans = new int[M][N];
		
		for(int i=0; i<N; i++) {
			
			for(int j=0; j<M; j++) {
				
				ans[j][i]= A[i][j];
				
			}
		}
		
		return ans;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[][] A = new int[N][M];
		
		for(int i=0; i<N; i++) {
			
			for(int j=0; j<M; j++) {
				
				A[i][j] = sc.nextInt();
			}
		}
		
		transpose(A);
		
		System.out.println("-------------------");
		
		int[][] ans = trans(A);
		transpose(ans);
		

	}

}
