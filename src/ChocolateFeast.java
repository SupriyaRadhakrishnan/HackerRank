
public class ChocolateFeast {

	public static void main(String[] args) {

		System.out.println(chocolateFeast(15, 3, 2));
		System.out.println(chocolateFeast(10, 2, 5));
		System.out.println(chocolateFeast(12, 4, 4));
		System.out.println(chocolateFeast(6, 2, 2));

	}

	// Complete the chocolateFeast function below.
	static int chocolateFeast(int n, int c, int m) {

		int bars = Math.floorDiv(n, c);
		int numOfWrapper = bars;
		if (bars > 0) {
			while (numOfWrapper >= m) {

				bars += (Math.floorDiv(numOfWrapper, m));
				int remaingWrapper = numOfWrapper % m;
				numOfWrapper = Math.floorDiv(numOfWrapper, m) + remaingWrapper;
			}

		}

		return bars;
	}

}
