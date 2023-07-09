package javaConcepts;

public class Concept02_CallByReference_And_CallByValue {
	
	String name;
	double version;
	String vendor;
	
	public void getInfo(Concept02_CallByReference_And_CallByValue br) {
		System.out.println(br.name + " "+ br.version + " "+ br.vendor);
	}
	
	public void sum(int a, int b) {
		int c = a + b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		
		// Calling via reference
		
		Concept02_CallByReference_And_CallByValue obj = new Concept02_CallByReference_And_CallByValue();
		obj.name = "Chrome";
		obj.version = 100.01;
		obj.vendor = "Google";
		
		obj.getInfo(obj);
		
		System.out.println("=========================================");
		
		// Call by value
		obj.sum(10, 20);

		
	}

}
