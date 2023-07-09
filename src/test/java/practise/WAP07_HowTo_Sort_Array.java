package practise;

public class WAP07_HowTo_Sort_Array {

	public static void main(String[] args) {

		// creating an instance of an array
		int[] arr = new int[] { 78, 34, 1, 3, 90, 34, -1, -4, 6, 55, 20, -65 };
		System.out.println("Array elements after sorting:");
		// sorting logic
		int n = arr.length;
		for (int i = 0; i < n; i++) {

			for (int j = i + 1; j < n; j++) {
				int temp = 0;
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.println(arr[i]);  
		}
		
	}

}
