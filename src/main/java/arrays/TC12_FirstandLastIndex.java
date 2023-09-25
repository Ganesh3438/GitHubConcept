package arrays;

/**
 * Problem Description Given a sorted integer array A, and an integer B. Find
 * the first and last index of B in A. It is guaranteed that B exists in A.
 * Return an array C of size 2, where C[0] is the first index of B in A and C[1]
 * is the last index of B in A.
 * 
 * Note: Indexing of A starts from 0. If the element only exists once, the
 * values of both elements in the C list should be the same.
 */

public class TC12_FirstandLastIndex {
	
	public static int[] firstAndLastIndex(int[] arr, int b) {
		
		int n = arr.length;
		int fi=-1, li=-1;
		
		for(int i=0; i<n; i++) {
			if(arr[i]== b) {
				fi = i;
				break;
			}
		}
		
		for(int i=arr.length-1; i>0; i--) {
			if(arr[i]== b) {
				li = i;
				break;
			}
		}
		
		
		int[] result = {fi, li};
		return result;
	}

	public static void main(String[] args) {
		
		int[] arr = {1, 4, 3, 7, 3, 2, 3, 4};
        int b = 3;
		int[] status = firstAndLastIndex(arr, b);
		
		System.out.println(status[0]);
		System.out.println(status[1]);
	}

}
