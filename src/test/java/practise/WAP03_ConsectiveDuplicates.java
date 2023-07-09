package practise;

public class WAP03_ConsectiveDuplicates {

	/*
	 * Given an array of size n. Write a function that returns true if consecutive 
	 * duplicates are present in array otherwise return false.
	 */
	
	public static boolean check_consecutiveValue(int arr[]) {
		int n = arr.length;
		for(int i=0; i<n-1; i++) {
			if(arr[i]==arr[i+1]) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		int arr[] = {10, 20, 30, 30, 40, 50};
		boolean status = check_consecutiveValue(arr);
		System.out.println(status);
		

	}

}
