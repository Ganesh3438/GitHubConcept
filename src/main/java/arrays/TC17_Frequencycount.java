package arrays;

public class TC17_Frequencycount {
	
	public static int[] solve(int[] arr) {
		
		int n = arr.length;
		int[] newArray = new int[n];
		// {1, 2, 5, 2, 4, 1}
		
		
		for(int i=0; i<n; i++) {
			int count = 0;
			int val = arr[i];
			for(int j=0; j<n; j++) {
				if(val == arr[j]) {
					count++;
					
				}
			}
			
			newArray[i] = count;
		}
		
		return newArray;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1, 2, 3, 2, 4, 1, 6};
		int[] status = solve(arr);
		
		for(int i=0; i<status.length; i++) {
		System.out.print(status[i] + " ");
		}
		 
		
	}

}
