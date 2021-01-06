import java.util.*;

public class BetweenTwoSets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> a = Arrays.asList(2,6);
		List<Integer> b = Arrays.asList(24,36);
		System.out.println(getTotalX(a, b));

	}

	public static int getTotalX(List<Integer> a, List<Integer> b) {
		
		    Collections.sort(a);
	        Collections.sort(b);
	        int min = a.get(0); // takes the least of the numbers in List a
	        int max = b.get(b.size()-1);// takes the max of the numbers in List b
	        int count=0;
	        for(int i=min;i<=max;i++){
	            if(hasFactors(i,a) && isFactor(i,b)){
	                count++;
	            }
	        }
	  	  return count;
	}

	/*
	 * Below method checks if each number from min to max is divisible by the elements in List a.return false.
	 */
public static boolean hasFactors(int num, List<Integer> arr){
    for(int i=0;i<arr.size();i++){
        if(num%arr.get(i)!=0){
            return false;
        }
    }
    return true;
}
/*
 * Below method checks if each number in List b is divisible by the min to max
 */
public static boolean isFactor(int num, List<Integer> arr){
    for(int i=0;i<arr.size();i++){
        if(arr.get(i)%num!=0){
            return false;
        }
    }
    return true;
}

}
