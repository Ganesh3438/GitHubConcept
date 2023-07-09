package practise;

/*
 * Given an array of size n and a value k. Write a function that return freq of k in arr.
 */

public class WAP02_GivenAnArrayOfSizeN_And_ValueK_ReturnFreq_OF_K {

	public static int check_freq(int[] arr, int value) {
		
		int n =  arr.length;
		
		int count = 0;
		
		for(int i=0; i<n; i++) {
			
			if(arr[i]==value) {

				count++;
				
			}
		}
		
		return count;
		
	}
	
	public static void main(String[] args) {
		
    int arr[] = {10, 20, 20, 30, 20, 40 , 50};
    
    int count = check_freq(arr, 20);
    System.out.println(count);
		
	}

}
