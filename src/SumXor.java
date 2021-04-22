
public class SumXor {

	public static void main(String[] args) {
	System.out.println(sumXor(10));
//	System.out.println(sumXor(4));
//	System.out.println(sumXor(5));
//	System.out.println(sumXor(8));

	}
	
	  static long sumXor(long n) {
		  System.out.println( Long.numberOfLeadingZeros(n));
		  System.out.println(Long.bitCount(n));
		     long result = 64 - Long.numberOfLeadingZeros(n) - Long.bitCount(n);
		        result =  (long)Math.pow(2,result);
		        return result;

		    }

}
