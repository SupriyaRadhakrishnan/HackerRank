
public class StrangeCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(strangeCounter(13));
	}

	// errored for time limit
	static long strangeCounter(long t) {

		int time = 2;
//
//		while (true) {
//			t -= time;
//			if (t <= 0) {
//				t += time;
//				return time - t + 1;
//			}
//
//			time *= 2;
//		}
           // works for all testcases 
		while(3 * (time - 1) < t) time = 2*time;
		return ((3 * (time - 1) - t + 1));
	}

}
