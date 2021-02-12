import java.util.*;

public class LuckBalance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] contests = { { 5, 1 }, { 2, 1 }, { 1, 1 }, { 8, 1 }, { 10, 0 }, { 5, 0 } };
		System.out.println(luckBalance(3, contests));

	}

	static int luckBalance(int k, int[][] contests) {

		List<Integer> important = new ArrayList<>();
		List<Integer> notImp = new ArrayList<>();
		Integer sum = 0;

		for (int i = 0; i < contests.length; i++) {
			if (contests[i][1] == 1)
				important.add(contests[i][0]);
			else
				notImp.add(contests[i][0]);

		}

		if (important.size() <= k) {
			sum = important.stream().reduce(0, Integer::sum);
			sum += notImp.stream().reduce(0, Integer::sum);
		}

		else {
			Collections.sort(important);
			List<Integer> removed = new ArrayList<>();
			while (important.size() > k) {
				removed.add(important.get(0));
				important.remove(0);
			}
			sum = important.stream().reduce(0, Integer::sum);
			sum += notImp.stream().reduce(0, Integer::sum);
			sum -= removed.stream().reduce(0, Integer::sum);
		}

		return sum;

	}

}
