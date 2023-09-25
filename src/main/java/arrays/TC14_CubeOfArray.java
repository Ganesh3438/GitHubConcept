package arrays;

public class TC14_CubeOfArray {
	
	public static long[] cubeOfArray(int[] arr) {
		
		int n = arr.length;

		long[] copyArray = new long[n];
		for(int i=0; i<n; i++) {
			copyArray[i] = arr[i]*arr[i]*arr[i];
		}
		
		return copyArray;
	}

	public static void main(String[] args) {
		
	    int[] arr = {1, 2, 3, 4, 5};
		long[] ans = cubeOfArray(arr);
		
		for(int i=0; i<ans.length; i++) {
			System.out.print(ans[i] + " ");
		}
     
	}

}
