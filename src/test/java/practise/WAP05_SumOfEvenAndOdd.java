package practise;

public class WAP05_SumOfEvenAndOdd {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {10, 20, 30, 40, 50};
		
		int sumOfEven = 0;
		int sumOfOdd = 0;
		int countOfEven = 0;
		int countOfOdd = 0; 
		
		for(int i=0; i<arr.length; i++) {
			if(i%2==0) {
				sumOfEven = sumOfEven + arr[i];
				countOfEven++;
			}else {
				sumOfOdd = sumOfOdd + arr[i];
				countOfOdd++;
			}
		}
		
		System.out.println(sumOfEven);
		System.out.println(sumOfOdd);
		System.out.println("-------------");
		System.out.println(countOfEven);
		System.out.println(countOfOdd);
	}

}
