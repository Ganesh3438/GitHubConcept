package day22_Array3;

public class TC02_Find_UniqueNumber_In_Array {

	public static int uniqueNumberInArray(int[] arr) {

		int n = arr.length;

		for (int i = 0; i < n; i++) {
			
			int val = arr[i];
			int freq = 0;
			
			for (int j = 0; j < n; j++) {

				if (arr[j] == val) {
					freq++;
				}
			}

			if(freq==1) {
				return val;
			}
		}

		return -1;
	}

	public static void main(String[] args) {

		int[] arr = {1, 2, 3, 2, 1, 4, 4,5};
		int number = uniqueNumberInArray(arr);
		System.out.println(number);
	}

}
