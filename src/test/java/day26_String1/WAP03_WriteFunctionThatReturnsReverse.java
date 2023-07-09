package day26_String1;

import java.util.Scanner;

public class WAP03_WriteFunctionThatReturnsReverse {

	public static String reverse(String str) {
		
		int n = str.length();
		String rev = "";
		for(int i=str.length()-1; i>=0; i--) {
			
			char ch = str.charAt(i);
			rev = rev + ch;
		}
		return rev;
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		System.out.println(reverse(str));
//		System.out.print(str);

	}

}
