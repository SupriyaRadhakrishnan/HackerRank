import java.util.Arrays;

public class MaxOr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] arr = {5,1,7,4,3};
		int[] queries = {2,0};
//		int[] maxxor= maxXor(arr,queries);
//		for(int i=0;i<maxxor.length;i++)
//		{
//			System.out.println(maxxor[i]);
//		}
		
		System.out.println(Integer.toBinaryString(2));
		System.out.println();
		for(int i = Integer.SIZE - 1; i >= 0; --i)
		{
			System.out.print((2 >> i) & 1);
		}
		for(int i = Integer.SIZE - 1; i >= 0; --i)
		{
			System.out.print((2 >> i) & 1);
		}
		
	}
	//Using trie Datastructure gives the solution for O(n).
	static int[] maxXor(int[] arr, int[] queries) {
	    class IntegerTrie {
	        class Bit {
	            private Bit zero;
	            private Bit one;
	        }

	        private Bit root = new Bit();

	        public void insert(int value) {
	            Bit current = root;
	            for (int i = Integer.SIZE - 1; i >= 0; --i)
	                switch ((value >> i) & 1) {
	                    case 0:
	                        if (current.zero == null)
	                            current.zero = new Bit();
	                        current = current.zero;
	                        break;

	                    case 1:
	                        if (current.one == null)
	                            current.one = new Bit();
	                        current = current.one;
	                        break;

	                    default:
	                        throw new UnknownError();
	                }
	        }

	        public int maxXor(int value) {
	            int maxXor = 0;
	            Bit current = root;
	           System.out.println(current);
	            for (int i = Integer.SIZE - 1; i >= 0; --i)
	                switch ((value >> i) & 1) {
	                    case 0:
	                        if (current.one == null)
	                            current = current.zero;
	                        else {
	                            current = current.one;
	                            maxXor += Math.pow(2, i);
	                        }
	                        break;

	                    case 1:
	                        if (current.zero == null)
	                            current = current.one;
	                        else {
	                            current = current.zero;
	                            maxXor += Math.pow(2, i);
	                        }
	                        break;

	                    default:
	                        throw new UnknownError();
	                }
	            return maxXor;
	        }
	    }

	    IntegerTrie trie = new IntegerTrie();
	    for (int value : arr)
	        trie.insert(value); 
	  
	    
	    int[] result = new int[queries.length];
	    int index = 0;
	    for (int query : queries)
	        result[index++] = trie.maxXor(query);
	    return result;
	}
	/*
	 * This one does not work for o(n)
	 */
//	 static int[] maxXor(int[] arr, int[] queries) {
//	   
//		 int maxxor[] =  new int[queries.length];
//		 int k =-1;	
//		 int binaryresult =0;
//	     for(int i=0;i<queries.length;i++)
//		 {
//	    	 int currentmax =0;
//	    	 for(int j=0;j<arr.length;j++)
//			 {  		     		 
//	    		binaryresult = (arr[j] ^ queries[i]) ;
//	    		currentmax = Math.max(binaryresult, currentmax);
//			 }
//	    	 k++;
//	    	 maxxor[k] = currentmax; 
//		 }
//		 return maxxor;
//	    }
}


