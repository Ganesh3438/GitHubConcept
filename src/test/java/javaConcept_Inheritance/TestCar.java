package javaConcept_Inheritance;

public class TestCar {

	public static void main(String[] args) {
		
		BMW b = new BMW();
		b.start(); // Overridden method will be called ----Child class method will be called
		b.stop(); // Inherited
		b.refuel(); // Inherited
		b.autoParking(); // Individual
		
		System.out.println("--------------------------------");
		
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();

		System.out.println("---------------------------------");
		
		// Child class object can be referred by parent class ref variable:
	   Car c1 = new BMW();
	   c1.start(); // Overridden method
	   c1.stop();
	   c1.refuel();
	   
	   System.out.println("----------------");
	   // Parent class object cannot be reffered by child class ref variable
	   
//	   BMW b1 = new Car(); 
	   
	   
	    
		
		
	}

}
