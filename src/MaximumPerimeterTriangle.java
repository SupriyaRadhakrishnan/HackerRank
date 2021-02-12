import java.util.*;

public class MaximumPerimeterTriangle {

	public static void main(String[] args) {


		int[] sticks = {1,1,1,2,3,5};
		
		int[] op = maximumPerimeterTriangle(sticks);
		
		for (int i = 0; i < op.length; i++)
		{
			System.out.println(op[i]);
		}
	}

	static int[] maximumPerimeterTriangle(int[] stick) {

		Arrays.sort(stick);
		int[] op = new int[3];
		int[] notDegenerative =  new int[1];
		for (int i = stick.length -1; i > 1; i--) {
			System.out.println(stick[i - 2] + " " + stick[i - 1] + " " + stick[i]);
			if (stick[i] < stick[i - 1] + stick[i - 2]) {
				
				System.out.println(stick[i - 2] + " " + stick[i - 1] + " " + stick[i]);
				op[0] = stick[i - 2];
				op[1] = stick[i - 1];
				op[2] = stick[i];
						
				return op;
			}
		}

		notDegenerative[0] = -1;
		return notDegenerative;

	}

}
