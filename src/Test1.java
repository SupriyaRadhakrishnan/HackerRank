import java.util.Stack;

public class Test1 {
	static String s = "[{}()]{}";

	public static void main(String[] args) {




System.out.println(returnMatch(s));

	}
	
public static String returnMatch(String s)
{
	char[] c = s.toCharArray();
	Stack<Character> bracks = new Stack<Character>();
	for(char m : c)
	{
		if(m == '{' || m=='[' || m=='(')
		{
			bracks.push(m);
		}
		
		else if(m == '}' || m==']' || m==')')
		{
			char firstchar = bracks.pop();
			
			if(m=='}' && firstchar != '{' || m==')' && firstchar != '(' || m==']' && firstchar != '[')
				return "Not Matching";
		}
	}
	
	return "Matching";
		}

}
