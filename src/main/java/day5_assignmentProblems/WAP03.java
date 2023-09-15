package day5_assignmentProblems;

public class WAP03 {

	public static void main(String[] args) {
		/*
		 * int a = 10, b = 5; //1
		 * 
		 * int c = (a * 1.0) / b; //2
		 * 
		 * System.out. println(c); //3
		 * 
		 */

		// Above piece of code having a problem with type casting
		// in the line number 9

		int a, b, c, d;
		a = b = c = d = 20;
		a += b -= c *= d /= 20;
		
		
		System.out.println("A = " + a + " B = " + b + " C = " + c + " D = " + d);

	}

}
