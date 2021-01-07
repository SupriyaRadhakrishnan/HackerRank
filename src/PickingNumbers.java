import java.util.*;

public class PickingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> a = Arrays.asList(4, 2, 3, 4, 4, 9, 98, 98, 3, 3, 3, 4, 2, 98, 1, 98, 98, 1, 1, 4, 98, 2, 98, 3,
				9, 9, 3, 1, 4, 1, 98, 9, 9, 2, 9, 4, 2, 2, 9, 98, 4, 98, 1, 3, 4, 9, 1, 98, 98, 4, 2, 3, 98, 98, 1, 99,
				9, 98, 98, 3, 98, 98, 4, 98, 2, 98, 4, 2, 1, 1, 9, 2, 4);
		
		List<Integer> a1 = Arrays.asList(4,6,5,3,3,1);
		System.out.println(pickingNumber(a1));

	}
//This logic uses Map.consider a = 4,6,5,3,3,1  
	public static int pickingNumber(List<Integer> a) {
        int result =0;
		Map<Integer,Integer> frequency = new HashMap<>();
		for (int k = 0; k <= 101; k++) //Since a can range from 1-100
		{
			frequency.put(k,0);
		}
			for (int j = 0; j < a.size(); j++) {
				int index=a.get(j);
				frequency.put(index,frequency.get(index)+1);//example if 1 appears 10 times frequency[1]=10; 
			}

			for (int i = 1; i <= 100; i++) {	
				result = Math.max(result, frequency.get(i) + frequency.get(i-1));
				//in caseof frequency[1]+ frequency[0] = 1
				//in caseof frequency[3]+ frequency[2] = 2
				//in caseof frequency[4]+ frequency[3] = 3
				//in caseof frequency[5]+ frequency[4] = 2
				//in caseof frequency[6]+ frequency[5] = 2
			}
			return result;
		}	
	
	
	//Logic using array.consider a = 4,6,5,3,3,1  
	public static int pickingNumbers(List<Integer> a) {

		int frequency[] = new int[101];//Since a can range from 1-100
		int result = Integer.MIN_VALUE;

		for (int i = 0; i < a.size(); i++) {
			int index=a.get(i);
		frequency[index]++;//example if 1 appears 10 times frequency[1]=10; 
		}

		for (int i = 1; i <= 100; i++) {	
	     System.out.println(frequency[i]);//frequency[1]=1,frequency[3]=2,frequency[4]=1,frequency[5]=1,frequency[6]=1
			result = Math.max(result, frequency[i] + frequency[i - 1]);
			//in caseof frequency[1]+ frequency[0] = 1
			//in caseof frequency[3]+ frequency[2] = 2
			//in caseof frequency[4]+ frequency[3] = 3
			//in caseof frequency[5]+ frequency[4] = 2
			//in caseof frequency[6]+ frequency[5] = 2
		}
		return result;//result is 3
	}	

		
}
