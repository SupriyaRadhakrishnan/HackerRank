import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Toys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int w[] = { 1, 2, 3, 21, 7, 12, 14, 21 };
		System.out.println(toys(w));
		int x[] = { 1, 2, 3, 4, 5, 10, 11, 12,13 };
		System.out.println(toys(x));
		int z[] = { 12,15,7,8,19,24 };
		System.out.println(toys(z));
		
	}

	static int toys(int[] w) {

		int containers = 0;

		List<Integer> toysList = Arrays.stream(w).boxed().collect(Collectors.toList());
		Collections.sort(toysList);
		int min = toysList.get(0);
		for (int i = 1; i < toysList.size(); i++) {
			if (toysList.get(i) - min > 4) {
				min = toysList.get(i);
				containers++;
				if(i == toysList.size() - 1)
				{
					containers++;
				}
			} else if (i == toysList.size() - 1)
				containers++;
		}

		return containers;
	}

}
