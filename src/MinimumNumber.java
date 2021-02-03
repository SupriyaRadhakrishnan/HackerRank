
public class MinimumNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(minimumNumber(3,"9#A"));
	}

	static int minimumNumber(int n, String password) {

		int count = 0;

       int diff = Math.abs(n-6);
		
			if (!password.matches(".*[a-z].*")) {
				count++;
			}

			if (!password.matches(".*[A-Z].*")) {
				count++;
			}

			if (!password.matches(".*[0-9].*")) {
				count++;
			}

			if (!password.matches(".*[-!@#$%^&*()+]+.*")) {
				count++;

			}
	   
		if(diff > 0 && count <= diff)
			return diff;
		else
		return count;
	}

}
