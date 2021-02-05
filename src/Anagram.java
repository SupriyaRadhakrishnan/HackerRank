import java.util.*;

public class Anagram {

	public static void main(String[] args) {


		System.out.println(anagram("hhpddlnnsjfoyxpciioigvjqzfbpllssuj"));
		System.out.println(anagram("xulkowreuowzxgnhmiqekxhzistdocbnyozmnqthhpievvlj"));
		System.out.println(anagram("dnqaurlplofnrtmh"));
		System.out.println(anagram("aujteqimwfkjoqodgqaxbrkrwykpmuimqtgulojjwtukjiqrasqejbvfbixnchzsahpnyayutsgecwvcqngzoehrmeeqlgknnb"));
		System.out.println(anagram("lbafwuoawkxydlfcbjjtxpzpchzrvbtievqbpedlqbktorypcjkzzkodrpvosqzxmpad"));
		System.out.println(anagram("drngbjuuhmwqwxrinxccsqxkpwygwcdbtriwaesjsobrntzaqbe"));
		System.out.println(anagram("ubulzt"));
		System.out.println(anagram("vxxzsqjqsnibgydzlyynqcrayvwjurfsqfrivayopgrxewwruvemzy"));
		System.out.println(anagram("xtnipeqhxvafqaggqoanvwkmthtfirwhmjrbphlmeluvoa"));	
	    System.out.println(anagram("gqdvlchavotcykafyjzbbgmnlajiqlnwctrnvznspiwquxxsiwuldizqkkaawpyyisnftdzklwagv"));
		

	}

	static int anagram(String s) {
		
		int numOfChanges = 0;
        if (s.length() % 2 != 0)
            return -1;
        else {
            char[] first = s.substring(0, s.length() / 2).toCharArray();
            String second = s.substring(s.length()/2);

            for (int i = 0; i < first.length; i++) {
                     int index = second.indexOf(first[i]);
                if ( index == -1)
                    numOfChanges++;
                else
                	second= second.substring(0,index) + second.substring(index+1);

            }   
        }

        return numOfChanges;
         
	}
}
