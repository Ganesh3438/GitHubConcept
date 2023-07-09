package javaConcepts;

public class Concept02_OOps_Encapsulation {

	public String name;
	private int sharePrice;
	public String email;
	
	public int getSharePrice() {
		return sharePrice;
	}

	public void setSharePrice(int sharePrice) {
		this.sharePrice = sharePrice;
	}

	public static void main(String[] args) {
		
		Concept02_OOps_Encapsulation obj = new Concept02_OOps_Encapsulation();
		String companyName = obj.name = "TCS";
		int share = obj.sharePrice = 1234;
		String emailId = obj.email = "tcs@gmail.com";
		
		System.out.println(companyName);
		System.out.println(share);
		System.out.println(emailId);
		

	}

}
