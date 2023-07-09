package practise;

public class WAP02_ReverseNumber {

	public static void main(String[] args) {

		int n = 123;

		while (n > 0) {

			int rem = n % 10;
			System.out.print(rem);
			n = n/10;

		}

	}

}
