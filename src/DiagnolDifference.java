import java.util.Arrays;
import java.util.List;

public class DiagnolDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> ar = Arrays.asList(1,2,3);
		List<Integer> ar1 = Arrays.asList(4,5,6);
		List<Integer> ar2 = Arrays.asList(9,8,9);
		List<List<Integer>> arr  = Arrays.asList(ar,ar1,ar2);
		
		System.out.println(diagonalDifference(arr));
	}
	public static int diagonalDifference(List<List<Integer>> arr) {
	    int lefttorightsum = 0;
	    int righttoleftsum =0;
	    int startindex = arr.size()-1;
	    for(int i=0;i<arr.size();i++)
	    {
	    	lefttorightsum += arr.get(i).get(i);
	    	righttoleftsum += arr.get(i).get(startindex);
	    	startindex--;
	    }
	return Math.abs(lefttorightsum - righttoleftsum);
	    }
}
