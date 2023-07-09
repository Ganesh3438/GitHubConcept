package day21_Arrays2;

public class WAP03_Check_ConsecutiveNumberInArray {

	public static boolean check_consecutivenumbers(int arr[], int k){
	     
        for(int i=0; i<arr.length; i++){
        if(arr[i] == arr[i+1]){
        return true;
        }
        }
        return false;
        } 
	
	public static void main(String[] args) {
		
      int arr[] = {1, 2, 5, 9, 9, 6};
      int k = 9;
      boolean status = check_consecutivenumbers(arr, k);
      System.out.println("Check consecutive number"+ " "+ k + " "+"is presentOrNot?:"+ " "+ status );

	}

}
