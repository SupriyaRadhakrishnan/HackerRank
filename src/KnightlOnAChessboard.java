import java.util.*;

public class KnightlOnAChessboard {

	public static void main(String[] args) {
	
		int[][]  ret =knightlOnAChessboard(5);
		
		for(int i=0;i<ret.length;i++)
		{
			for(int j=0;j<ret[i].length;j++)
			{
				
				System.out.print(ret[i][j]);
			}	
			System.out.println();
		}
	}
	static int[][] knightlOnAChessboard(int n) {
        int[][] ret = new int[n - 1][n - 1];

        for (int r = 1; r < n; r++) {
            for (int c = 1; c < n; c++) {
                if (ret[c - 1][r - 1] != 0) {
                    ret[r-1][c-1] = ret[c-1][r-1];
                    continue;
                }
                if (ret[r-1][c-1] == 0) {
                    ret[r-1][c-1] = move(n, 1, 2);
                }
            }
        }
        return ret;
    }

    static int move(int n, int a, int b) {
        int[][] dirs = {{a, b}, {-a, -b}, {a, -b}, {-a, b},  {b, a}, {-b, -a}, {b, -a}, {-b, a}};

        boolean[][] visited = new boolean[n][n];
        int[][] dist = new int[n][n];

        int er = n - 1;
        int ec = n - 1;
        for (int[] row: dist) {
            Arrays.fill(row, - 1);
        }
        
        visited[0][0] = true;
        dist[0][0] = 0;

        Queue<int[]> q = new LinkedList<>();

        q.add(new int[]{0, 0});

        while (!q.isEmpty()) {
            int[] cur = q.remove();
            if (cur[0] == er && cur[1] == ec) {
                return dist[er][ec];
            }

            for(int[] dir: dirs) {
                int x = cur[0] + dir[0];
                int y = cur[1] + dir[1];

                if (x >= 0 && y >= 0 && x < n && y < n && !visited[x][y]) {
                    visited[x][y] = true;
                    q.add(new int[]{x, y});
                    dist[x][y] = dist[cur[0]][cur[1]] + 1;
                }
            }
        }

        return -1;
    }
}
