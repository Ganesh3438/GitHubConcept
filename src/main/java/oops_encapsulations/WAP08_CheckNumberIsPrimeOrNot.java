package oops_encapsulations;

public class WAP08_CheckNumberIsPrimeOrNot {

	public static void main(String[] args) {
		
		int n = 23;
		int count = 0;
		for(int i=1; i<=n; i++) {
			if(n%i==0) {
				count = count + 1;
			}
		}
	
		if(count == 2) {
			System.out.println("It is a prime number");
		}else {
			System.out.println("It is not an prime number");
		}
			

	}

}
