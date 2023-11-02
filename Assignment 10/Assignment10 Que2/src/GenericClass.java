import java.util.Scanner;

public class GenericClass {

	public static void main(String[] args) {
		
		Integer[] arr1 = new Integer[] {10, 20, 30, 40, 50};
		Double[] arr2 = new Double[] {10.1, 20.2, 30.3, 40.4, 50.5};
		
		System.out.println("Addition of Integer Array - " + calcArray(arr1));
		System.out.println("Addition of Double Array - " + calcArray(arr2));
		
	}
	
	public static <T extends Number> double calcArray(T[] arr) {
		double val = Double.MIN_VALUE;
		
		for(int i = 0; i < arr.length; i++) {
			if(val < arr[i].doubleValue()) {
				val = arr[i].doubleValue();
			}
		}
		return val;
	}

}
