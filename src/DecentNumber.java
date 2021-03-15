
public class DecentNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		decentNumber(1);
		decentNumber(3);
		decentNumber(5);
		decentNumber(11);
		
	}
	
	  static void decentNumber(int n) {

		  if (n%3==0) {
	            System.out.println(append(n,"5"));
	        } else if (n%3==1) {
	            if (n<10) {
	                System.out.println("-1");   
	            } else {
	                System.out.println(append(n-10,"5") + (append(10,"3")));
	            }
	        } else if (n%3==2) {
	            if (n<5) {
	                System.out.println("-1");   
	            } else {
	                System.out.println(append(n-5,"5") +(append(5,"3")));
	            }
		  
	    }
	  }
		
  static String append(int n,String m)
		  {
	  StringBuffer sb = new StringBuffer();
	    for (int i = 0; i < n; i++) {
	        sb.append(m);           
	    }
	    return sb.toString();
		  }
}
