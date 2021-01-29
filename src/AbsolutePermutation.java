
public class AbsolutePermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// int p[] = absolutePermutation(4,2);
		int p[] = absolutePermutation(4,2);
		for (int i = 0; i < p.length; i++) {
			System.out.println(p[i]);
		}
	}

	static int[] absolutePermutation(int n, int k) {

		int p[] = new int[n];
		for (int i = 0; i < n; i++)
			p[i] = i + 1;  //fill a array with the numbers 1 - n in index 0 to n-1
		int r[] = { -1 };// in case permutation not found return this 
		int res[] = new int[n];
		for (int i = 0; i < n; i++) {
			int a = (i + 1 + k); //finding the value in the index i using |pos(i) - (i)| = k formula, we are adding one for right indexing.
			int b = (i + 1 - k); // both + and - k is done to get the abs value.
			if (b >= 1 && b <= n && p[b - 1] != -1) {
				res[i] = b;
				p[b - 1] = -1; // assigning the used number to -1. 
			} else if (a >= 1 && a <= n && p[a - 1] != -1) {
				res[i] = a;
				p[a - 1] = -1;// assigning the used number to -1. 
			}
			else
				return r;
		}

		return res;
	}
}
