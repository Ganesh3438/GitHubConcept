package practise;

public class WAP26_TimeComplexityProblem {

	public static int countFactor(int n) {

		int count = 0;

//		for(int i=1; i<=Math.sqrt(n); i++) {  // Both for-loop are valid
		for (int i = 1; i * i <= n; i++) {

			if (n % i == 0) {
				if (i == n / i) {
					count++;
				} else {
					count = count + 2;
				}
			}
		}

		return count;
	}

	public static void main(String[] args) {

		int n = countFactor(24);
		System.out.println("The count of n is:" + n);

	}

}
