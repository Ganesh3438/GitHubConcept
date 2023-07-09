package day26_String1;

import java.util.Scanner;

public class Testing {
	
	public static boolean isPalin(String s) {
	    // complete the function template
//	  String rev = "";
//	  String temp = s;
	   
	Scanner sc = new Scanner(System.in);
	int t = sc.nextInt();
	
	while(t>0) {
		String rev = "";
		String temp = s;
		for(int i=s.length()-1; i>=0; i--) {
			char ch = s.charAt(i);
			rev = rev + ch;
		}
		 
		if(rev.equals(temp)) {
			return true;
		}
		
		t--;
	}
	return false;
	}
	   

	public static void main(String[] args) {
//	Scanner sc = new Scanner(System.in);
//	String input = sc.next();
	System.out.println(isPalin("level"));
	}

}
