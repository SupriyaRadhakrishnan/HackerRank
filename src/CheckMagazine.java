import java.util.*;
import java.util.stream.Collectors;

public class CheckMagazine {

	public static void main(String[] args) {

		String magazine[] = { "attack", "at", "dawn" };
		String note[] = { "Attack", "at", "dawn" };
		checkMagazine(magazine, note);
		String magazine1[] = { "apgo", "clm", "w", "lxkvg", "mwz", "elo", "bg", "elo", "lxkvg", "elo", "apgo", "apgo",
				"w", "elo", "bg" };
		String note1[] = { "w", "clm", "lxkvg", "mwz", "elo" };
		checkMagazine(magazine1, note1);

	}

	static void checkMagazine(String[] magazine, String[] note) {

		Map<String, Integer> magazineHash = new HashMap<String, Integer>();
		for (int i = 0; i < magazine.length; i++) {
			if (magazineHash.containsKey(magazine[i]))
				magazineHash.put(magazine[i], magazineHash.get(magazine[i]) + 1);
			else
				magazineHash.put(magazine[i], 1);

		}
		int i;
		for (i = 0; i < note.length; i++) {
			if (magazineHash.containsKey(note[i])) {
				magazineHash.put(note[i], magazineHash.get(note[i]) - 1);
				if (magazineHash.get(note[i]) < 0) {
					System.out.println("No");
					i = note.length + 1;
				}
			} else {
				System.out.println("No");
				i = note.length;
			}
		}

		if (i != note.length + 1)
			System.out.println("Yes");

	}

}

//does not work for time complexity
/*
 * List<String> magazineWords =
 * Arrays.stream(magazine).collect(Collectors.toList()); List<String> noteWords
 * = Arrays.stream(note).collect(Collectors.toList()); String isPresent = "";
 * 
 * Collections.sort(magazineWords); Collections.sort(noteWords); for (int i = 0;
 * i < noteWords.size(); i++) {
 * 
 * if (Collections.frequency(magazineWords, noteWords.get(i)) <
 * Collections.frequency(noteWords, noteWords.get(i))) { isPresent = "No";
 * break; }
 * 
 * else if (!magazineWords.contains(noteWords.get(i))) { isPresent = "No";
 * break; } else {
 * magazineWords.remove(magazineWords.indexOf(noteWords.get(i))); isPresent =
 * "Yes"; } }
 * 
 * System.out.println(isPresent);
 */