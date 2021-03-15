import java.util.*;
import java.util.stream.Collectors;

public class BeautifulPairs {

	private static final int MAX_NUM = 1000;
	
	
	public static void main(String[] args) {
	
		int A[] = {3,5,7,11,5,8};
		int B[] = {5,7,11,10,5,8};
		System.out.println(beautifulPairs(A,B));

	}

	static int beautifulPairs(int[] A, int[] B) {

		int pairsCount =0;
		int bucketA[] = new int[MAX_NUM +1];
		
		for(int i=0;i<A.length;i++)
		{
			 bucketA[A[i]]++;
		}
		
		for (int i = 0; i < B.length; i++) {
           
            if (bucketA[B[i]] > 0) {
                bucketA[B[i]]--;
                pairsCount++;
            }
        }
		 if (pairsCount == A.length) {
			 pairsCount--;
	        } else {
	        	pairsCount++;
	        }
		return pairsCount;
	}

}
