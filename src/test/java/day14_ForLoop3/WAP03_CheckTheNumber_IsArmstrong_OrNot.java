package day14_ForLoop3;

import java.util.Scanner;

// Please the video of forLoop part 3 and time is 2:04:20 

public class WAP03_CheckTheNumber_IsArmstrong_OrNot {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp1 = n;
		int temp = 0;
		while(n>0) {
			int d = n%10;
		    temp = temp + d*d*d;
		    n= n/10;
		}
		
		if(temp == temp1) {
			System.out.println("It is an armstrong number");
		}else {
			System.out.println("It is not an armstrong number");
		}

	}

}
