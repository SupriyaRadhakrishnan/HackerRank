
public class IntroTutorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int arr[] = {1,5,4,7,9,12};
		
		System.out.println(introTutorial(9,arr));
	}
	
	 static int introTutorial(int V, int[] arr) {
          
		 int endIndex = arr.length;
		 int startIndex  = 0;
		 int middle = arr.length/2;
		 
		 if(arr[middle] < V)
		 {
			 startIndex = middle;	 
		 }
		 else
		 {
			 endIndex =  middle;
		 }
		 for(int i=startIndex;i<endIndex;i++)
		 {
			 if(arr[i] == V)
			    return i;
		 }
		 
		 return -1;
	   }
}
