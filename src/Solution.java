import java.io.*;
import java.util.*;

public class Solution {

  

    public static void main(String[] args) throws IOException {
        int c[] = {0,0,0,0,1,0};
//        
//        int result = sockMerchant(10, ar);
//        System.out.println(result);
    	
    	//System.out.println(jumpingOnClouds(c));
    	//System.out.println(repeatedString("aba",10));
    	
    	List<String> attributes = new ArrayList<>(Arrays.asList("p1","1","2"));
    	List<String> attributes1 = new ArrayList<>(Arrays.asList("p2","1","2"));
    	List<String> attributes2 = new ArrayList<>(Arrays.asList("p4","1","2"));
    	List<String> attributes3 = new ArrayList<>(Arrays.asList("p5","1","2"));
    	List<String> attributes4 = new ArrayList<>(Arrays.asList("p3","1","2"));
    	List<String> attributes5 = new ArrayList<>(Arrays.asList("p6","1","2"));
    	
    	List<List<String>> items = Arrays.asList(attributes,attributes1,attributes2,attributes3,attributes4,attributes5);
    	
    	List<String> returnlist = fetchItemsToDisplay(items,1,1,2,5);
    	System.out.println(returnlist.toString());
    }
    
    
    static int sockMerchant(int n, int[] ar) {
       Arrays.sort(ar);
       System.out.println(ar);
       for(int i=0;i<n-1;i++)
       {
       System.out.println(ar[i]);
       }
       
       int paircount=0;
       int count =0;
       for(int i=0;i<n-1;i++)
       {
           if(ar[i]==ar[i+1])
           {
               count += 1;
               i+=1;
           }
           else
           {
               
               paircount+=count;
               count=0;
           }
       }
       paircount+= count;
        return paircount;
    }
    static int jumpingOnClouds(int[] c) {
        int steps =0;
        for(int i = 0; i < c.length-1; i++) {
         if(c[0]==1);
         if(c[i] == 0 && c[i+1] ==0)
         {
             if(i+2 < c.length &&c[i+2] ==0)
             {
                 i++;
             }
             
          steps +=1;   
         }
         else if(i+2 < c.length && c[i+2] ==0) {
        	 steps +=1;
        	 i++;
         }
        	 
         
      }
   return steps;

  }
    static long repeatedString(String s, long n) {

    	long strlen = s.length();
    	long repeated = n/strlen;
    	System.out.println(repeated);
    	int count=0;
    	int remaningcounter=0;
    	long remaining = n - (strlen*repeated);
    	System.out.println(remaining);
    	for(int i=0;i<strlen;i++)
    	{
    		if(s.charAt(i)=='a')
    		{
    			count++;
    		}
    	}
    	
    	for(int i=0;i<remaining;i++)
    	{
    		if(s.charAt(i)=='a')
    		{
    			remaningcounter++;
    		}
    	}
    	
    	return (repeated*count) + remaningcounter;
    }


static List<String> fetchItemsToDisplay(List<List<String>> items, int sortParameter,int sortOrder,int itemsPerPage,int pageNumber)
{
	List<String> returnlist = new ArrayList<>();
    int arraysize = items.size();
    int noofpages =0;
    if(sortOrder ==0)
    {
    	Collections.sort(items,new Comparator<List<String>>(){
			@Override
			public int compare(List<String> o1, List<String> o2) {
				return (o1.get(sortParameter)).compareTo(o2.get(sortParameter)); 
			}});
    }
    else
    {
    	Collections.sort(items,new Comparator<List<String>>(){
			@Override
			public int compare(List<String> o1, List<String> o2) {
				return (o2.get(sortParameter)).compareTo(o1.get(sortParameter)); 
			}});
    }
    	if(arraysize%itemsPerPage == 0)
    	{
	      noofpages = arraysize/itemsPerPage;
    	}
    	else
    	{

    		 noofpages = arraysize/itemsPerPage;
    		noofpages += 1;
    	}
    	//int skipindex = (arraysize/noofpages);
    	
    		if(pageNumber <= noofpages)
    		{
    			int indexvalue = itemsPerPage*(pageNumber-1);
    			for(int i=indexvalue; i< (indexvalue+itemsPerPage);i++)
    			{
    				if(i<arraysize)
    				returnlist.add(items.get(i).get(0));
    			}
    		}
    	
	return returnlist;
		   
	
}
}