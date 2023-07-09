package day21_Arrays2;

public class WAP05_CreateOneFunctionForMaxAndMin {

	static int[] findMaxAndMin(int arr[]) {
		int max = arr[0];
		int min = arr[0];
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		
		int ans[] = {max, min};
		return ans;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		int arr[] = {1, 3, 5, 10, 30, 2, 6};
		int maxAndMinValue[] = findMaxAndMin(arr);
		System.out.println(maxAndMinValue[0]);
		System.out.println(maxAndMinValue[1]); 
		
	}

}
