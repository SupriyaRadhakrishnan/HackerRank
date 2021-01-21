import java.util.Arrays;
//Ref :https://www.youtube.com/watch?v=BMbeeB_57Pk&ab_channel=JAVAAID-CodingInterviewPreparation
public class BiggerIsGreater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(biggerIsGreater("ab"));
		System.out.println(biggerIsGreater("bb"));
		System.out.println(biggerIsGreater("hefg"));
		System.out.println(biggerIsGreater("dhkc"));
		System.out.println(biggerIsGreater("dkhc"));
		System.out.println(biggerIsGreater("lmno"));
		System.out.println(biggerIsGreater("dcba"));
		System.out.println(biggerIsGreater("dcbb"));
		System.out.println(biggerIsGreater("abdc"));
		System.out.println(biggerIsGreater("abcd"));
		System.out.println(biggerIsGreater("fedcbabcd"));

	}
	  static String biggerIsGreater(String w) {
		  
		  char charArray[] = w.toCharArray();
          int firstSmallestChar = -1;
          int secondSmallestChar = -1;
		
		 
		int i = 0;
		for(i= w.length()-1;i>0;i--)
		{
			if(charArray[i] > charArray[i-1])
			{
				firstSmallestChar =  i-1;
				secondSmallestChar = i;
				break;
			}
		}
		if(i==0)
			return "no answer";
		else
		{
		   for(int index = i+1;index < w.length();index++)
		   {
			  if(charArray[index] < charArray[secondSmallestChar] && charArray[index] > charArray[firstSmallestChar])
				  secondSmallestChar = index;
		   }
		   
		   char temp = charArray[firstSmallestChar];
		   charArray[firstSmallestChar] = charArray[secondSmallestChar];
		   charArray[secondSmallestChar] = temp;
		   
		   Arrays.sort(charArray,i,w.length());
		  String str = new String(charArray);
		  return str;
		}
		}

}
