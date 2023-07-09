package javaConcepts;

public class Concept01_ObjectReferenceConcept {

	String name;
    int age;
    
    public void get() {
    	System.out.println("get method");
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		Concept01_ObjectReferenceConcept obj = new Concept01_ObjectReferenceConcept();
    
		obj = null;
		obj.name = "Tom";
		obj.age = 25;
		System.out.println(obj.name);
		
	}

}
