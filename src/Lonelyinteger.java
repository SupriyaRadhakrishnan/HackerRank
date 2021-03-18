import java.util.*;
import java.util.stream.Collectors;

public class Lonelyinteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	static int lonelyinteger(int[] a) {

		int val =0;
		List<Integer> aList = Arrays.stream(a).boxed().collect(Collectors.toList());
		Set<Integer> aSet = Arrays.stream(a).boxed().collect(Collectors.toSet());
		
		for(int num:aSet)
		{
			if(Collections.frequency(aList, num) == 1) {
				val = num;
				break;
			}
		}
		return val;
    }

}
