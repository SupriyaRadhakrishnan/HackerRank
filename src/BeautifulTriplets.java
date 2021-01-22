import java.util.*;

public class BeautifulTriplets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[] = {1,2,4,5,7,8,10};
		System.out.println(beautifulTriplets(3,arr));
	}
	  static int beautifulTriplets(int d, int[] arr) {

		  int count  =0;
		  HashSet<Integer> set = new HashSet<>();
		  int midElement = 0;
		  
		  for(int i=0;i<arr.length;i++)
		  {
			  set.removeAll(set);
			  set.add(arr[i]);
			  for(int j=i+1;j<arr.length;j++)
			  {
				  if(set.size() ==1)
				  {
					if(arr[j] - arr[i] ==d)
					{
						midElement= arr[j];	
						set.add(arr[j]);
					}
				  }
				  else
				  {
					  if(arr[j] - midElement ==d)
						{
							set.add(arr[j]);
						} 
				  }
				  if(set.size() == 3)
				  {
					  count++;
					  j =arr.length;
				  }
			  }
		  }
		  
		  return count;
	    }

}
