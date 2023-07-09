package oops_encapsulations;

public class WAP03_CountOfNumber {

	public static void main(String[] args) {
		
		
		int n = 1233423233;
		int count = 0;
		while(n>0) {
			
			int rem = n % 10;
			count = count + 1; 
			n = n / 10;
		}
		
		System.out.println(count);

	}

}
