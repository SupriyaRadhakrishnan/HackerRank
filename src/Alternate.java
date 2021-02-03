import java.util.*;
import java.util.stream.Collectors;

import javax.xml.stream.events.Characters;

public class Alternate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// System.out.println(alternate("txnbvnzdvasknhlmcpkbxdvofimsvqbvkswlkrchohwuplfujvlwpxtlcixpajjpaskrnjneelqdbxtiyeianqjqaikbukpicrwpnjvfpzolcredzmfaznnzd"));
		// System.out.println(alternate("tlymrvjcylhqifsqtyyzfaugtibkkghfhyzxqbsizkjguqlqwwetyofqihtpkmpdlgthfybfhhmjerjdkybwppwrdapirukcshkpngayrdruanjtziknnwxmsjpnuswllymhkmztsrcwwzmlbcoakswwffveobbvzinkhnmvwqhpfednhsuzmffaebi"));
		System.out.println(alternate(
				"muqqzbcjmyknwlmlcfqjujabwtekovkwsfjrwmswqfurtpahkdyqdttizqbkrsmfpxchbjrbvcunogcvragjxivasdykamtkinxpgasmwz"));
	}

	static int alternate(String s) {

		List<Character> cList = getList(s);
		int max = 0;

		for (int i = 0; i < cList.size() - 1; i++) {
			for (int j = i + 1; j < cList.size(); j++) {

				int len = checkValidString(cList.get(i), cList.get(j), s);
				max = Math.max(max, len);
			}
		}
		return max;

	}

	static int checkValidString(char c1, char c2, String s) {
		// System.out.println(c1 + "," + c2);
		String str = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == c1 || s.charAt(i) == c2)
				str += s.charAt(i);
		}

		// System.out.println(str);
		for (int i = 0; i < str.length(); i++) {
			if (i == str.length() - 1 && str.charAt(i) != c1) {
				return 0;
			} else if (i == str.length() - 1 && str.charAt(i) == c1) {
				return str.length();
			} else if (str.charAt(i) == c1 && str.charAt(i + 1) == c2) {
				i++;
			} else
				return 0;
		}
		System.out.println(str);
		return str.length();
	}

	static List<Character> getList(String s) {
		List<Character> cList = new ArrayList<>();
		for (char c : s.toCharArray()) {
			if (!cList.contains(c))
				cList.add(c);
		}
		return cList;
	}

}
