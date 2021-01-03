
public class PrimeNumbers {

	public static void main(String args[])
	{
		System.out.println(primality(7));
	}
	 static String primality(int n) {
	        int endindex = n/2;
	        String str = "";
	       
	        if(n==2)
	        	 return "Prime";
	        if(n==1 && n<0)
	        	 return "Not prime";
	        for(int i=2;i<=endindex;i++)
	        {
	            if(n%i==0)
	            {
	                return "Not prime";
	            }
	            else
	            str = "Prime";
	        }
	       
	        return str;
	    }
}
