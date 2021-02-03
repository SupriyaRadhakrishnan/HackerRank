
public class HackerrankInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(hackerrankInString("hereiamstackerran"));
	}

	static String hackerrankInString(String s) {

		String word = "hackerrank";
		String extractWord = "";
		int j = 0;
		for (int i = 0; i < word.length(); i++) {
			while (j < s.length()) {

				if (s.charAt(j) == word.charAt(i)) {
					extractWord += s.charAt(j);
					j++;
					break;
				}
				j++;
				if (j == s.length() - 1 && i != word.length() - 1)
					return "NO";
			}

		}

		if (extractWord.equals(word))
			return "YES";
		else
			return "NO";

	}

}
