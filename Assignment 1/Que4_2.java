package Assignment1;

public class Que4_2 {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {

			for (int j = 5; j > i; j--) {
				System.out.print("-");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			for (int l = 1; l < i; l++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int w = 1; w <= 4; w++) {

			for (int y = 1; y <= w; y++) {
				System.out.print("-");
			}
			for (int x = 4; x >= w; x--) {
				System.out.print("*");
			}
			for (int z = 3; z >= w; z--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
