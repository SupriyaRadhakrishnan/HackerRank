
public class Pangrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	static String pangrams(String s) {

		char letters[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
				's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };

		for (int i = 0; i < letters.length; i++) {
			if (s.indexOf(letters[i]) < 0 && s.indexOf(Character.toUpperCase(letters[i])) < 0)
				return "not pangram";
		}

		return "pangram";
	}

}
