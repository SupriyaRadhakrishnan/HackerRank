
public class Camelcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(camelcase("saveTheWorld"));
	}

	static int camelcase(String s) {

		int wordCount = 1;
		for (int i = 0; i < s.length(); i++) {
			if (Character.isUpperCase(s.charAt(i)))
				wordCount++;

		}
		
		if (s.isEmpty())
			return 0;

		return wordCount;

	}
}
