
public class UtopianTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(utopianTree(4));
	}

	static int utopianTree(int n) {

		int totalGrowth = 1;
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0)
				totalGrowth += 1;
			else
				totalGrowth = totalGrowth * 2;
		}

		return totalGrowth;
	}
}
