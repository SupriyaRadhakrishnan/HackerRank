
public class SuperReducedString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(superReducedString("aaabccddd"));
	}

	static String superReducedString(String s) {

		for (int i = 0; i < s.length(); i++) {

			if (s.length() > 1 && i != s.length()-1) {
				if (s.charAt(i) == s.charAt(i + 1)) {
					if (i + 2 < s.length())
						s = s.substring(0, i) + s.substring(i + 2);
					else
						s = s.substring(0, i);
					i = -1;
				}
			}

		}
		if (s.equals(""))
			return "Empty String";
		return s;
	}
}
