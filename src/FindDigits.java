import java.util.*;

public class FindDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println(findDigits(11));
		System.out.println(findDigits(123456789));
		System.out.println(findDigits(114108089));
		System.out.println(findDigits(110110015));
		System.out.println(findDigits(121));
		System.out.println(findDigits(33));
		System.out.println(findDigits(44));
		System.out.println(findDigits(55));
		System.out.println(findDigits(66));
		System.out.println(findDigits(77));
		System.out.println(findDigits(88));
		System.out.println(findDigits(106108048));
		
	}

	static int findDigits(int n) {
		
		int num = n;
		List<Integer> digits = new ArrayList<>();
		int count = 0;
		while (n > 0) {
			digits.add(n % 10);
			n = n / 10;
		}

		for (int i = 0; i < digits.size(); i++) {
			if (digits.get(i) != 0 && num % digits.get(i) == 0)
				count++;
		}
		return count;
	}
}



