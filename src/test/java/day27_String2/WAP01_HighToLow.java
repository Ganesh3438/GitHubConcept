package day27_String2;

import java.util.Scanner;

public class WAP01_HighToLow {
	
	public static String highToLow(String str) {
		
		int n = str.length();
		String ans = "";
		for(int i=0; i<n; i++) {
			
			char ch = str.charAt(i);
			if(ch>='A' && ch<='Z') {
				char nch =  (char) (ch + 32); 
				ans = ans + nch;
			}else {
				ans = ans + ch;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(highToLow(str));

	}

}
