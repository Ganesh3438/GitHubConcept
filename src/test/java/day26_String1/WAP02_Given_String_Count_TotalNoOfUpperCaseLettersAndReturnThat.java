package day26_String1;

import java.util.Scanner;

public class WAP02_Given_String_Count_TotalNoOfUpperCaseLettersAndReturnThat {

	public static int count_upperCase(String str) {
		int size = str.length();
		int count=0;
		for(int i=0; i<size; i++) {
			char ch = str.charAt(i);
			if(ch >='A' && ch <='Z') {
				System.out.print(ch + " ");
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		System.out.println(count_upperCase(str));
		

	}

}
