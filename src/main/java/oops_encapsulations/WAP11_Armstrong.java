package oops_encapsulations;

public class WAP11_Armstrong {

	public static void main(String[] args) {
		
		int n = 153 ;
		int temp = n;
		int sum = 0;
		
		while(n>0) {
			int rem = n % 10;
			sum = sum + rem * rem * rem;
			n = n/10;
		}
		
		System.out.println(sum);
		
		if(sum == temp) {
			System.out.println("It is an armstrong number");
		}else {
			System.out.println("It is not an armstrong number");
		}

	}

}
