package day11_assignementOnWhileLoop2;

import java.util.Scanner;

public class WAP02_AssignementProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	      Scanner sc = new Scanner(System.in);
	      long balance = sc.nextLong();
	      int m = sc.nextInt();

	      while(m>0){

	          int type = sc.nextInt();
	          long amount = sc.nextLong();

	          if(type==1){
	              balance = balance + amount;
	              System.out.println(balance);
	          }else{
	              if(balance >= amount){
	                  balance = balance - amount;
	                  System.out.println(balance);
	              }else{
	                  System.out.println("Insufficient funds");
	              }
	          }

	      m--;
	      }

		
	}

}
