import java.util.*;

public class Gemstones {

	public static void main(String[] args) {

		String[] arr = { "abcdde", "baccd", "eeabg" };
		System.out.println(gemstones(arr));

	}

	static int gemstones(String[] arr) {

		Set<String> eachStone = new HashSet<>();
		int gemstonesCount = 0;
		for (int i = 0; i < arr.length; i++) {
			char array[] = arr[i].toCharArray();
			for (int j = 0; j < array.length; j++) {
				eachStone.add(String.valueOf(array[j]));
			}
		}

		for (String str : eachStone) {
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[j].contains(str)) {
					count++;
				}
			}

			if (count == arr.length)
				gemstonesCount++;
		}
		return gemstonesCount;

	}

}
