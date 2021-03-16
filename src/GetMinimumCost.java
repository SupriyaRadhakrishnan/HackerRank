import java.util.*;
import java.util.stream.Collectors;

public class GetMinimumCost {

	public static void main(String[] args) {

		int[] c = { 1, 3, 5, 7, 9 };
		int k = 3;
		System.out.println(getMinimumCost(k, c));

		int[] d = { 390225, 426456, 688267, 800389, 990107, 439248, 240638, 15991, 874479, 568754, 729927, 980985,
				132244, 488186, 5037, 721765, 251885, 28458, 23710, 281490, 30935, 897665, 768945, 337228, 533277,
				959855, 927447, 941485, 24242, 684459, 312855, 716170, 512600, 608266, 779912, 950103, 211756, 665028,
				642996, 262173, 789020, 932421, 390745, 433434, 350262, 463568, 668809, 305781, 815771, 550800 };
		System.out.println(getMinimumCost(k, d));
	}

	static int getMinimumCost(int k, int[] c) {

		int minCost = 0;
		int ct = c.length - 1;
		int prev = 0;
		List<Integer> costs = Arrays.stream(c).boxed().collect(Collectors.toList());
		Collections.sort(costs);

		while (ct >= 0) {
			for (int i = 0; i < k && ct >= 0; i++) {
				minCost += (1 + prev) * costs.get(ct);
				ct--;
			}
			prev++;
		}

		return minCost;

	}

}
