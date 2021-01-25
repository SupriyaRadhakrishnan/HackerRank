
public class ServiceLane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       int n = 8;
 int width[] = {2,3,1,2,3,2,3,3};
 int cases[][] = {{0,3},{4,6},{6,7},{3,5},{0,7}};
 int minWidth[] = serviceLane(n,width,cases);
 
 for(int i=0;i<minWidth.length;i++)
 {
	 System.out.println(minWidth[i]);
 }
 
	}
	
	static int[] serviceLane(int n, int arr[],int[][] cases) {

		int minWidth[] = new int[cases.length];
     for(int i=0;i<cases.length;i++)
     {
    	minWidth[i] = findMin(arr,cases[i][0],cases[i][1]);
     }
     
     return minWidth;
    }
static int findMin(int[] arr,int start,int end)
{
	 int min = Integer.MAX_VALUE;
     for(int i=start;i<=end;i++) {
         if(arr[i]<min){
             min=arr[i];
         }
     }
     return min;
}
}
