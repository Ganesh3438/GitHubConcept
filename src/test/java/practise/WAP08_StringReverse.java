package practise;

public class WAP08_StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "Hello";
		String temp = "";
		
		for(int i=name.length()-1; i>=0; i--) {
			char c = name.charAt(i);
			temp = temp + c;
		}
		
		System.out.println(temp);
		
		
	}

}
