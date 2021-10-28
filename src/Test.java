
public class Test {
	
	public static void main(String args[])
	{
	
		int line_count = 1;
		int curr_star =0;
		for(line_count =1 ; line_count <=5 ;)
		{
			if(curr_star < line_count)
			{
				System.out.print("* ");
				curr_star++;
			}
			if(curr_star == line_count)
			{
				System.out.println();
				line_count++;
				curr_star = 0;
				
			}
			
		}
		
	}

}
