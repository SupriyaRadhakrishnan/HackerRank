import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[][] queries = {{1,5,3},{4,8,7},{6,9,1}};
      System.out.println(arrayManipulation(10,queries));
	}
	
	
	 static long arrayManipulation(int n, int[][] queries) {
		
		 long[] data = new long[n+2];
		 
		for(int j=0;j<queries.length;j++)
		{
			int a = queries[j][0];
			int b = queries[j][1];
			long k = queries[j][2];
			
			data[a] +=k;
			data[b+1] -=k;
		}
		 long max = Long.MIN_VALUE;
		 int sum = 0;
		 for(int j=0;j<data.length;j++)
		 {
			 sum +=data[j];
			max = Math.max(sum, max); 
		 }
		 return max;
	 } 
}
