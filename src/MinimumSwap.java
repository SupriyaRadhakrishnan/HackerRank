
public class MinimumSwap {
	
	 public static void main(String[] args)
	 {
		 int arr[] = {1,3,5,2,4,6,7};
		 System.out.println(minimumSwaps(arr));
	 }
	 
	 static int minimumSwaps(int[] arr) {
   int counter =0 ;
  
   for(int i=0;i<arr.length;i++){
       if(i+1!=arr[i]){
           int t=i;
           while(arr[t]!=i+1){
               t++;  
           }
           int temp=arr[t];
           arr[t]=arr[i];
           arr[i]=temp;
           counter++;
       }
   }
   return counter;
	    }
	 
	 
}
