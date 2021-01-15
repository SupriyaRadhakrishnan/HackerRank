import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class PermutationEquation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int p[] = {4,3,5,1,2};
		 int result[] = permutationEquation(p);
		 
		 for(int i=0;i<result.length;i++)
		 {
		 System.out.println(result[i]);
		 }
	}
	
	 static int[] permutationEquation(int[] p) {
	        
		 List<Integer> pList = Arrays.stream(p).boxed().collect(Collectors.toList()); 
         int min = Collections.min(pList);
         int max = Collections.max(pList);
         System.out.println(min + " " + max);
         int result[]= new int[(max-min)+1];
         int k=0;
         for(int i=min;i<=max;i++)
         {
             int index = pList.indexOf(i)+1;
             result[k] = pList.indexOf(index)+1;
             k++;
         }
         return result;
    }

}
