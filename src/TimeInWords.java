import java.util.*;

public class TimeInWords {

	private static final String[] numNames = { "", "one", "two", "three", "four", "five", "six", "seven", "eight",
			"nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "quarter", "sixteen", "seventeen", "eighteen",
			"nineteen", "twenty", "twenty one", "twenty two", "twenty three", "twenty four", "twenty five",
			"twenty six", "twenty seven", "twenty eight", "twenty nine", "half" };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(timeInWords(5, 00));
		System.out.println(timeInWords(5, 01));
		System.out.println(timeInWords(5, 15));
		System.out.println(timeInWords(5, 30));
		System.out.println(timeInWords(5, 40));
		System.out.println(timeInWords(5, 45));
		System.out.println(timeInWords(5, 47));
		System.out.println(timeInWords(5, 28));
		System.out.println(timeInWords(12, 00));
	}

	static String timeInWords(int h, int m) {

		String result = "";
		if (m == 00) {
			result += numNames[h] + " o' clock";
		} else if (m > 00 && m <= 30) {
			if (m == 15 || m == 30 || m == 45)
				result += numNames[m] + " past " + numNames[h];
			else if (m == 1)
				result += numNames[m] + " minute past " + numNames[h];
			else
				result += numNames[m] + " minutes past " + numNames[h];
		} else if (m > 30) {
			m = 60 - m;
			if (m == 15 || m == 30 || m == 45)
				result += numNames[m] + " to " + numNames[h + 1];
			else if (m == 1)
				result += numNames[m] + " minute to " + numNames[h + 1];
			else
				result += numNames[m] + " minutes to " + numNames[h + 1];
		}

		return result;
	}

}
