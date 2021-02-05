
public class PalindromeIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(palindromeIndex("aaab"));
		// slwaebreoxussybaujipwtqdwlayumpeicdiifaafiidciepmuylwdqtwpijuabyssuxoerbeawls

	}

	static int palindromeIndex(String s) {

		int index = -1;
		for (int i = 0; i < s.length() / 2; i++) {

			if (s.charAt(i) != s.charAt((s.length() - 1) - i)) {

				if (isPlaindrome(s.substring(i, (s.length() - 1) - i))) {
					index = (s.length() - 1) - i;
					break;
				} else {
					index = i;
					break;
				}

			}

		}

		return index;
	}

	static boolean isPlaindrome(String s) {

		StringBuilder a= new StringBuilder(s);
		StringBuilder b= new StringBuilder(s);
		b.reverse();
		if (a.toString().equals(b.toString()))
			return true;
		else
			return false;

	}
}
