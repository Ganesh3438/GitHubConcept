package practise;

public class WAP22_MaxAndMin {

	public static void main(String[] args) {

		int arr[] = { 10, 20, 30, 40, 50 };

		int max = arr[0];
		int min = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}

			if (arr[i] < max) {
				max = arr[i];
			}

		}
		
		
		int result[] = {max, min};
		System.out.println(result[0]);
		System.out.println(result[1]);
	}

}
