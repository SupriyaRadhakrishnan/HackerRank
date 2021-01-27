import java.util.*;

public class CavityMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] grid = { "1112", "1912", "1892", "1234" };
		String result[] = cavityMap(grid);
		for (int i = 0; i < grid.length; i++) {

			System.out.println(result[i]);
		}

				
		String[] grid1 = { "989", "191", "111" };
		result = cavityMap(grid1);
		for (int i = 0; i < grid1.length; i++) {

			System.out.println(result[i]);
		}
		
		String[] grid2 = { "989", "191"};
		result = cavityMap(grid2);
		for (int i = 0; i < grid2.length; i++) {

			System.out.println(result[i]);
		}
		String[] grid3 = { "989"};
		result = cavityMap(grid3);
		for (int i = 0; i < grid3.length; i++) {

			System.out.println(result[i]);
		}

	}

	static String[] cavityMap(String[] grid) {

		List<String> indicies = new ArrayList<>();
		int n = grid[0].length();
		for (int i = 1; i < grid.length - 1; i++) {
			for (int j = 1; j < n - 1; j++) {

				if (grid[i].charAt(j) > grid[i].charAt(j - 1) && grid[i].charAt(j) > grid[i].charAt(j + 1)
						&& grid[i].charAt(j) > grid[i + 1].charAt(j) && grid[i].charAt(j) > grid[i - 1].charAt(j)) {
					indicies.add(i + "," + j);
				}
			}
		}

		for (String str : indicies) {
			String s[] = str.split(",");
			String actualStr = grid[Integer.parseInt(s[0])];
			String modified = actualStr.substring(0, Integer.parseInt(s[1])) + "X"
					+ actualStr.substring(Integer.parseInt(s[1]) + 1);
			grid[Integer.parseInt(s[0])] = modified;
		}
		return grid;
	}

}
