
public class CircularArrayRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1,2,3};
		int k=2;
		int queries[]= {0,1,2};
		int result[] = circularArrayRotation(a,k,queries);

        for(int i=0;i<result.length;i++)
        {
        	System.out.println(result[i]);
        }
	}
	
	 static int[] circularArrayRotation(int[] a, int k, int[] queries) {
	        
		 int result[] = new int[a.length];
			int diff = a.length - k;
			for(int i = 0; i < a.length; i++){
			    int changedindex = (i - (diff)) % a.length;
			    if(changedindex < 0)
			    	result[changedindex+a.length] = a[i];
			    else
			    result[changedindex] = a[i];
			}
			
	        int queriesValue[] = new int[queries.length];
	        for(int j=0;j<queries.length;j++)
	        {
	            queriesValue[j] =result[queries[j]];
	        }
	        return queriesValue;
	        }

}
