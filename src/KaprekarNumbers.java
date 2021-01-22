
public class KaprekarNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		kaprekarNumbers(1 ,999999);
	}
	
	 static void kaprekarNumbers(int p, int q) {
    
		 boolean flag = false;
		 String output = "";
		 for(int i=p;i<=q;i++)
		 {
			 int numOfDigits = String.valueOf(i).length();
			 long square = (long)i*i;
			 String l="";
			 String r = "";
			 String s = String.valueOf(square);
			 if((s.length()-numOfDigits) > -1 && (s.length()-numOfDigits) <= s.length())
			 {
			 l = s.substring(0,(s.length()-numOfDigits));
			 r = s.substring(s.length()-numOfDigits);
			 }
			 
			 if(i==1)
			 {
				output += i+ " ";;
				 flag = true;
			 }
			 else if(s.length() == numOfDigits && i==Integer.valueOf(s))
			 {
				 output += i+ " ";;
				
				 flag = true;
			 }
			 else if((!(r.isEmpty()) && !(l.isEmpty())) && (Integer.valueOf(l) + Integer.valueOf(r) == i))
			 {
				 output += i+ " ";;
			
				 flag = true;
			 }
			 else if(r.isEmpty() && !(l.isEmpty()) && Integer.valueOf(l) == i)
			 {
				 output += i+ " ";;
				
				 flag = true;
			 }
			 else if(l.isEmpty() && !(r.isEmpty()) && Integer.valueOf(r) == i)
			 {
				 output += i + " ";
				
				 flag = true;
			 }
		 }
		 if(!flag)
			 System.out.println("INVALID RANGE");
		 else
			 System.out.println(output.substring(0,output.length()-1));
	    }
}
