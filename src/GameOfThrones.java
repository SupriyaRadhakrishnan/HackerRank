import java.util.*;

public class GameOfThrones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(gameOfThrones("aaabbbb"));

	}

	static String gameOfThrones(String s) {

		Set<Character> letters = new HashSet<>();
		List<Character> letterList = new ArrayList<>();
		int count = 0;

		for (int i = 0; i < s.length(); i++) {
			letters.add(s.charAt(i));
			letterList.add(s.charAt(i));
		}

		if (s.length() % 2 == 0) {
			for (Character c : letters) {
				if (!(Collections.frequency(letterList, c) % 2 == 0)) {
					return "NO";
				}
			}
		}

		else {

			for (Character c : letters) {
				if ((Collections.frequency(letterList, c) % 2 != 0)) {
					count++;
				}

				if (count > 1)
					return "NO";
			}
		}
		return "YES";

	}

}
