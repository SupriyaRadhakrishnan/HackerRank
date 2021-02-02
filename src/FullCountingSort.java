import java.util.*;

public class FullCountingSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s[] = { "1 e", "2 a", "1 b", "3 a", "4 f", "1 f", "2 a", "1 e", "1 b", "1 c"};
		List<String> sList = Arrays.asList(s);
		List<List<String>> arr = new ArrayList<>();
		arr.add(sList);
		countSort(arr);
	}

	static void countSort(List<List<String>> arr) {

		
		 int max = 0;
	        String[] s = new String[arr.size()];
	        //System.out.println("length"  + arr.size());
	        for (int j = 0; j < arr.size(); j++) {
	                String[] str = new String[2];
	                str[0] = arr.get(j).get(0);
	                str[1] = arr.get(j).get(1);
	                   
	                max = Math.max(max, Integer.parseInt(str[0]));
	                if (j < arr.size() / 2)
	                    str[1] = "-";
	             //  System.out.println(str[0] + " " + str[1]);     
	                s[j] = str[0] + " " + str[1];
	            }

	            // for (int k = 0; k < s.length; k++)
	            //     System.out.println(s[k]);

	        int a[] = new int[max + 1];

	            for (int l = 0; l < s.length; l++) {
	                String[] str = s[l].split(" ");
	                a[Integer.parseInt(str[0])] += 1;
	            }

	            for (int m = 0; m < a.length; m++) {
	                for (int n = 0; n < s.length; n++) {
	                    String[] str = s[n].split(" ");
	                    if (m == Integer.parseInt(str[0])) {
	                        System.out.print(str[1]);
	                         System.out.print(" ");
	                    }

	                }

	            }
	    }


}
