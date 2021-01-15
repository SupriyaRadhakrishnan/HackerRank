
public class AppendAndDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(appendAndDelete("hackerhappy","hackerrank",9));
		System.out.println(appendAndDelete("ashley","ash",2));
		System.out.println(appendAndDelete("aba","aba",7));
	}
	
	 static String appendAndDelete(String s, String t, int k) {
	        int commonStr = 0;
	        int min = Math.min(s.length(),t.length());
	        
	        for (int i=0; i<min;i++){
	            if (s.charAt(i)==t.charAt(i))
	                commonStr++;
	            else
	                break;
	        }
	        if((s.length()+t.length()-2*commonStr)>k){
	            return "No";
	        }
	        else if((s.length()+t.length()-2*commonStr)%2==k%2){
	            return "Yes";
	        }
	        else if((s.length()+t.length()-k)<0){
	            return "Yes";
	        }
	        else{
	           return "No";
	        }
	 }
}
