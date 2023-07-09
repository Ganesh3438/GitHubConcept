package day22_Array3;

public class WAP01_CreateFunction_ThatReturns_True_IsArray_Sorted {

	public static boolean checkSortedArrayOrNot(int arr[]) {
		
		int n = arr.length;
		System.out.println("The length is:"+ (n-1));
//		
		for(int i=0; i<n-1; i++) {        // 1 2 3 4 5
			                              // 0 1 2 3 4
			if(arr[i] < arr[i+1]) {

				// do nothing
			}else {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		int arr[] = {1, 2, 3, 4, 5};
		System.out.println(checkSortedArrayOrNot(arr));

	}

}
