import java.util.*;


public class CutTheSticks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 3, 4, 3, 3, 2, 1 };
		int k[] = cutTheSticks(arr);

		for (int i = 0; i < k.length; i++) {
			System.out.println(k[i]);
		}

	}

	static int[] cutTheSticks(int[] arr) {
		Arrays.sort(arr);
		int result[] = new int[arr.length];
		int k = 0;
		result[k] = arr.length;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] != arr[i - 1]) {
				k++;
				result[k] = arr.length - i;

			}
		}
		int output[] = new int[k + 1];
		for (int i = 0; i < k + 1; i++) {
			output[i] = result[i];
		}
		return output;
	}
}
