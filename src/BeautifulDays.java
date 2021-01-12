
public class BeautifulDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(beautifulDays(13, 45, 3));
	}

	static int beautifulDays(int i, int j, int k) {

		int noOfBeautifulDays = 0;
		int reversed[] = new int[(j - i) + 1];
		int m = 0;
		for (int l = i; l <= j; l++) {
			reversed[m] = reverse(l);
			m++;
		}
		int n = 0;
		for (int l = i; l <= j; l++) {
			if (Math.abs(l - reversed[n]) % k == 0)
				noOfBeautifulDays++;
			n++;
		}

		return noOfBeautifulDays;
	}

	static int reverse(int l) {
		int reverse = 0;
		while (l != 0) {
			int digit = l % 10;
			reverse = reverse * 10 + digit;
			l /= 10;
		}
		return reverse;
	}
}
