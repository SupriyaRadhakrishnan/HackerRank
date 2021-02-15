import java.util.Arrays;

public class Candies {

	public static void main(String[] args) {

		int[] arr = { 4, 6, 4, 5, 6, 2 };
		int arr1[] = { 1, 2, 2 };
		int arr2[] = { 2, 4, 2, 6, 1, 7, 8, 9, 2, 1 };
		int arr3[] = { 2, 4, 3, 5, 2, 6, 4, 5 };

		
		System.out.println(candies(6,arr));
		System.out.println(candies(3,arr1));
		System.out.println(candies(10, arr2));
		System.out.println(candies(8,arr3));

	}

	static long candies(int n, int[] arr) {

		long count = 0;
		int candies[] = new int[arr.length];

		Arrays.fill(candies, 1);

		for (int i = 1; i < arr.length; i++) {

			if (arr[i] > arr[i - 1])
				candies[i] = candies[i - 1] + 1;
		}
		for (int i = arr.length - 1; i > 0; i--) {

			if (arr[i] < arr[i - 1])
				candies[i-1] = Math.max(candies[i-1], candies[i]+1);
		}

		for (int i = 0; i < candies.length; i++) {
			count += candies[i];
		}

		return count;
	}
}
