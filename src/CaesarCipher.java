import java.util.*;

public class CaesarCipher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(caesarCipher("www.abc.xy",87));
	}
	
	  static String caesarCipher(String s, int k) {
		  
		  Map<Character,Character> mapping = new HashMap<>(); 
    
		  String alphabets = "abcdefghijklmnopqrstuvwxyz";
		  String encrypted ="";
		  for(int i=0;i<26;i++)
		  {
			  if(i+(k) < 26)
			  {
//			  encrypted += alphabets.charAt(i+(k+1));
			  mapping.put(alphabets.charAt(i), alphabets.charAt(i+(k)));
			  }
			  else
			  {
//			   encrypted += alphabets.charAt(((i+(k+1)-26))); 
				  int index = (i+k)%26;
			   mapping.put(alphabets.charAt(i), alphabets.charAt(index));
			  }			  
		  }
		  
		  for(Character c : s.toCharArray())
		  {
			  if(Character.isLetter(c))
			  {
				  if(Character.isUpperCase(c))
				  {
					  char temp = mapping.get(Character.toLowerCase(c));
					  encrypted += Character.toUpperCase(temp);
				  }  
				  else
				  {
					  encrypted += mapping.get(c);
				  }
			  }
			  else
				  encrypted += c; 
			  
		  }
		  return encrypted;
	    }

}
