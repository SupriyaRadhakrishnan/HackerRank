import java.util.*;

public class MinimumDistances {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int a[] = {7,1,3,4,1,7};
   System.out.println(minimumDistances(a));
   
	}
	
	 static int minimumDistances(int[] a) {
	        
	        List<Integer> indexDiff = new ArrayList<>();
	        for(int i=0;i<a.length;i++)
	        {
	            for(int j=i+1;j<a.length;j++)
	            {
	                if(a[i] == a[j])
	                {
	                indexDiff.add(j-i);
	                j= a.length;  
	                }  
	            }
	        }
	        if(indexDiff.size()>0)
	        return Collections.min(indexDiff);
	        else
	        return -1;
	    }


}
