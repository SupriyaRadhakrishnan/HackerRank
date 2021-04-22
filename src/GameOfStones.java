
public class GameOfStones {

	public static void main(String[] args) {

		System.out.println(gameOfStones(1));
		System.out.println(gameOfStones(2));
		System.out.println(gameOfStones(3));
		System.out.println(gameOfStones(4));
		System.out.println(gameOfStones(5));
		System.out.println(gameOfStones(6));
		System.out.println(gameOfStones(7));
		System.out.println(gameOfStones(10));

	}

	static String gameOfStones(int n) {

		if (n % 7 == 0 || n % 7 == 1)
			return "Second";
		else
			return "First";

	}

}
