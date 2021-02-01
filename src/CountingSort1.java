import java.util.*;
import java.util.stream.Collectors;

public class CountingSort1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 1, 3, 2, 1 };
		int output[] = countingSort(arr);

		for (int i = 0; i < output.length; i++) {
			System.out.println(output[i]);
		}
	}

	static int[] countingSort(int[] arr) {
		List<Integer> num = Arrays.stream(arr).boxed().collect(Collectors.toList());
        int max = Collections.max(num);
        int output[] = new int[arr.length];

        int a[] = new int[max+1];
        Arrays.fill(a, 0);
        for (int i = 0; i < arr.length; i++) {
            a[arr[i]] += 1;

        }
        int k = 0;
        for (int i = 0; i < a.length; i++) {
            int j = a[i];
            while (j > 0) {
                output[k] = i;
                j--;
                k++;
            }
        }

        return output;
	}

}
