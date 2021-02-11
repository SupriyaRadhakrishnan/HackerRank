import java.util.Arrays;
import java.util.Collections;

public class MarcsCakewalk {

	public static void main(String[] args) {

		int[] calorie = { 819, 701, 578, 403, 50, 400, 983, 665, 510, 523, 696, 532, 51, 449, 333, 234, 958, 460, 277,
				347, 950, 53, 123, 227, 646, 190, 938, 61, 409, 110, 61, 178, 659, 989, 625, 237, 944, 550, 954, 439 };
		System.out.println(marcsCakewalk(calorie));
	}

	static long marcsCakewalk(int[] calorie) {

//		
//		int min  = Integer.MAX_VALUE;
//		int rotatedCalorie[] = new int[calorie.length];

		long powered[] = new long[calorie.length];

		for (int i = 0; i < calorie.length; i++) {
			powered[i] = (long) Math.pow(2, i);
		}

		long sum = 0;
		Arrays.sort(calorie);
		int i = 0;
		for (int j = calorie.length - 1; j >= 0; j--) {
			sum += powered[i] * calorie[j];
			i++;
		}

		return sum;

//		for(int i =0;i<calorie.length;i++)
//		{
//			int sum = 0;
//			rotatedCalorie = rotateleft(calorie,i);
//
//        for(int j=0;j<calorie.length;j++)
//        {
//        	sum += powered[j] * rotatedCalorie[j];
//        }
//        min = Math.min(sum, min);
//        
//		}
//        return min;
//    }
//	
//	static int[] rotateleft(int[] calorie,int pos)
//	{
//		int rotatedCalorie[] = new int[calorie.length];
//		
//		for(int i =0;i<calorie.length;i++)
//		{
//			rotatedCalorie[i] = calorie[(i+pos)%calorie.length];
//		}
//		
//		return rotatedCalorie;
	}

}
