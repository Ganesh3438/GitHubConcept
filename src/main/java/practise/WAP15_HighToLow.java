package practise;

public class WAP15_HighToLow {

	public static void main(String[] args) {
		
		String name = "JAVA";
		String temp = "";
		
		for(int i=0; i<name.length(); i++) {
			char ch = name.charAt(i);
			char nch = (char) (ch+32);
			temp = temp + nch;
		}
        System.out.println(temp);
	}

}
