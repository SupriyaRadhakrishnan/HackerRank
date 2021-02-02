
public class FindMedian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int A[] = {0,1,2,4,6,5,3};
		System.out.println(findMedian(A));
		
	}

	 static int findMedian(int[] A) {

		 
		 for(int i = 1; i <= A.length; i++){
	            int j = i - 1;
	            while(j > 0 && A[j-1] > A[j]){
	            	int value = A[j];
	            	A[j] = A[j-1];
	                A[j-1] = value;
	                j--;
	            }
	        }
		 
		 return A[A.length/2];

	    }

}
