package oops_encapsulations;

public class WAP12_FindCountOfUpperCase {

	public static void main(String[] args) {
		
		String name = "Hi welcome to JAVA World";
		int count = 0;
		for(int i=0; i<name.length(); i++) {
			char ch = name.charAt(i);
			if(ch>='A' && ch <='Z') {
				System.out.print(ch + " ");
				count = count + 1;
			}
		}
		System.out.println("");
		System.out.println(count);
	}

}
