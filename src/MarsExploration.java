
public class MarsExploration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(marsExploration("SOTSMNSOS"));
	}
	
	 static int marsExploration(String s) {

		 int fieldsChanged = 0;
		 		
		 
		 for(int i=0;i<s.length();i=i+3)
		 {
			 if(s.charAt(i) != 'S')
				 fieldsChanged++;
			 if(s.charAt(i+1) != 'O')
				 fieldsChanged++;
			 if(s.charAt(i+2) != 'S')
				 fieldsChanged++;
			 
		 }
		 return fieldsChanged;

	    }


}
