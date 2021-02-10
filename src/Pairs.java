import java.util.Arrays;

public class Pairs {

	public static void main(String[] args) {

int arr[] = {1,5,3,4,2};
System.out.println(pairs(2,arr));

	}

	static int pairs(int k, int[] arr) {

		int pairsCount = 0;

		Arrays.sort(arr);

		for (int i = arr.length - 1; i >= 0; i--) {
			for (int j = i - 1; j >= 0; j--) {

				if (arr[i] - arr[j] == k)
					pairsCount++;
				else if (arr[i] - arr[j] > k)
					j = -1;
			}
		}
		return pairsCount;

	}

}
