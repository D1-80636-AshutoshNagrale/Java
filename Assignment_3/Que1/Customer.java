package Assignment_3.Que1;

public class Customer {
	private int accountNo;
	private int pendingBalance;
	private int itemsCharged;
	private int totalCreditsApplied;
	private int creditLimit;

	public Customer(int accountNo, int pendingBalance, int itemsCharged, int totalCreditsApplied, int creditLimit) {
		super();
		this.accountNo = accountNo;
		this.pendingBalance = pendingBalance;
		this.itemsCharged = itemsCharged;
		this.totalCreditsApplied = totalCreditsApplied;
		this.creditLimit = creditLimit;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public int getPendingBalance() {
		return pendingBalance;
	}

	public void setPendingBalance(int pendingBalance) {
		this.pendingBalance = pendingBalance;
	}

	public int getItemsCharged() {
		return itemsCharged;
	}

	public void setItemsCharged(int itemsCharged) {
		this.itemsCharged = itemsCharged;
	}

	public int getTotalCreditsApplied() {
		return totalCreditsApplied;
	}

	public void setTotalCreditsApplied(int totalCreditsApplied) {
		this.totalCreditsApplied = totalCreditsApplied;
	}

	public int getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(int creditLimit) {
		this.creditLimit = creditLimit;
	}

	public void newBalance() {
		this.pendingBalance = this.pendingBalance + this.itemsCharged - this.totalCreditsApplied;
		if ((this.creditLimit - this.pendingBalance) > 0) {
			int balanceForNextMonth = this.creditLimit - this.itemsCharged + this.totalCreditsApplied;
			System.out.println("Your pending balance for next month : " + balanceForNextMonth);
		} else {
			System.out.println("Credit Limit Exceeded !");
		}
	}

	public void displayAccountInfo() {
		System.out.println("Allowed credit limit : " + this.creditLimit);
		System.out.println("Total items charged : " + this.itemsCharged);
		System.out.println("Total all credit applied this month : " + this.totalCreditsApplied);
		System.out.println("Pending balance at the beginning of the month : " + this.pendingBalance);
		newBalance();
	}

	public static void main(String[] args) {
		Customer customer = new Customer(12345, 25000, 13000, 1000, 50000);
		customer.displayAccountInfo();
		System.out.println("***********************************************************");
		Customer customer2 = new Customer(102030, 10000, 11000, 500, 10000);
		customer2.displayAccountInfo();
	}
}
