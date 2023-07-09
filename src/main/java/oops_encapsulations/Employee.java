package oops_encapsulations;

public class Employee extends Company{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Company c1 = new Company();
		c1.name = "Wipro";
		c1.hq = "HYD";
		
		c1.setSharePrice(12345);
		int p1 = c1.getSharePrice();
		
		System.out.println(c1.name + " " + c1.hq);
		
		

	}

}
