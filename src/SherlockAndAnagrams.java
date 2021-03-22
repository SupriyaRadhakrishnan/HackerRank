import java.util.*;
import java.util.stream.Collectors;

public class SherlockAndAnagrams {

	public static void main(String[] args) {

		System.out.println(sherlockAndAnagrams("abba"));
//		System.out.println(sherlockAndAnagrams("abcd"));
//		System.out.println(sherlockAndAnagrams("ifailuhkqq"));
//		System.out.println(sherlockAndAnagrams("kkkk"));
//		System.out.println(sherlockAndAnagrams("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
	}

	static int sherlockAndAnagrams(String s) {

		int count = 0;
		
		HashMap<Integer,List<String>> hashedSubstrings = new HashMap<Integer,List<String>>();
		
        List<String> substrings = new ArrayList<String>();

        
        for (int i = 1; i <= s.length(); i++){
        	hashedSubstrings.put(i,new ArrayList<String>());
        }
        
        for (int i = 0; i < s.length(); i++) {

            int offset = 1;
            while (i + offset <= s.length()) {
                substrings.add(s.substring(i, i + offset));
                List<String> tempList = hashedSubstrings.get(offset);
                tempList.add(s.substring(i, i + offset));
                hashedSubstrings.put(offset, tempList);
                offset++;
            }
        }

        Collections.sort(substrings);

        for (int i = 0; i < substrings.size(); i++) {
        	
        	int val = isAnagram(substrings.get(i), hashedSubstrings.get(substrings.get(i).length()));
            if (val > 0) {
            	
                count = count + val;
            }
        }
    return count;

    }
   static int isAnagram(String str,List<String> substrings) {
        boolean flag = false;
        int count = 0;
        int i;
        for (i = 0; i < substrings.size(); i++) {
            if (str.length() == substrings.get(i).length()) {
                String temp = substrings.get(i);
                for (int j = 0; j < str.length(); j++) {
                    if (temp.contains(String.valueOf(str.charAt(j)))) {
                        int charIndex = temp.indexOf(str.charAt(j));
                        temp = temp.substring(0, charIndex) + temp.substring(charIndex + 1);
                        flag = true;
                    } else {
                        flag = false;
                        break;
                    }

                }
                if (flag) {
                    count++;
                }
            }

        }
        return count-1;
    }
}

/* Time alogorithm
 int count = 0;
		List<String> substrings = new ArrayList<String>();
		

		for (int i = 0; i < s.length(); i++) {

			int offset = 1;
			while (i + offset <= s.length()) {
				substrings.add(s.substring(i, i + offset));
				offset++;
			}
		}

		Collections.sort(substrings);

		for (int i = 0; i < substrings.size(); i++) {
			if (isAnagram(substrings.get(i), substrings, i) > 0)
				count = count + isAnagram(substrings.get(i), substrings, i);
		}
	return count;

	}

	static int isAnagram(String str, List<String> substrings, int index) {
		boolean flag = false;
		int count = 0;
		int i;
		for (i = index + 1; i < substrings.size(); i++) {
			if (str.length() == substrings.get(i).length()) {
				String temp = substrings.get(i);
				for (int j = 0; j < str.length(); j++) {
					if (temp.contains(String.valueOf(str.charAt(j)))) {
						int charIndex = temp.indexOf(str.charAt(j));
						temp = temp.substring(0, charIndex) + temp.substring(charIndex + 1);
						flag = true;
					} else {
						flag = false;
						break;
					}

				}
				if (flag) {
					count++;
				}
			}

		}
		return count;
	}*/
