
public class SeparateNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		separateNumbers("1234");
		separateNumbers("91011");
		separateNumbers("99100");
		separateNumbers("99910001001");
		separateNumbers("999100010001");
		
	}
	
	 static void separateNumbers(String s) {

		 boolean valid = false;
			long firstx = -1;
		 for (int i=1; i<=s.length()/2; ++i) {
				long x = Long.parseLong(s.substring(0,i));
				firstx = x;
			   // Build up a string by adding 1 to the existing X value
				String test = Long.toString(x);
				while (test.length() < s.length()) {
					test += Long.toString(++x);
				}
				// Compare to original
				if (test.equals(s)) {
					valid = true;
					System.out.println("YES"+" "+firstx);
					break;
				}
				
		 }
		 
		 if(!valid)
			 System.out.println("NO");
}
}
