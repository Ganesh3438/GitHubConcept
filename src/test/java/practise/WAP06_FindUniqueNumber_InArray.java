package practise;

public class WAP06_FindUniqueNumber_InArray {

	public static void main(String[] args) {
		
		int arr[] = {10, 10, 20, 1, 2, 1, 15, 15, 20, 3, 4, 5, 616, 16};
		
		for(int i=0; i<arr.length; i++) {
			int val = arr[i];
			int count = 0;
			for(int j=0; j<arr.length; j++) {
				if(arr[j]==val) {
					count++;
				}
			}
			
			if(count == 1) {
				System.out.println(val);
			}
		}

	}

}
