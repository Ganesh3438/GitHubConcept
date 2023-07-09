package day15_assignementOnPatter1;

import java.util.Scanner;

public class WAP03_PrintPatterb {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
	     for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=i; j++)
            {  
                System.out.print(j);  

                if(j!=i)
                {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

	}

}
