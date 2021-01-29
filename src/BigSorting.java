
import java.util.Arrays;

public class BigSorting {

	public static void main(String[] args) {

		String unsorted[] = { "31415926535897932384626433832795", "1", "3", "10", "3", "5" };
		String sorted[] = bigSorting(unsorted);

		for (String s : sorted)
			System.out.println(s);
	}

	static String[] bigSorting(String[] unsorted) {

		String[] result = bigSorting1(unsorted);

		return result;

	}

	static String[] bigSorting1(String[] unsorted) {
		Arrays.sort(unsorted,
				(x, y) -> x.length() == y.length() ? x.compareTo(y) : Integer.compare(x.length(), y.length()));
		return unsorted;
	}

}