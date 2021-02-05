
public class FunnyString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 System.out.println(funnyString("bcxz"));
	}
	
	 static String funnyString(String s) {

       int actual[] = new int[s.length()];
       int reverse[] = new int[s.length()];
       StringBuilder sb = new StringBuilder();
       sb.append(s);
       
       for(int i=0;i<sb.length();i++)
       {
    	   actual[i] = sb.charAt(i);
    	   sb.reverse();
    	   reverse[i] = sb.charAt(i);
    	   sb.reverse();
       }
       for(int j=0;j<actual.length-1;j++)
       {
  
    	   if(Math.abs(actual[j]-actual[j+1]) != Math.abs(reverse[j]-reverse[j+1]))
    		   return "Not Funny";
       }
       return "Funny";
       
	    }

}
