import java.util.*;

public class NonDivisibleSubset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> s = Arrays.asList(1,7,2,4);
		List<Integer> s1 = Arrays.asList(19,10,12,10,24,25,22);
		System.out.println(nonDivisibleSubset(3,s));
		System.out.println(nonDivisibleSubset(4,s1));

	}
	
	 public static int nonDivisibleSubset(int k, List<Integer> s) {

		        int[] remainderArr = new int[k];

		        for (Integer each : s) {
		            remainderArr[each % k]++;//taking remainder of each element in the array
		        }

		        int zeroRemainder = remainderArr[0];

		        int maxNumberOfDivisibleSet = zeroRemainder > 0 ? 1 : 0;

		        for (int i = 1; i <= (k / 2); i++) {
		            if (i != k - i)
		            {
		                maxNumberOfDivisibleSet += Math.max(remainderArr[i], remainderArr[k - i]);
		            }
		                else
		                maxNumberOfDivisibleSet ++;
		        }

		        return maxNumberOfDivisibleSet;
		    }

		    }
