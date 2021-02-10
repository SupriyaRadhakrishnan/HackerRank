import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MissingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	static List<Integer> missingNumbers(int[] arr, int[] brr) {

		Set<Integer> brrSet = Arrays.stream(brr).boxed().collect(Collectors.toSet());
		List<Integer> arrList = Arrays.stream(arr).boxed().collect(Collectors.toList());
		List<Integer> brrList = Arrays.stream(brr).boxed().collect(Collectors.toList());
		List<Integer> missingNums = new ArrayList<>();
		for (int n : brrSet) {
			if (Collections.frequency(arrList, n) != Collections.frequency(brrList, n))
				missingNums.add(n);
		}

		while ((Collections.max(missingNums) - Collections.min(missingNums)) > 100) {
			missingNums.remove(Collections.max(missingNums));
		}

		return missingNums;

	}
}
