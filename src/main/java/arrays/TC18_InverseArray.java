package arrays;

public class TC18_InverseArray {

	public static void main(String[] args) {
		
		int[] arr = {2, 0, 1};
		int n = arr.length;
		
		int[] inverse = new int[n];
		
		for(int i=0; i<n; i++) {
			int value = arr[i];
			inverse[value] = i;
		}
		
		for(int i=0; i<inverse.length; i++) {
			System.out.print(inverse[i] + " ");
		}

	}

}
