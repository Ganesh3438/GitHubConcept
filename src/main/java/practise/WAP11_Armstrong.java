package practise;

public class WAP11_Armstrong {

	public static void main(String[] args) {
		
		int n = 153;
		int temp = n;
		int sum = 0;
		while(n>0) {
			int rem = n % 10;
			sum = sum + rem*rem*rem;
			n = n/10;
		}
		
		if(temp == sum) {
			System.out.println("It is an armstrong number");
		}else {
			System.out.println("It is not an armstrong number");
		}

	}

}
