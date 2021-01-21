import java.util.*;

public class Encryption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(encryption("If man was meant to stay on the gorund god would have given us roots"));
		System.out.println(encryption("haveaniceday"));
		System.out.println(encryption("feedthedog"));
		System.out.println(encryption("chillout"));
		
	}
	
	 static String encryption(String s) {
		 
		List<String> str = new ArrayList<>();  
		String output = ""; 
        s = s.replaceAll(" ", "");
        int length = s.length();
        double sqroot = Math.sqrt(length);
        int rows  = (int) Math.floor(sqroot);
        int cols = (int) Math.ceil(sqroot);
        if(rows*cols < length)
        	rows = cols;
//        System.out.println(rows + " " + cols);
        int k =0;
        for(int i=0;i<rows && k < length ;i++)
        {
        	for(int j=0;j<cols && k < length ;j++)
        	{
        		output += s.charAt(k);
        		k++;
        	}
        	str.add(output);
        	output ="";
        }
        output ="";
        for(int i=0;i<cols;i++)
        {
        	for(String str1 : str)
        	{
        		if(str1.length()>i)
        		output += str1.charAt(i);
        	}
        	output += " ";
        }
//          System.out.println(s);
          return output;
	    }

}
