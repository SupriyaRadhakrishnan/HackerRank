import java.util.*;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int arr[] = {5,7,4,3,8};
		int a[] = quickSort(arr);
		
		 for(int i=0;i<a.length;i++)
		    {
		    	System.out.println(a[i]);
		    }
		
	}
	
	  static int[] quickSort(int[] arr) {
		  
		  int a[] = new int[arr.length];
		  List<Integer> left = new ArrayList<>();
		  List<Integer> right = new ArrayList<>();
		  List<Integer> equal = new ArrayList<>();
		  
		    int middle = arr[0];
		    for(int i=0;i<arr.length;i++)
		    {
		    	if(arr[i] > middle)
		    		right.add(arr[i]);
		    	else if(arr[i] < middle)
		    		left.add(arr[i]);
		    	else
		    		equal.add(arr[i]);
		    }
		  
		    int j=0;
		    for(int k :left)
		    {
		    	a[j] = k;
		    	j++;
		    }
		    for(int k :equal)
		    {
		    	a[j] = k;
		    	j++;
		    }
		    for(int k :right)
		    {
		    	a[j] = k;
		    	j++;
		    }
				  
		return a;


	    }

}
