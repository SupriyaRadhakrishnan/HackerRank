
public class LargestPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]  = {1,2,3,4};
		int k=1;
       int perm[] = largestPermutation(k,arr);
       for(int i =0;i<perm.length;i++)
       {
    	   System.out.println(perm[i]);
       }
		
	}
	
    
	static int[] largestPermutation(int k, int[] arr) {
       
		int m = k;
    for(int i=0;i<arr.length && k>0;i++)
    {
        int index=0;
        
        for(int j=m-k;j<arr.length;j++)
        {   
            if(arr[j]==arr.length-i)
            {index=j;
            break;}
        }
        if(i!=index) {
        int temp=0;
        temp=arr[i];
        arr[i]=arr[index];
        arr[index]=temp;
        k--;
        }
    }
    return arr;
}

}
