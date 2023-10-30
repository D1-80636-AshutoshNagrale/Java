import java.util.Scanner;

public class TestShop {
	public static void main(String[] args) {

		Shop[] shop = null;
		Scanner sc = new Scanner(System.in);

		System.out.println("5 items can be bought per person");
		System.out.println("Enter no. of items that you wanna buy : ");
		int items = sc.nextInt();
		if (items <= 5) {
			shop = new Shop[items];
		} else {
			System.out.println("You cannot buy more than 5 items.");
		}

		boolean value = true;
		int choice = 0;
		int counter = 0;
		do {
			System.out.println("ENTER - ");
			System.out.println("1. ADD ITEM");
			System.out.println("2. DISPLAY YOUR PRODUCTS");
			System.out.println("3. DISPLAY BILL");
			System.out.println("4. TO EXIT");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter 1 to buy book");
				System.out.println("Enter 2 to buy Music Album");
				System.out.println("Enter 3 to buy Toy");
				int c = sc.nextInt();

				if (counter < items) {
					if (c == 1) {
						shop[counter] = new Book();
						shop[counter].accept(sc);
						counter++;
					}
				} else {
					System.out.println("You cannot add more items to your list");
				}
				if (counter < items) {
					if (c == 2) {
						shop[counter] = new Music();
						shop[counter].accept(sc);
						counter++;
					}
				} else {
					System.out.println("You cannot add more items to your list");
				}
				if (counter < items) {
					if (c == 3) {
						shop[counter] = new Toy();
						shop[counter].accept(sc);
						counter++;
					}
				} else {
					System.out.println("You cannot add more items to your list");
				}
				break;

			case 2:
				for (Shop shop2 : shop) {
					if (shop2 instanceof Book) {
						Book b = (Book) shop2;
						System.out.println(b);
					}
					if (shop2 instanceof Music) {
						Music b = (Music) shop2;
						System.out.println(b);
						// b.toString();
					}
					if (shop2 instanceof Toy) {
						Toy b = (Toy) shop2;
						System.out.println(b);
						// b.toString();
					}
				}
				break;
			case 3:
				Book.totalBill(shop);
				System.out.println("======================================");
				Book.totalRevenue(shop);
				break;
			case 4:
				value = false;
				System.exit(0);
				break;

			default:
				System.out.println("Entered invalid choice !!!");
				break;
			}
		} while (value);

	}
}
