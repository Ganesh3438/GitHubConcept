package javaConcepts;

/*
 * Encapsulation: Hiding the private data members and exposing via public layer
 */

public class Concept02_OOps_Encapsulation_Continution {

	public static void main(String[] args) {
		
		Concept02_OOps_Encapsulation obj = new Concept02_OOps_Encapsulation();
		System.out.println(obj.name = "IBM");
		System.out.println(obj.email = "ibm@outlook.com");
		
		obj.setSharePrice(200);
		int sharePrice = obj.getSharePrice();
		System.out.println(sharePrice);

	}

}
