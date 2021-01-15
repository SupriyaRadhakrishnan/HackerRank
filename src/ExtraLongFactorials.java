import java.math.BigInteger;

public class ExtraLongFactorials {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		extraLongFactorials(30);
	}

	static void extraLongFactorials(int n) {

		BigInteger factorial = BigInteger.valueOf(1);//typecasting 
		while (n > 0) {
			factorial = factorial.multiply(BigInteger.valueOf(n));
			n--;
		}
		System.out.println(factorial);
	}

}
