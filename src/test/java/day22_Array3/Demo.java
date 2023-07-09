package day22_Array3;

public class Demo {

	public static int solve(int A[], int B) {
		int n = A.length;
		for(int i=0; i<n; i++) {
			if(A[i]==B) {
				return i;
			}
		}
		
		return -1;
	}
	
	public static void main(String[] args) {

		
		int[] A = {1, 1, 2, 4, 2};
		int B = 4;
		
		int value = solve(A, B);
		System.out.println(value);
		
	}

	
}
