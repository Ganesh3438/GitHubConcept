package arrays;

public class TC17_Frequencycount {
	
	public static int[] solve(int[] arr) {
		
		int n = arr.length;
		int[] newArray = new int[n];
		// {1, 2, 5, 2, 4, 1}
		int count = 0;
		
		for(int i=0; i<n; i++) {
			int val = arr[i];
			for(int j=0; j<n; j++) {
				if(val == arr[j]) {
					newArray[count] = val;
					count++;
				}
			}
		}
		
		return newArray;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
