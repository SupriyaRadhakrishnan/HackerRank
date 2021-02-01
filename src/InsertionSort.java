
public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int A[] = {7,4,3,5,6,2};
		insertionSort(A);

	}
	
	
	 public static void insertionSort(int[] A){
	        for(int i = 1; i <= A.length; i++){
	            int j = i - 1;
	            while(j > 0 && A[j-1] > A[j]){
	            	int value = A[j];
	            	A[j] = A[j-1];
	                A[j-1] = value;
	                j--;
	            }
	        }

	        printArray(A);
	    }


	    static void printArray(int[] ar) {
	        for(int n: ar){
	            System.out.print(n+" ");
	        }
	    }

}
