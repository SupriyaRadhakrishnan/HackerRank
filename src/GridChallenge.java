import java.util.Arrays;

public class GridChallenge {

	public static void main(String[] args) {

		String[] grid = { "abc", "ade", "efg" };
		System.out.println(gridChallenge(grid));

	}

	static String gridChallenge(String[] grid) {

		String sortedGrid[] = new String[grid.length];

		for (int i = 0; i < grid.length; i++) {

			char[] chars = grid[i].toCharArray();

			Arrays.sort(chars);
			sortedGrid[i] = new String(chars);

		}
		for (int i = 0; i < sortedGrid[0].length(); i++) {

			char[] chars = new char[sortedGrid.length];
			for (int j = 0; j < sortedGrid.length; j++) {

				chars[j] = sortedGrid[j].charAt(i);
			}

			String actual = new String(chars);
			Arrays.sort(chars);
			String sorted = new String(chars);

			if (!actual.equals(sorted))
				return "NO";
		}

		return "YES";

	}

}
