

public class JumpingOnClouds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c[] = { 0, 1, 1, 0, 1, 0, 1, 1, 0, 1, 1, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 0, 1, 0 };
		int k = 3;
		//int s[] = {0,0,1,0,0,1,1,0}; int k=2;
		
		System.out.println(jumpingOnClouds(c, k));
	}

	static int jumpingOnClouds(int[] c, int k) {

		int energy = 100;
		boolean flag = true;
		int start = 0;
		while (flag) {
			if (start + k >= c.length) {
				start = (start + k) % c.length;
				if (start == 0) {
					flag = false;
				}
				if (c[start] == 1)
					energy = energy - 3;
				else
					energy = energy - 1;
			} else {
				start = start + k;
				if (c[start] == 1)
					energy = energy - 3;
				else
					energy = energy - 1;
				
			}
		}
		return energy;
	}
}
