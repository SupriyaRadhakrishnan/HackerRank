
public class MaximizingXor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(maximizingXor(11, 100));

	}

	static int maximizingXor(int l, int r) {

		int max = Integer.MIN_VALUE;

		for (int i = l; i <= r; i++) {
			for (int j = l; j <= r; j++) {
				int xor = i ^ j;
				// System.out.println(xor);
				max = Math.max(xor, max);
			}
		}

		return max;
	}

}
