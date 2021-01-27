
public class SurfaceArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int A[][] = { { 1, 3, 4 }, { 2, 2, 3 }, { 1, 2, 4 } };
		System.out.println(surfaceArea(A));
	}

	static int surfaceArea(int[][] A) {
		
		int result = 0;
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[0].length; j++) {
				result += 4 * A[i][j] + 2;
				// Check whether it is last row
				if(i != A.length - 1) {
					result -= 2 * Math.min(A[i][j], A[i + 1][j]);
				}
				// Check whether it is last column
				if(j != A[0].length - 1) {
					result -= 2 * Math.min(A[i][j], A[i][j + 1]);
				}
			}
		}
		return result;
	}

}
