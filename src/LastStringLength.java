
public class LastStringLength {

	public static void main(String[] args) {


		String a = "The Sky is blue";
		  int len = 0;
		 
	        String x = a.trim();
	        System.out.println(x);
	 
	        for (int i = x.length()-1; i > 0; i--) {
	            if (x.charAt(i) == ' ')
	                i = 0;
	            else
	                len++;
	        }
	 
	       System.out.println(len);
	     
	  
	    	}

	
}
