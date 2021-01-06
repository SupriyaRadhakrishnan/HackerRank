
public class PageCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(pageCount(10,5));
	}

	static int pageCount(int n, int p) {

		   int pageTurns = (int) Math.floor(p / 2);//Each page requires half its number of turns 
		   System.out.println(pageTurns); 
		   int totalTurns = (int) Math.floor(n / 2); //get total number of turns
		   System.out.println(totalTurns);
		    return Math.min(pageTurns, totalTurns - pageTurns); 
		   //totalTurns - pageTurns helps in finding if the page number is in first half or the second half of the book.
	}
}
