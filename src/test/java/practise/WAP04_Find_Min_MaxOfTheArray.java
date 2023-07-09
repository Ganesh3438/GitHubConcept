package practise;

public class WAP04_Find_Min_MaxOfTheArray {

	public static int[] findMinAndMax(int[] arr) {
		int max = arr[0];
		int min = arr[0];
		
		int n = arr.length;
		for(int i=0; i<n; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
			
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		int[] result = {min, max};
		return result;
	}
	
	
	public static void main(String[] args) {

		int[] arr= {10, 20, 30, 40, 50};
		int result[] = findMinAndMax(arr);
		System.out.println(result[0]);
		System.out.println(result[1]);

	}

}
