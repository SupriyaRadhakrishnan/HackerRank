import java.util.*;

public class SquareRootCode {

	public static void main(String[] args) {
		
		squareRootCode(200,400);

	}
	
	static void squareRootCode(long m,long n){
		
		int output =0;
		List<Long> values = new ArrayList<Long>();
		for(long i=m;i<=n;i++)
		{
			if(Math.sqrt(i) %1 == 0)
				values.add(i);
		}
		
		for(int i =0;i<values.size();i++)
		{
			System.out.println(values.get(i));
			long len = String.valueOf(values.get(i)).length();
			long arr[] = new long[(int) len];
			long tempVal = values.get(i);
			int k = (int) (len-1);
			
			while(tempVal > 0)
			{
				arr[k] = tempVal%10;
				tempVal = tempVal/10;
				k--;
			}
			
			boolean flag = true;
			int count = 0;
			for(long index=0;index<arr.length-1;index++) {
				if(flag == true && arr[(int) index] < arr[(int) (index+1)])
				{
					flag = false;
				}
				else if(flag == false && arr[(int) index] > arr[(int) (index+1)])
				{
					flag = true;
				}
				else
				{
					count = 1;
					break;
				}
			}
			
			if(count==0)
				output++;
		}
		
		System.out.println(output);
	}

}
