
public class InsertionSort2 {

	public static void main(String[] args) {

		int arr[] = { 3, 4, 7, 5, 6, 2, 1 };
		int arr1[] = {8,7,6,5,4,3,2,1};

		insertionSort2(8, arr1);

	}

	static void insertionSort2(int n, int[] arr) {

		for (int i = 0; i < n; i++) {
			int tempIndex = i;
			boolean flag = false;
			while (tempIndex + 1 < (n) && arr[tempIndex] > arr[tempIndex + 1]) {
				int temp = arr[tempIndex];
				arr[tempIndex] = arr[tempIndex + 1];
				arr[tempIndex + 1] = temp;

				if (tempIndex != 0 && arr[tempIndex] < arr[tempIndex - 1])
					i = tempIndex;
				while (tempIndex != 0 && arr[tempIndex] < arr[tempIndex - 1]) {
					temp = arr[tempIndex];
					arr[tempIndex] = arr[tempIndex - 1];
					arr[tempIndex - 1] = temp;
					tempIndex--;
				}
				print(arr);
				System.out.println();
				tempIndex++;
				flag = true;

			}
			if (!flag && i < n - 1) {
				print(arr);
				System.out.println();
			}
		}

	}

	static void print(int[] arr) {

		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	}

}
