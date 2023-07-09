package practise;

public class Test01_MaxAndMin {

	public static void main(String[] args) {
		
		int arr[] = {10, 20, 120, 40, 20, 1, 2, 90, 3};
		
		int n = arr.length;
		
		int max = arr[0];
//		int min = arr[0];
		
		for(int i=0; i<n; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(max);

	}

}
