package practise;

public class WAP28_TimeComplexityProblem_SumOfNaturalNumbers {

	public static void main(String[] args) {
		
		int n = 100;
		
//		int a = n(n+1)/2;
		
		for(int i=1; i<=n; i++) {
			int a = i*(i+1)/2;
			System.out.println(a);
		}

	}

	

}
