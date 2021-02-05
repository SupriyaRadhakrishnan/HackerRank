
public class AlternatingCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(alternatingCharacters(""));
	}

	static int alternatingCharacters(String s) {

		int deletions = 0;

		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i - 1) == s.charAt(i)) {
				deletions++;
			}
		}
		return deletions;

	}

}
