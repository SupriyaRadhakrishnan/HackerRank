
public class TaumBday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(taumBday(10,10,1,1,1));
		System.out.println(taumBday(5,9,2,3,4));
		System.out.println(taumBday(3,6,9,1,1));
		System.out.println(taumBday(7,7,4,2,1));
		System.out.println(taumBday(3,3,1,9,2));
		
		
	}
	
	
	  public static long taumBday(int b, int w, int bc, int wc, int z) {
		    // Write your code here
		  long x = bc;
		  long y= wc;
		  long zz = z ;
		  long B = b;
		  long W = w;
		  
		  if(x>y)
		  {
			  if(x>y+zz)
				  x=y+zz;
		  }
		  if(y>x)
		  {
			  if(y>x+zz)
				  y=x+zz;
		  }
		  	  
		  return ((x*B) + (y*W));
	  }
}
