import java.util.Arrays;

public class MinimumAbsoluteDifference {

	public static void main(String[] args) {

		int arr[] = { 3, -7, 0 };
		// System.out.println(minimumAbsoluteDifference(arr));

		int arr1[] = { -2, 2, 4 };
		// System.out.println(minimumAbsoluteDifference(arr1));

		int arr2[] = { -59, -36, -13, 1, -53, -92, -2, -96, -54, 75 };
		System.out.println(minimumAbsoluteDifference(arr2));

	}

	static int minimumAbsoluteDifference(int[] arr) {

		Arrays.sort(arr);
		  int min = arr[1] - arr[0];
	        for (int i = 0; i < arr.length; i++) {
	            for (int j = i + 1; j < arr.length; j++) {
	                int absDiff = Math.abs(arr[j] - arr[i]);
	                min = Math.min(absDiff, min);
	                if(absDiff > min)
	                	break;
	            }
	        }

	        return min;
	}

}
