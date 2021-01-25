import java.util.*;
import java.util.stream.Collectors;

public class Workbook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,8,19,15,2,29,3,2,25,2,19,26,17,33,22};
		System.out.println(workbook(15,20,arr));
		int arr1[] = {4,2,6,1,10};
		System.out.println(workbook(5,3,arr1));
		int arr2[] = {100};
		System.out.println(workbook(1,1,arr2));
	}
	 static int workbook(int n, int k, int[] arr) {
        int numOfSpecialPages = 0; 
       Map<Integer,String> eachPage = new HashMap<>();  
       eachPage.put(0, "0");
     int probNum = 1;
      int counter = 1;
       for(int i=0;i<n ;i++)
       {
    	   int count = arr[i];
    	   String s ="";
    	   int initialiser = 0;
    	   probNum =0;
    	   while(count > 0)
    	   {
    		   probNum++;
    		   s += String.valueOf(probNum) + ",";
    		   count--;
    		   initialiser++;
    		   if(count==0)
    		   {
    			 eachPage.put(counter, s);
      		     initialiser = 0;
      		     counter++; 
    		   }
    		   if(initialiser ==k)
    		   {
    		     eachPage.put(counter, s);
    		     initialiser = 0;
    		     counter++;
    		     s="";
    		   }  
    	   }   
       }
       
       for(Map.Entry<Integer, String> entry : eachPage.entrySet())
       {
    	   
    	   //System.out.println(entry.getValue());
    	   String[] str = entry.getValue().split(",");
    	   List<String> srtList = Arrays.asList(str);
    	   if(entry.getKey() != 0 && srtList.contains(String.valueOf(entry.getKey())))
    			   numOfSpecialPages++;   
    	   
       }
        return numOfSpecialPages;
        
	    }

}
