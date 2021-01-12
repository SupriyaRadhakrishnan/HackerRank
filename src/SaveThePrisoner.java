
public class SaveThePrisoner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(saveThePrisoner(3,7,3));
	}

	static int saveThePrisoner(int n, int m, int s) {

		int ret = (s + m - 1) % n;//(start+noOfSweets -1)%totalPrisoners
		if (ret == 0)
			ret = n;
		return ret;
	}

}
