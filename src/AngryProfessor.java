import java.util.Arrays;

public class AngryProfessor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { -3, -1, 4, 2 };
		int k = 3;

		System.out.println(angryProfessor(k, a));
	}

	static String angryProfessor(int k, int[] a) {
		long negCount = 0;
		negCount = Arrays.stream(a).boxed().filter(x -> x <= 0).count();
		System.out.println(negCount);
		if (negCount >= k)
			return "NO";
		else
			return "YES";

	}

}
