import java.util.*;
import java.util.stream.Collectors;

public class TwoStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println(twoStrings("hello","world"));
		System.out.println(twoStrings("hi","world"));
		System.out.println(twoStrings("and","art"));
		System.out.println(twoStrings("be","cat"));
	}

	static String twoStrings(String s1, String s2) {
				
		List<Character> disinctChars 
	     = s1.chars()                       
	            .distinct()                     
	            .sorted()                      
	            .mapToObj(c -> (char) c)        
	            .collect(Collectors.toList()); 	
		for (Character c : disinctChars) {

			if (s2.contains(String.valueOf(c))) {
				return "YES";
			}
		}
		return "NO";
	}

}
