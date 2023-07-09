package day21_Arrays2;

import java.util.Scanner;

public class WAP02_FrequencyOfElement {

public static int count_element(int arr[], int k){
        
        int len = arr.length;
        int count = 0;
        for(int i=0; i<len; i++){
        if(arr[i]==k){
        count = count + 1;
        }
        }
        return count;
}

	public static void main(String[] args) {
		
		/*
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		//Scan the values 
		for(int i=0; i<arr.length; i++) {
			arr[i]= sc.nextInt();
		}
		
		int k = sc.nextInt();
		System.out.println("Entered value of k is:"+ " "+ k);
		int frquency = count_element(arr, k);
		System.out.println("The count of number is:"+" "+frquency);
		*/
		
		int arr[] = {1, 3, 4, 1, 2, 3, 1, 3, 2, 5};
		int frequency = count_element(arr, 1);
		System.out.println("The count is:"+" "+frequency);

	}

}
