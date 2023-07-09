package practise;

public class WAP06_FindFirstAndLastDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 12345;
		int fd = 0;
		int ld = n % 10;
		while(n>0) {
			int rem = n %10;
			fd = rem;
			n = n / 10;
		}

		System.out.println(fd);
		System.out.println(ld);
	}

}
