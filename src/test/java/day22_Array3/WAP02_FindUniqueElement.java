package day22_Array3;

public class WAP02_FindUniqueElement {

	public static int single_element(int arr[]) {
		
		int n = arr.length;
		for(int i=0; i<n; i++) {
			
			int val = arr[i];
			
			// find frequency value in arr
			int freq = 0;
			
			for(int j=0; j<n; j++) {
				if(arr[j]==val) {
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

		int A[] = {5,9,5,10,9};
		System.out.println(single_element(A));
				
		
	}

}
