package practise;

public class WAP27_TimeComplexityProblem_For_To_Check_Prime {

	public static void main(String[] args) {
		
		int n = 11;
		int countFactor = 0;
		
		for(int i=1; i*i<=n; i++) {
			if(n % i==0) {
				if(i==n/i) {
					countFactor++;
				}else {
					countFactor+=2;
				}
			
			}
		}
		
		if(countFactor ==2) {
			System.out.println("prime");
		}else {
			System.out.println("not a prime");
		}


	}

}
