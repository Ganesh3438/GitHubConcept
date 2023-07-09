package oops_encapsulations;

public class Company {
	
	public String name = "";
	private int sharePrice;
	public String hq = "";

	public void setSharePrice(int sharePrice) {
		this.sharePrice = sharePrice;
	}
	
	public int getSharePrice() {
		return sharePrice;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Company cc = new Company();
		cc.name = "IBM";
		cc.sharePrice = 10000;
		cc.hq = "HYD";
		System.out.println(cc.name + " "+ cc.sharePrice + " "+ cc.hq);
		
	}

}
