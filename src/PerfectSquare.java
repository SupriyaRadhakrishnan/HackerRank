
public class PerfectSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(squares(3,9));
	}
	
	  static int squares(int a, int b) {
		  
//ceil() - rounds up to the greater int while floor() rounds up to the smallest int
return ((int) Math.floor(Math.sqrt(b)) - (int) Math.ceil(Math.sqrt(a)) + 1);

//	        int count =0;
//	        for(int i=a;i<=b;i++)
//	        {
//	            double sq = Math.sqrt(i);
//	            if(sq-Math.floor(sq)==0)
//	            count++;
//	        }
	    
	  }
}


