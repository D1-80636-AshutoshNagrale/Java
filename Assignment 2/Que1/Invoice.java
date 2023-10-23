package Assignment2.Que1;

public class Invoice {
	private String pNo;
	private String pDesc;
	private int pQty;
	private double pPrice;

	public Invoice(String pNo, String pDesc, int pQty, double pPrice) {
		super();
		this.pNo = pNo;
		this.pDesc = pDesc;
		this.pQty = pQty;
		this.pPrice = pPrice;
	}

	public String getpNo() {
		return pNo;
	}

	public void setpNo(String pNo) {
		this.pNo = pNo;
	}

	public String getpDesc() {
		return pDesc;
	}

	public void setpDesc(String pDesc) {
		this.pDesc = pDesc;
	}

	public int getpQty() {
		return pQty;
	}

	public void setpQty(int pQty) {
		if (pQty < 0) {
			this.pQty = 0;
		}
		this.pQty = pQty;
	}

	public double getpPrice() {
		return pPrice;
	}

	public void setpPrice(double pPrice) {
		if (pPrice < 0) {
			this.pPrice = 0.0;
		}
		this.pPrice = pPrice;
	}

	public void displayPart() {
		System.out.println("Part No. : " + this.pNo);
		System.out.println("Part Description : " + this.pDesc);
		System.out.println("Part Quantity : " + this.pQty);
		System.out.println("Part Price : " + this.pPrice);
	}
}
