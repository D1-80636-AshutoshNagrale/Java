import java.util.Objects;
import java.util.Scanner;

public abstract class Shop {
	private double price;
	private double tax;

	public Shop() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Shop(double price, double tax) {
		super();
		this.price = price;
		this.tax = tax;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	public void accept(Scanner sc) {
		System.out.println("Enter price : ");
		this.price = sc.nextDouble();
	}

	public static void totalBill(Shop[] arr) {
		double sum = 0;
		for (Shop shop : arr) {
			sum = sum + (shop.price + shop.tax);
			System.out.println("Item : " + shop.getClass().getName() + "      Price : " + shop.price);
		}
		System.out.println("*******************************");
		System.out.println("Total Bill : " + sum);
		System.out.println();
	}

	public static void totalRevenue(Shop[] arr) {
		double sum = 0;
		for (Shop shop : arr) {
			sum = sum + shop.price;
			System.out.println("Item : " + shop.getClass().getName() + "      Price : " + shop.price);
		}
		System.out.println("*******************************");
		System.out.println("Total Revenue : " + sum);
		System.out.println();
	}

	@Override
	public String toString() {
		return "Shop [price=" + price + ", tax=" + tax + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(price, tax);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Shop other = (Shop) obj;
		return Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Double.doubleToLongBits(tax) == Double.doubleToLongBits(other.tax);
	}

}
