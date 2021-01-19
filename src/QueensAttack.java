import java.util.*;

public class QueensAttack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] obstacles = { { 5, 5 }, { 4, 2 }, { 2, 3 } };
		// System.out.println(queensAttack(4,0,4,4,obstacles));
		System.out.println(queensAttack(5, 3, 4, 3, obstacles));
	}

	static int queensAttack(int n, int k, int r_q, int c_q, int[][] obstacles) {

	
		int top, right, bottom, left, top_right, bottom_right, top_left, bottom_left;
		top = n - r_q; // up
		right = n - c_q; // right
		bottom = r_q - 1; // down
		left = c_q - 1; // left
		if (top > right) {
			
			top_right = right;
		} else {
			top_right = top;
		} // corner up1
		if (right > bottom) {
			bottom_right = bottom;
		} else {
			bottom_right = right;
		} // corner down1
		if (top > left) {
			top_left = left;
		} else {
			top_left = top;
		} // corner up2
		if (left > bottom) {
			bottom_left = bottom;
		} else {
			bottom_left = left;
		} // corner down2
		if (k == 0) {
			return (top + right + bottom + left + top_right + bottom_right + top_left + bottom_left);

		} else {

			for (int i = 0; i < k; i++) {
				int x = obstacles[i][0];
				int y = obstacles[i][1];
				if (x > r_q && y == c_q && top > 0 && x - r_q <= top) {
					top = x - r_q - 1;
				} // up
				if (x == r_q && y > c_q && right > 0 && y - c_q <= right) {
					right = y - c_q - 1;
				} // right
				if (x < r_q && y == c_q && bottom > 0 && r_q - x <= bottom) {
					bottom = r_q - x - 1;
				} // down
				if (x == r_q && y < c_q && left > 0 && c_q - y <= left) {
					left = c_q - y - 1;
				} // left
				if (x > r_q && y > c_q && r_q - x == c_q - y && x - r_q <= top_right && top_right > 0) {
					top_right = x - r_q - 1;
				} // corner up right
				if (x < r_q && y > c_q && r_q - x == Math.abs(c_q - y) && y - c_q <= bottom_right && bottom_right > 0) {
					bottom_right = y - c_q - 1;
				} // corner down right
				if (x > r_q && y < c_q && c_q - y == Math.abs(r_q - x) && x - r_q <= top_left && top_left > 0) {
					top_left = x - r_q - 1;
				} // corner up left
				if (x < r_q && y < c_q && r_q - x == c_q - y && r_q - x <= bottom_left && bottom_left > 0) {
					bottom_left = c_q - y - 1;
				} // corner down left
			}
			return (top + right + bottom + left + top_right + bottom_right + top_left + bottom_left);
		}
	}
}
