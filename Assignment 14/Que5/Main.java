package Que5;

public class Main {

	static <T> int countIf(T[] arr, T key, Check<T> c) {
		int count = 0;
		for (T t : arr) {

			///////////////////////// (x, y) -> x > y   ==> this lambda expression will come here
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
		System.out.println("Count = " + cnt); // 4 (because 4 elements in array are greater than given key i.e. 50)

	}
}
