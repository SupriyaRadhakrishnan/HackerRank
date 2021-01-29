
public class InsertionSort1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2,3,4,5,6,7,8,9,10,1};
		insertionSort1(arr.length, arr);

	}

	static void insertionSort1(int n, int[] arr) {

		int V = arr[n - 1];

		for (int i = n - 2; i >= 0; i--) {
			
			if(i==0 && arr[i] > V)
			{
				arr[i+1] = arr[i];
				print(arr);
				System.out.println();
				arr[i] = V;
			}
			else if (arr[i] > V)
				arr[i + 1] = arr[i];
			else
			{
				arr[i + 1] = V;
				  i =-1;
			}
			
			
			 
			print(arr);
			System.out.println();
		}

	}

	static void print(int[] arr) {

		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i]+" ");
	}
}
