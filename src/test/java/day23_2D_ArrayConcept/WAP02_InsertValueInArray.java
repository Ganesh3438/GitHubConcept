package day23_2D_ArrayConcept;

import java.util.Scanner;

public class WAP02_InsertValueInArray {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];

		// Scan the values
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int pos = sc.nextInt();
		int value = sc.nextInt();

		int idx = pos - 1;
		int[] ans = new int[n + 1];

		for (int i = 0; i < idx; i++) {
			ans[i] = arr[i];
		}

		ans[idx] = value;

		for (int i = idx; i < n; i++) {
			ans[i + 1] = arr[i];
		}

		System.out.println("===================");
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}
	}
}
