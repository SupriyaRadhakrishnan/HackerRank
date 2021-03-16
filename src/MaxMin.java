import java.util.*;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MaxMin {

	public static void main(String[] args) {

		int arr[] = { 10, 100, 300, 200, 1000, 20, 30 };
		System.out.println(maxMin(3, arr));

		int arr1[] = { 5, 20, 822, 1520, 1784, 2422, 2822, 3142, 3902, 4094, 4157, 4504, 5413, 5629, 5857, 6643, 7232,
				7288, 7802, 8245, 9739, 9948 };
		System.out.println(maxMin(5, arr1));

	}

	static int maxMin(int k, int[] arr) {

		Arrays.sort(arr);
		int minUnfairness = arr[k - 1] - arr[0];
		for (int i = 0; i < arr.length - k + 1; i++) {
			System.out.println("Diff :" + arr[i + k - 1] + " - " + arr[i] + " == " + (arr[i + k - 1] - arr[i]));
			if ((arr[i + k - 1] - arr[i]) < minUnfairness) {

				minUnfairness = arr[i + k - 1] - arr[i];
			}
		}
		return minUnfairness;

	}
}
