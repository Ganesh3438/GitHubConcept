package day27_String2;

import java.util.Scanner;

public class WAP02_CountOfVowelsAndConsonants {
	
	public static int[] countOfVowels(String str)
	{
		int n = str.length();
		int v = 0;
		int c = 0;
		for(int i=0; i<n; i++) {
			char ch = str.charAt(i);
			
			if(ch=='a' || ch=='e'|| ch=='i' || ch=='o' || ch=='u') {
				v++;
			}else {
				c++;
			}
		}
		int[] count = {v, c};
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
//		System.out.println(countOfVowels(str));
		int[] res = countOfVowels(str);
		System.out.println("Vowels are:" + res[0]);
		System.out.println("Consonants are:" + res[1]);
	}

}
