
public class ApplesAndOranges {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int apples[] = { -2, 2, 1 };
		int oranges[] = { 5, -6 };
		countApplesAndOranges(7, 11, 5, 15, apples, oranges);
	}

	static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
		int applescount = 0;
		int orangescount = 0;

		for (int i = 0; i < apples.length; i++) {
			if (a + apples[i] >= s && a + apples[i] <= t)
				applescount++;

		}
		for (int j = 0; j < oranges.length; j++) {
			if (b + oranges[j] >= s && b + oranges[j] <= t)
				orangescount++;
		}
		System.out.println(applescount);
		System.out.println(orangescount);
	}

}
