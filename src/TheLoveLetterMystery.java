import java.util.*;

public class TheLoveLetterMystery {

	public static void main(String[] args) {

		// System.out.println(theLoveLetterMystery("abc"));
		// System.out.println(theLoveLetterMystery("lmnop"));
		System.out.println(theLoveLetterMystery("adslkfjas"));
		System.out.println(theLoveLetterMystery("bafhaef"));

	}

	static int theLoveLetterMystery(String s) {

		int numOfOperations = 0;

		String alpha = "abcdefghijklmnopqrstuvwxyz";

		for (int i = 0; i < s.length() / 2; i++) {

			if (s.charAt(i) != s.charAt((s.length() - 1) - i)) {
				if (s.charAt((s.length() - 1) - i) == 'a') {
					char value = s.charAt(i);
					numOfOperations += Math.abs((alpha.indexOf(value) - alpha.indexOf(s.charAt((s.length() - 1) - i))));

				}

				else {

					char value = s.charAt((s.length() - 1) - i);
					numOfOperations += Math.abs((alpha.indexOf(value) - alpha.indexOf(s.charAt(i))));

				}
			}
		}
		return numOfOperations;

	}

}
