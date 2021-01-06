
public class MagicSquare {

	
	
	public static void main(String args[])
	{
		int s[][] = {{5,3,4},{1,5,8},{6,4,2}};
		System.out.println(formingMagicSquare(s));
	}
/*
 * Calculate the Magic Square:
 * Refer
 * https://www.wikihow.com/Solve-a-Magic-Square#:~:text=So%2C%20if%20you%20have%20a,8%20of%20the%20top%20row.&text=Fill%20in%20the%20remaining%20numbers,3%2C%204%2C%20etc.)
 * 
 */
	static int formingMagicSquare(int[][] s) {
		 int cost = Integer.MAX_VALUE;
	        int t[][] = 
	                    { //Note:for 3*3 , 5 is the center element,four corners are always even numbers.rest are filled to get a sum of 15
	                        {4,9,2,3,5,7,8,1,6},
	                        {4,3,8,9,5,1,2,7,6},
	                        {2,9,4,7,5,3,6,1,8},
	                        {2,7,6,9,5,1,4,3,8},
	                        {8,1,6,3,5,7,4,9,2},
	                        {8,3,4,1,5,9,6,7,2},
	                        {6,7,2,1,5,9,8,3,4},
	                        {6,1,8,7,5,3,2,9,4},
	                    };
	        int temp = 0;
	        for(int i=0;i<8;i++){
	            temp = Math.abs(s[0][0]-t[i][0]) + Math.abs(s[0][1]-t[i][1]) +Math.abs(s[0][2]-t[i][2]) +
	            	   Math.abs(s[1][0]-t[i][3]) + Math.abs(s[1][1]-t[i][4]) + Math.abs(s[1][2]-t[i][5])+
	            	   Math.abs(s[2][0]-t[i][6]) + Math.abs(s[2][1]-t[i][7]) + Math.abs(s[2][2]-t[i][8]);
	            		
	            cost = temp<cost?temp:cost;//Conditional operator, if temp <cost, temp is assigned else cost is assigned.
	        }
	        return cost;    
    }
}


