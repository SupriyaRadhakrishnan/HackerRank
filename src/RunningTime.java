
public class RunningTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = {7,4,3,5,6,2};
		System.out.println(runningTime(A));
	}
	
	
	 static int runningTime(int[] A) {
		   int runTime =0;
		      for(int i = 1; i <= A.length; i++){
		                int j = i - 1;
		                while(j > 0 && A[j-1] > A[j]){
		                    int value = A[j];
		                    A[j] = A[j-1];
		                    A[j-1] = value;
		                    j--;
		                    runTime++;
		                }
		            }
		            return runTime;
		    }

}
