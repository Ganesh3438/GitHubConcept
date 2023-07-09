package oops_encapsulations;

public class WAP04_SumOfEvenAndOdd {

	public static void main(String[] args) {
		
		int n = 123456789;
		
		int sum_even = 0;
		int sum_odd = 0;
		
		while(n>0) {
			int rem = n % 10;
			if(rem % 2==0) {
				sum_even = sum_even + rem;
			}else {
				sum_odd = sum_odd + rem;
			}
			n = n / 10;
		}

		System.out.println(sum_even);
		System.out.println(sum_odd);
	}

}
