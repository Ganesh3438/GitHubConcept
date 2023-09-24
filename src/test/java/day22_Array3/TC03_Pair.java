package day22_Array3;

public class TC03_Pair {
	
	static boolean pairs(int[] arr, int k) {
		
		int n = arr.length;
		
		for(int i=0; i<n; i++) {
			
			for(int j=i+1; j<n; j++) {
				if(arr[i]+arr[j]==k ) {
					return true;
				}
			}
			
		}
		
		return false;
	}

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5, 6, 7};
		int k = 10;
		
		boolean status = pairs(arr, k);
		System.out.println(status);

	}

}
