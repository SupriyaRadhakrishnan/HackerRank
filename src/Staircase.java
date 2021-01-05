
public class Staircase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		staircase(6);
	}

	static void staircase(int n) {
		int endindex = n - 1;
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j < (endindex - i))
					System.out.print(" ");
				else
					System.out.print("#");
			}
			System.out.println();
		}
	}
}
