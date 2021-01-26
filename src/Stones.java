import java.util.*;

public class Stones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int result[] = stones(73,25,25);
		
		 for(int i=0;i<result.length;i++)
		 {
			 System.out.println(result[i]);
		 }
		 
		result = stones(5,3,23);
		 for(int i=0;i<result.length;i++)
		 {
			 System.out.println(result[i]);
		 }
	}
	
	static int[] stones(int n, int a, int b) {

		int i, j = 0;
		List<Integer> lastStone = new ArrayList<>();
		if (a == b) {
			lastStone.add((n - 1) * a);
		} else {
			for (i = 0, j = n - 1; i < n && j >= 0; i++, j--) {
				lastStone.add((i * a) + (j * b));

			}
		}

		int result[] = new int[lastStone.size()];

		for (int k = 0; k < lastStone.size(); k++) {
			result[k] = lastStone.get(k);
		}

		Arrays.sort(result);
		return result;

	}

}
