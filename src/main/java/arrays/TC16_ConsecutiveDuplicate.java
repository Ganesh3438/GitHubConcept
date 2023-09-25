package arrays;

public class TC16_ConsecutiveDuplicate {
	
	public static boolean solve(int arr[]) {
	    // Complete the function here
	    int n = arr.length;
	    for(int i=0; i<n-1; i++){
	        if(arr[i]==arr[i+1]){
	            return true;
	        }
	    }
	    return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
