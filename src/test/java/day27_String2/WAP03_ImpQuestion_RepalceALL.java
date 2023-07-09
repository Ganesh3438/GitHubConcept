package day27_String2;

import java.util.Scanner;

public class WAP03_ImpQuestion_RepalceALL {

	/*
	 * Given a String and a character, replace all the occurence of given char in
	 * string with $. Return the answer String.
	 */

	public static String change_char(String s) {
		// complete the function template

		int n = s.length();
		String ans = "";
		char given_char = s.charAt(0);
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t > 0) {
			for (int i = 0; i < n; i++) {
				char ch = s.charAt(i);

				if (ch == given_char) {
					ans = ans + '$';
				} else {
					ans = ans + ch;
				}
				
			}
			
			t--;
		}
		return ans;
	}

	public static void main(String[] args) {

	}

}
