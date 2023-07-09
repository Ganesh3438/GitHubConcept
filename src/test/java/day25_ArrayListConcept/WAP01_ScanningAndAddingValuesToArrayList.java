package day25_ArrayListConcept;

import java.util.ArrayList;
import java.util.Scanner;

public class WAP01_ScanningAndAddingValuesToArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		//Scan the values
		for(int i=0; i<=n; i++) {
			int val = sc.nextInt();
			list.add(val);
		}
		
		// Print the values
		
		
	}

}
