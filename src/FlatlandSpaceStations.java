import java.util.*;
import java.util.stream.Collectors;

public class FlatlandSpaceStations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int c[] = { 0, 1, 2, 3, 4, 5 };
		System.out.println(flatlandSpaceStations(6, c));
		int c1[] = { 0, 4 };
		System.out.println(flatlandSpaceStations(5, c1));
	}

	static int flatlandSpaceStations(int n, int[] c) {

		List<Integer> cList = Arrays.stream(c).boxed().collect(Collectors.toList());
		int i = 0;
		List<Integer> distance = new ArrayList<>();
		for (i = 0; i < n; i++) {
			if (cList.contains(i)) {
				distance.add(0);
			} else {
				distance.add(findNearest(i, cList));
			}
		}
		return Collections.max(distance);
	}

	static int findNearest(int k, List<Integer> cList) {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < cList.size(); i++) {
			min = Math.min(min, Math.abs(cList.get(i) - k));
		}
		return min;
	}
}
