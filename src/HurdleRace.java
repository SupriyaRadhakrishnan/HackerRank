import java.util.*;
import java.util.stream.Collectors;

public class HurdleRace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 static int hurdleRace(int k, int[] height) {
	        
	        List<Integer> heightlist = Arrays.stream(height).boxed().collect(Collectors.toList());
	        Collections.sort(heightlist);
	        int maxHeight = heightlist.get(heightlist.size()-1);
	        
	        if(maxHeight < k)
	        return 0;
	        else
	        return (maxHeight-k);

	    }


}
