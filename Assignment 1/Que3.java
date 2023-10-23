package Assignment1;

import java.util.Scanner;

public class Que3 {
	Scanner sc = new Scanner(System.in);
	int dosa = 30;
	int samosa = 15;
	int idli = 20;
	int iqty;
	int sqty;
	int dqty;

	void items() {
		int choice = 1;

		while (choice != 0) {
			System.out.println("Enter your choice");
			System.out.println("1.Samosa");
			System.out.println("2.Dosa");
			System.out.println("3.Idli");
			System.out.println("0. EXIT");

			choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter quantity of samosa :");
				sqty = sc.nextInt();
				break;
			case 2:
				System.out.println("Enter quantity of Dosa :");
				dqty = sc.nextInt();
				break;
			case 3:
				System.out.println("Enter quantity of idli :");
				iqty = sc.nextInt();
				break;
			default:
				System.out.println("Erong choice entered");
				break;
			}
		}
	}

	public static void main(String[] args) {
		Que3 q = new Que3();
		q.items();
		System.out.println("======================== BILL ========================");
		System.out.println();
		if (q.sqty > 0) {
			System.out.println("Samosa : " + q.sqty + " qty      Price = " + (q.sqty * q.samosa) + " /-");
		}
		if (q.dqty > 0) {
			System.out.println("Dosa : " + q.dqty + " qty        Price = " + (q.dqty * q.dosa) + " /-");
		}
		if (q.iqty > 0) {
			System.out.println("Idli : " + q.iqty + " qty        Price = " + (q.iqty * q.idli) + " /-");
		}
		System.out.println();
		System.out.println("                    TOTAL : " + ((q.sqty * q.samosa) + (q.iqty * q.idli) + (q.dqty * q.dosa))+" /-");
		System.out.println();
		System.out.println("===================== VISIT AGAIN ======================");
	}
}
