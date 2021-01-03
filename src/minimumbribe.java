
public class minimumbribe {

	public static void main(String[] args) {

		int q[] = {1,2,5,3,4,7,8,6};
		int s[] = {5,1,2,3,7,8,6,4};
		           
		minimumBribes(q);
		minimumBribes(s);

	}

	static void minimumBribes(int[] q) {
 
		int counter =0;
		
		for(int i=q.length-1;i>0;i--)
		{
			if(q[i] != i+1) {
				if(((i-1) >= 0) && q[i-1] ==(i+1))
{
	counter++;
	swap(q,i,i-1);
}
				else if(((i-2) >= 0) && q[i-2] ==(i+1))
				{
					counter += 2;
					swap(q,i-2,i-1);
					swap(q,i-1,i);
				}
				else
				{
					System.out.println("Too Chaotic");
					return;
				}
			}
		}
		System.out.println(counter);
}

	private static void swap(int[] q, int i, int j) {
		int temp = q[i];
		q[i] = q[j];
		q[j] = temp;
		
	}
	
	
}