import java.util.*;
import java.util.stream.Collectors;

public class FairRations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int B[] = { 2, 3, 4, 5, 6 };
		//System.out.println(fairRations(B));
		int B1[] = {1,2};
		System.out.println(fairRations(B1));
		int B2[] = {8,2,2,2,10,2,10,4,6,6,10,4,2,6,2,6,2,6,10,2,4,8,2,4,10,10,10,4,10,2,4,2,2,6,10,2,8,8,8,4,8,4,10,8,4,2,6,8,4,8,8,6,2,4,10,4,8,4,4,10,4,2,8,6,8,2,6,6,6,6,4,8,4,10,6,2,2,8,4,8,6,2,2,4,10,6,8,2,10,4,4,6,4,4,2,2,4,6,2,6,4,4,6,6,10,4,10,4,4,6,2,2,4,8,6,8,8,2,10,6,10,2,4,8,2,10,2,6,10,2,2,2,6,8,2,8,2,4,2,2,8,10,8,2,10,4,8,6,2,6,10,6,6,10,6,10,10,2,10,2,4,2,2,8,2,2,4,4,10,8,6,2,8,2,8,6,4,10,6,10,8,10,8,2,8,10,4,10,2,10,4,8,6,2,10,4,8,6,2,2,2,4,8,10,10,10,4,2,8,2,6,8,4,4,4,8,10,8,2,6,4,10,4,8,10,10,2,4,2,2,4,6,6,2,8,4,2,4,10,2,10,6,8,10,10,8,2,2,6,10,4,10,10,6,8,4,4,2,4,6,2,10,2,6,8,2,6,6,4,2,2,10,6,4,4,2,2,2,6,6,4,4,6,6,10,6,4,8,2,10,4,4,6,10,6,8,4,2,8,4,10,4,2,10,6,6,10,2,2,8,6,6,2,10,6,6,10,10,8,10,2,8,2,6,6,2,2,6,6,10,2,4,6,6,2,8,4,4,2,8,2,10,6,10,6,2,6,8,10,4,4,2,10,4,8,6,8,6,8,4,10,6,4,10,4,10,8,10,6,2,4,8,4,6,8,8,4,2,4,10,6,4,4,4,2,10,10,2,2,6,10,2,4,2,10,2,6,6,2,4,10,10,10,10,2,2,6,8,6,2,8,10,2,8,6,2,10,2,8,6,10,8,10,4,4,2,6,4,6,10,6,8,10,10,6,8,8,8,8,4,6,6,10,2,6,6,10,6,10,6,6,4,4,4,2,10,8,2,8,8,8,2,8,2,8,6,10,8,10,8,8,10,10,2,6,8,2,4,4,8,6,6,8,10,6,6,10,4,6,6,6,10,2,6,8,10,6,4,8,8,4,6,4,6,8,2,2,2,6,6,10,10,6,10,8,6,10,6,4,10,2,8,8,6,4,2,6,10,6,8,4,10,2,10,6,10,4,10,6,2,8,2,2,10,8,8,6,2,8,2,4,8,2,2,2,2,8,10,10,6,4,8,2,2,8,4,6,8,2,6,4,2,4,4,6,8,8,10,6,10,4,8,4,2,2,10,8,4,10,4,8,4,8,10,4,2,6,2,8,2,6,8,10,4,10,6,6,2,2,10,8,2,10,4,4,8,8,2,8,2,4,8,10,6,2,10,2,10,10,2,10,6,8,6,6,4,8,6,6,2,2,6,8,8,2,6,4,4,8,8,2,10,2,10,8,6,2,10,10,4,6,8,8,10,4,8,6,2,10,6,8,10,6,4,10,2,8,10,2,10,6,8,10,8,4,2,8,4,8,8,8,8,2,10,4,6,6,8,8,10,10,4,6,10,6,4,4,8,10,4,10,2,4,8,6,10,8,6,2,4,8,2,4,6,8,2,6,2,10,2,6,6,10,4,8,8,8,4,8,8,10,4,10,2,4,4,4,6,4,10,8,8,6,4,6,6,2,6,8,2,2,2,2,4,4,4,2,10,2,8,4,8,2,8,6,2,10,2,6,8,2,2,6,2,8,10,4,6,6,2,10,8,8,10,2,6,6,10,8,10,8,4,8,8,4,6,8,4,2,6,8,4,8,8,10,6,10,8,8,8,2,8,2,4,10,4,8,10,10,4,4,10,2,4,10,2,10,10,2,6,8,6,4,2,6,8,4,2,2,2,8,2,4,4,10,6,2,10,6,4,10,6,8,10,6,10,4,4,6,6,2,4,4,8,4,4,8,6,2,8,6,2,8,6,10,10,4,8,10,10,4,10,4,2,10,2,10,4,2,10,10,10,8,6,4,6,8,6,10,4,8,4,10,2,4,2,8,10,10,8,8,10,2,8,4,6,6,2,4,10,10,2,6,8,2,6,4,6,2,2,6,8,4,6,2,4,4,10,10,2,6,6,6,6,2,10,2,8,8,10,4,8,2,6,4,6,6,6,8,2,8};
		System.out.println(fairRations(B2));
		
	}

	static int fairRations(int[] B) {

		int loavesCount = 0;

		List<Integer> list = Arrays.stream(B).boxed().collect(Collectors.toList());
		Integer sum = list.stream().reduce(0, (a, b) -> a + b);
		if(sum%2 == 1)
		{
			loavesCount = -1;
			return loavesCount;
		}
		else {
			for (int i = 0; i < B.length - 1; i++) {
				if (B[i] % 2 != 0) {
					B[i] = B[i] + 1;
					B[i + 1] = B[i + 1] + 1;
					loavesCount += 2;
				}
			}
           return loavesCount;
			
			}
	}
}