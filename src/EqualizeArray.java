import java.util.Collections;
import java.util.stream.Collectors;
import java.util.*;

public class EqualizeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int arr[] ={24,29, 70, 43, 12, 27, 29, 24, 41, 12, 41, 43, 24 ,70 ,24, 100, 41, 43, 43, 100, 29, 70, 100, 43, 41 ,27 ,70 ,70 ,59 ,41 ,24 ,24 ,29 ,43 ,24 ,27 ,70 ,24 ,27 ,70 ,24 ,70 ,27 ,24 ,43 ,27 ,100 ,41 ,12 ,70 ,43 ,70, 62 ,12 ,59, 29, 62, 41 ,100 ,43 ,43 ,59 ,59 ,70 ,12 ,27 ,43, 43 ,27 ,27 ,27 ,24 ,43, 43 ,62 ,43 ,70 ,29};
	int arr1[] = {1,2,3,4,5,6,7};
	System.out.println(equalizeArray(arr1));
	}
	
	
	 static int equalizeArray(int[] arr) {
	      
	      List<Integer> arrList = Arrays.stream(arr).boxed().collect(Collectors.toList());
	      Set<Integer> arrSet = Arrays.stream(arr).boxed().collect(Collectors.toSet());
	      int occurence =0;
	      
	      for(int i :arrSet)
	      {
	         if(Collections.frequency(arrList,i) >1)
	         {
	          occurence = Math.max(occurence,Collections.frequency(arrList,i));
	         }
	         
	      }
	      if(occurence>0)
	       return (arr.length - occurence);
	      else
	    	  return arr.length-1;
	    }

}
