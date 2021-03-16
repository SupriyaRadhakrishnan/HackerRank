import java.util.*;
import java.util.stream.Collectors;

public class MaximumToys {

	public static void main(String[] args) {

		int[] prices = {1,12,5,111,200,1000,10};
		int k = 50;
		System.out.println(maximumToys(prices,  k));
		int[] prices1 = {1,2,3,4};
		k = 7;
		System.out.println(maximumToys(prices1,  k));
	}
	
	 static int maximumToys(int[] prices, int k) {

			int toysCount = 0;
			int sum = 0;
			List<Integer> priceList = Arrays.stream(prices).boxed().collect(Collectors.toList());

			Collections.sort(priceList);

			for (int i = 0; i < priceList.size(); i++) {
				sum += priceList.get(i);
				if (sum <= k)
					toysCount++;
				else
					i = priceList.size();

			}

			return toysCount;

	    }


}
