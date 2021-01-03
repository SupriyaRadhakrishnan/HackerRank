
public class FlippingBits {
	public static void main(String args[])
	{
		System.out.println(flippingBits(2));
	}
	
	   static long flippingBits(long n) {
		   
		   String s = "";
		   long sum=0;

           s = Long.toBinaryString(n);
		   System.out.println(s);
		   while(s.length() != 32)
               s = "0" + s;
		   System.out.println(s);
		   s = s.replaceAll("0","#");
           s = s.replaceAll("1","0");
           s = s.replaceAll("#","1");
           sum  = Long.parseLong(s,2);
           return sum;
	    }

}
