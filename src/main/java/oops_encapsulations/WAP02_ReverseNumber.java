package oops_encapsulations;

public class WAP02_ReverseNumber {

	public static void main(String[] args) {
		
		int n = 1234;
		
		while(n>0) {
			int rem = n % 10;
			System.out.print(rem);
			n = n / 10;
		}

	}

}
