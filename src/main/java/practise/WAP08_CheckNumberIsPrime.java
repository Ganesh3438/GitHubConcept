package practise;

public class WAP08_CheckNumberIsPrime {

	public static void main(String[] args) {
		
		// What is prime number?
		// A +ve number with only two factors (1 and no itself)
		
		// What is composite number?
		// A +ve number with more than two factors 
		
		int n = 2;
		int countFactor = 0;
		
		for(int i=1; i<=n; i++) {
			if(n % i==0) {
			countFactor++;
			}
		}
		
		if(countFactor ==2) {
			System.out.println("prime");
		}else {
			System.out.println("not a prime");
		}

	}

}
