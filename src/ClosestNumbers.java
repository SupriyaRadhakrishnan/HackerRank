import java.util.*;

public class ClosestNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] A = { -20, -3916237, -357920, -3620601, 7374819, -7330761, 30, 6246457, -6461594, 266854 };

		int output[] = closestNumbers(A);

		for (int i : output) {
			System.out.println(i);
		}

		int[] B = { 5, 4, 3, 2, 1 };

		output = closestNumbers(B);

		for (int i : output) {
			System.out.println(i);
		}

		int[] c = { -20, -3916237, -357920, -3620601, 7374819, -7330761, 30, 6246457, -6461594, 266854, -520, -470 };
		output = closestNumbers(c);

		for (int i : output) {
			System.out.println(i);
		}

	}

	static int[] closestNumbers(int[] A) {

		List<Integer> num = new ArrayList<>();

		int min = Integer.MAX_VALUE;

		for (int i = 1; i <= A.length; i++) {
			int j = i - 1;
			while (j > 0 && A[j - 1] > A[j]) {
				int value = A[j];
				A[j] = A[j - 1];
				A[j - 1] = value;
				j--;
			}
		}

		for (int i = 0; i < A.length - 1; i++) {
			if (Math.abs(A[i] - A[i + 1]) < min) {
				min = Math.abs(A[i] - A[i + 1]);
				num.clear();
				num.add(A[i]);
				num.add(A[i + 1]);
			} else if (Math.abs(A[i] - A[i + 1]) == min) {
				min = Math.abs(A[i] - A[i + 1]);
				num.add(A[i]);
				num.add(A[i + 1]);
			}

		}

		int output[] = num.stream().mapToInt(i -> i).toArray();
		return output;

	}
}
