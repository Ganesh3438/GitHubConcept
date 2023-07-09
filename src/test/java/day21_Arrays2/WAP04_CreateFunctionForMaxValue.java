package day21_Arrays2;

public class WAP04_CreateFunctionForMaxValue {

	public static int maxValueInArray(int arr[]) {
		int max = arr[0];
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		return max;
	}
	
	
	public static void main(String[] args) {
		
		int arr[] = {10, 30, 60, 1, 2, 90, 20, 30};
		System.out.println(maxValueInArray(arr));

	}

}
