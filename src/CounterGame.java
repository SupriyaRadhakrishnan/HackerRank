import java.math.BigInteger;

public class CounterGame {

	public static void main(String[] args) {

		 System.out.println(counterGame(1560834904));
		System.out.println(counterGame(1768820483));
		System.out.println(counterGame(1533726144));
		System.out.println(counterGame(1620434450));
		System.out.println(counterGame(1463674015));
	    System.out.println(counterGame(132));
	}

	public static String counterGame(long n) {

		 String s ="";
		while (n-- > 0) {
            BigInteger N = BigInteger.valueOf(n);;
            N = N.subtract(BigInteger.ONE);
            if(N.bitCount() % 2 == 0)
             s = "Richard";
            else
            	s =  "Louise";
	}
		
		return s;
	}
}
