package javaConcepts;

public class Concept01_MethodOverLoading {
	
	/*
	 * What is Method overloading?
	 * We have three condition for method ovemrloading:
	 * 1. With in same class when we have number of methods with the same name.
	 * 2. Different parameters
	 * 3. Different types of parameter
	 * 4. Sequence of the parameter should be different
	 */
	
	public void login() {
		System.out.println("Default login");
	}
	
	public void login(String un, String pwd) {
		System.out.println("login with:"+ un + ":" +pwd);
	}
	
	public void login(String un, int otp) {
		System.out.println("login with:"+ un + ":" +otp);
	}
	
	public void login(int otp, String un) {
		System.out.println("login with:"+ un + ":" +otp);
	}
			

	public static void main(String[] args) {
		
		

	}

}
