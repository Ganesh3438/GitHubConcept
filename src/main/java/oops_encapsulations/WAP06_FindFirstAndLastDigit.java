package oops_encapsulations;

public class WAP06_FindFirstAndLastDigit {

	public static void main(String[] args) {
		
		int n = 1234;
		int ld = n % 10;
		int fd = 0;
		while(n>0) {
			
			int rem = n % 10;
			fd = rem;
			n = n / 10;
			
		}
		
		System.out.println(fd);
		System.out.println(ld);

	}

}
