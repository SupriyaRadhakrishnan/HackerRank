
//Logic - https://github.com/RyanFehr/HackerRank/blob/master/Algorithms/Implementation/The%20Bomberman%20Game/Solution.java
public class BomberMan {

	public static void main(String[] args) {

		String[] grid = { "0..0", ".0..", "...." };
		String g[] = { ".......", "...O.O.", "....O..", "..O....", "OO...OO", "OO.O..." };
		grid = bomberMan(2, g);
		for (int i = 0; i < grid.length; i++) {
			System.out.println(grid[i]);
		}
	}

	static String[] bomberMan(int n, String[] grid) {

		int r = grid.length;
		int c = grid[0].length();
		char[][] initialGrid = new char[r][c];
		char[][] gridAfterFirstDetonation = new char[r][c];
		char[][] gridAfterSecondDetonation = new char[r][c];
		char[][] gridAfterThirdDetonation = new char[r][c];
		char[][] gridAtEvenTimes = new char[r][c];

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				gridAfterSecondDetonation[i][j] = 'O';
				gridAfterThirdDetonation[i][j] = 'O';
				gridAtEvenTimes[i][j] = 'O';
				gridAfterFirstDetonation[i][j] = 'O';
			}
		}

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				initialGrid[i][j] = grid[i].charAt(j);
			}
		}

		gridAfterFirstDetonation = createGrid(r, c, initialGrid, gridAfterFirstDetonation);

		if (n % 2 == 0) {

			return convert(gridAtEvenTimes);
		} else if (n < 4) {
			{
				if (n == 1) {
					return convert(gridAtEvenTimes);

				}
				if (n == 3) {
					return convert(gridAfterFirstDetonation);
				}

			}
		} else {
			gridAfterSecondDetonation = createGrid(r, c, gridAfterFirstDetonation, gridAfterSecondDetonation);
			gridAfterThirdDetonation = createGrid(r, c, gridAfterSecondDetonation, gridAfterThirdDetonation);

			if (n % 4 == 1) {
				return convert(gridAfterSecondDetonation);
			} else {
				return convert(gridAfterThirdDetonation);
			}
		}

		return null;
	}

	private static char[][] createGrid(int r, int c, char[][] gridAtPreviousStep, char[][] gridAtNextStep) {
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				char currentCell = gridAtPreviousStep[i][j];
				if (currentCell == 'O') {
					gridAtNextStep[i][j] = '.';
					if (i - 1 >= 0) {
						gridAtNextStep[i - 1][j] = '.';
					}
					if (i + 1 <= r - 1) {
						gridAtNextStep[i + 1][j] = '.';
					}
					if (j - 1 >= 0) {
						gridAtNextStep[i][j - 1] = '.';
					}
					if (j + 1 <= c - 1) {
						gridAtNextStep[i][j + 1] = '.';
					}

				}

			}

		}

		return gridAtNextStep;
	}

	static String[] convert(char[][] charArray) {
		String[] s = new String[charArray.length];

		for (int i = 0; i < s.length; i++) {
			s[i] = "";
			for (int j = 0; j < charArray[i].length; j++) {
				s[i] += charArray[i][j];
			}
		}
		return s;
	}
}
