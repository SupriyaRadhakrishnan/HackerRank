import java.util.*;

public class BalancedSums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> arr = Arrays.asList(1, 2, 3, 3);
		System.out.println(balancedSums(arr));
	}

	static String balancedSums(List<Integer> arr) {

		int sum = 0;
		// get sum of all array index.
		for (int i = 0; i < arr.size(); i++) {
			sum += arr.get(i);
		}

		// initially left sum is zero.
		int leftSum = 0;
		for (int i = 0; i < arr.size(); i++) {
			// if left sum equals right sum print yes.
			if (leftSum == (sum - leftSum - arr.get(i))) {
				return "YES";
			}

			leftSum += arr.get(i);
		}

		return "NO";
	}

}
