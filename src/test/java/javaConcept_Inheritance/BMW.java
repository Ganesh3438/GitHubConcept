package javaConcept_Inheritance;

// Method overloading: Only with in the same class
// Poly(Many) + Morphism(forms) ---> Compile time polymorphism
// Method overriding is Poly(Many) + Morphism(forms) ---> Run time polymorphism
// Method overridding: When you have a method in the parent class and the same method you 
// have in the child class with the same name and same number of parameters. 

//Note: Private method cannot be override
//Note: We cannot override static methods
//Note: We can overload static methods with in the class
//Note: If the method declare with final keyword cannot be overridden



public class BMW extends Car{
	
	// overridden method 
	public void start() {
		System.out.println("BMW---Start");
	}
	
	public void autoParking() {
		System.out.println("BMW---autoParking");
	}

	

}
