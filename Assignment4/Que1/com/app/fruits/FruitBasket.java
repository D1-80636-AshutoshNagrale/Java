package Assignment4.Que1.com.app.fruits;

import java.util.Scanner;

public class FruitBasket {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of fruits you wanna buy : ");
		int basketSize = sc.nextInt();

		Fruit[] fruits = new Fruit[basketSize];

		int counter = 0;

		boolean value = true;
		while (value) {
			System.out.println("***********************************************");
			System.out.println("0. EXIT");
			System.out.println("1. ADD MANGO");
			System.out.println("2. ADD ORANGE");
			System.out.println("3. ADD APPLE");
			System.out.println("4. DISPLAY NAMES OF ALL FRUITS IN BASKET");
			System.out.println("5. DISPLAY DETAILS OF ALL FRUITS IN THE BASKET");
			System.out.println("6. DISPLAY TASTES OF ALL STALE FRUITS IN BASKET");
			System.out.println("7. MARK A FRUIT AS STALE");
			System.out.println("8. MARK ALL SOUR FRUITS STALE");
			System.out.println("***********************************************");
			System.out.println("ENTER YOUR CHOICE : ");
			int choice = sc.nextInt();
			switch (choice) {
			case 0:
				System.out.println("Thank you for visiting the shop");
				System.exit(0);
				break;
			case 1:
				if (counter < basketSize) {
					fruits[counter] = new Mango("Yellow", 75.00, "Mango", true);
					counter++;
					System.out.println("Added to basket");
				} else {
					System.out.println("Basket is full !!!");
				}
				break;
			case 2:
				if (counter < basketSize) {
					fruits[counter] = new Orange("Orange", 50.00, "Orange", true);
					counter++;
					System.out.println("Added to basket");
				} else {
					System.out.println("Basket is full !!!");
				}
				break;
			case 3:
				if (counter < basketSize) {
					fruits[counter] = new Apple("Apple", 60.00, "Apple", true);
					counter++;
					System.out.println("Added to basket");
				} else {
					System.out.println("Basket is full !!!");
				}
				break;
			case 4:
				for (Fruit fruit : fruits) {
					System.out.println(fruit.getName());
				}
				break;
			case 5:
				for (Fruit fruit : fruits) {
					System.out.println(fruit.toString());
				}
				break;
			case 6:
				for (Fruit fruit : fruits) {
					if (fruit.isFresh() == false) {
						System.out.println("No any fruit in the basket is stale");
					} else {
						System.out.println(fruit.getName() + " is pale");
					}
				}
				break;
			case 7:
				boolean choice1 = true;
				do {
					System.out.println("Mark fruit number in the basket as stale : ");
					int fruitNo = sc.nextInt();
					if (fruitNo <= basketSize) {
						for (int i = 0; i < (fruitNo); i++) {
							if (i == (fruitNo - 1)) {
								fruits[i].setFresh(false);
							}
						}
						System.out.println("Enter 1 to mark another fruit as stale");
						System.out.println("Enter 2 to exit");
						int choice2 = sc.nextInt();
						if (choice2 == 1) {
							choice1 = true;
						} else {
							choice1 = false;
						}
					} else {
						System.out.println("Entered invalid fruit no in basket");
					}
				} while (choice1);
				break;
			case 8:
				for (Fruit fruit : fruits) {
					if (fruit instanceof Apple) {
						Apple a = (Apple) fruit;
						if (a.taste() == "Sour") {
							a.setFresh(false);
						}
					}
					if (fruit instanceof Orange) {
						Orange a = (Orange) fruit;
						if (a.taste() == "Sour") {
							a.setFresh(false);
						}
					}
					if (fruit instanceof Mango) {
						Mango a = (Mango) fruit;
						if (a.taste() == "Sour") {
							a.setFresh(false);
						}
					}
				}
				System.out.println("*************************************");
				System.out.println("Done");
				System.out.println("*************************************");
				break;

			default:
				System.out.println("Invalid choice entered");
				System.exit(0);
				break;
			}
		}
	}
}
