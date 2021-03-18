import java.util.*;
import java.util.stream.Collectors;

public class TwoArrays {

	public static void main(String[] args) {

//		int A[] = { 2, 1, 3 };
//		int B[] = { 7, 8, 9 };
//
//		System.out.println(twoArrays(10, A, B));
//
//		int C[] = { 1, 2, 2, 1 };
//		int D[] = { 3, 3, 3, 4 };
//
//		System.out.println(twoArrays(5, C, D));
//		
		int E[] = {3,6,8,5,9,9,4,8,4,7};
		int F[] = {5,1,0,1,6,4,1,7,4,3};
		
		System.out.println(twoArrays(9, E, F));
	}

	static String twoArrays(int k, int[] A, int[] B) {

		
		
		Arrays.sort(A);
        Arrays.sort(B);

        for (int i = 0, j = A.length - 1; i < A.length; i++, j--)
            if (B[i] + A[j] < k) return "NO";

        return "YES";

	}   

}
