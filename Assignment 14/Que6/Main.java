package Que6;

public class Main {
	/////////////////////////////////////// (x, y) -> x > y ==> this lambda expression will come here
	static <T> int countIf (T[] arr, T key, Check<T> c) {
		int count = 0;
		for (T t : arr) {

			///////////////////////// (x, y) -> x > y ==> this lambda expression will come
			///////////////////////// here
			boolean result = c.compare(t, key);//
			// comparision will be done as if t > key or not

			if (result == true) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Integer[] arr = { 44, 77, 99, 22, 55, 66 };
		Integer key = 50;
		int cnt = countIf(arr, key, (x, y) -> x > y);
		System.out.println("Integer Count = " + cnt); // 4 (because 4 elements in array are greater than given key i.e.
														// 50)

		Double[] arr1 = { 44.2, 77.2, 99.2, 55.7, 66.8, 77.2, 44.2 };
		Double key1 = 50.0;
		int cnt1 = countIf(arr1, key1, (x, y) -> x > y);
		System.out.println("Double Count = " + cnt1); // 4 (because 4 elements in array are greater than given key i.e.
														// // 50)

	}
}
