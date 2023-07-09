package practise;

public class WAP16_Test {

	public static void main(String[] args) {

		String name = "Welcome1 to java18";
		int count = 0;
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			if (ch >= 48 && ch <= 57) {
				count++;
				System.out.print(ch + " ");
			}
		}
		System.out.println("");
		System.out.println(count);
	}

}
