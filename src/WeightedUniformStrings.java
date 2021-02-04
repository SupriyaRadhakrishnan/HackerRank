import java.util.*;

public class WeightedUniformStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] queries = {1,3,12,5,9,10};
		
		
		String op[] = weightedUniformStrings("abccdddef", queries);

		for (int i = 0; i < op.length; i++) {
			System.out.println(op[i]);
		}
	}

	static String[] weightedUniformStrings(String s, int[] queries) {
		HashMap<Character, Integer> weights = new HashMap<>();	
		Set<Integer> contagiousStrings = new HashSet<>();
		String letters = "abcdefghijklmnopqrstuvwxyz";

		for (int i = 1; i < 27; i++) {
			weights.put(letters.charAt(i - 1), i);

		}

		for (int i = 0; i < s.length(); i++) { // abccddde
			contagiousStrings.add(weights.get(s.charAt(i)));
			char currentChar = s.charAt(i);

			for (int j = i + 1; j < s.length(); j++) {
				if (s.charAt(j) == currentChar) {
					int len = s.substring(i, j + 1).length();
					contagiousStrings.add((weights.get(s.charAt(i)) * len));
				  if(j==s.length() -1)
					  i=s.length();
				} 
				else {
					i = j - 1;
					break;
				}

			}
		}

		String[] queriesOp = new String[queries.length];
		for (int j = 0; j < queries.length; j++) {
			if (contagiousStrings.contains(queries[j])) {
				queriesOp[j] = "Yes";
			} else {
				queriesOp[j] = "No";
			}

		}
		return queriesOp;
	}

}
