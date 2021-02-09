
public class IcecreamParlor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] =  {2,2,4,3};
		int index[] = icecreamParlor(4,arr);
		System.out.println(index[0] + " " + index[1]);
		
	}

	static int[] icecreamParlor(int m, int[] arr) {

		int[] index = new int[2];
		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == m) {
					index[0] = i+1	;
					index[1] = j+1;
					i = arr.length;
					break;
				}
			}
		}

		return index;

	}

}
