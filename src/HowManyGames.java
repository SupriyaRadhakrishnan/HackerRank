
public class HowManyGames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(howManyGames(20, 3, 6, 85));

	}

	static int howManyGames(int p, int d, int m, int s) {

		int count = 0;
		 while(s>=p){
	            count++;
	            s -=p;
	            p = Math.max(p-d,m);
	        }
	        return count;
	}
}
