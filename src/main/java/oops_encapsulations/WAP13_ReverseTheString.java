package oops_encapsulations;

public class WAP13_ReverseTheString {

	
	
	public static void main(String[] args) {
		
		String name = "Hello";
		String temp = "";
		for(int i=name.length()-1; i>=0; i--) {
			char ch = name.charAt(i);
			temp = temp + ch;
		}

		System.out.println(temp);
	}

}
