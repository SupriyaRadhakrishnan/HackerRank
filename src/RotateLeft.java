

public class RotateLeft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {1,2,3,4,5};
		int d = 4;
		 int result[] = rotLeft(a,d);
		for(int i=0;i<result.length;i++)
		{
			System.out.println(result[i]);
		}
	}
	
	static int[] rotLeft(int[] a, int d) {
		int result[] = new int[a.length];
		int diff = a.length - d;
		for(int i = 0; i < a.length; i++){
		    int changedindex = (i + (diff)) % a.length;
		    if(changedindex >= a.length)
		    	result[changedindex-diff] = a[i];
		    else
		    result[changedindex] = a[i];
		}
		return result;
	}
	/*This uses modular arithmetic.
	 * Ex - length of the array is 5. We need to move all the elements 4 position to the left
	 * If we move a[0] four position to the left it is moved to index 1 (after 4 shifts 4,3,2,1).
	 * To make sure only 0-4 is considered for the index we use Mod operation(
	 * we subtract the(length - shifts) which gives the actual number of shift that we will require which is 1 in our case.
	 * We add it with the current index. so elements in each index is moved one index ahead,and the last index value is brought to first.
	 * % a.length helps to restrict us the within the array length).
	 */
//	static int[] rotLeft(int[] a, int d) {
//        int result[] = new int[a.length];
//      for(int i = 0; i < a.length; i++){
//          int changedindex = (i + (a.length - d)) % a.length;
//          result[changedindex] = a[i];
//      }
//      return result;
//  }
}
