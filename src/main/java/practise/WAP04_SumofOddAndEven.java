package practise;

public class WAP04_SumofOddAndEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sumOdd = 0;
		int sumEven = 0;
		
		int n = 8563724;
		
		while(n>0) {
			int rem = n %10;
			if(rem % 2 == 0) {
				sumEven = sumEven + rem;
			}else {
				sumOdd = sumOdd + rem;
			}
			
			n = n / 10;
		}

		System.out.println(sumOdd);
		System.out.println(sumEven);
	}

} 
