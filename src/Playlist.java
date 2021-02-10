import java.util.*;

public class Playlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> time = Arrays.asList(10,50,30,40,60,90);
		System.out.println(playlist(time));
	}
	
	static long playlist( List<Integer> time)
	{
		
		   int remainders[] = new int[60];
	        long count = 0;
	        for (int t: time) {
	            if (t % 60 == 0) { // check if a%60==0 && b%60==0
	                count += remainders[0];
	            } else { // check if a%60+b%60==60
	                count += remainders[60 - t % 60];
	            }
	            remainders[t % 60]++; // remember to update the remainders
	        }
 	        return count;
	}

}


