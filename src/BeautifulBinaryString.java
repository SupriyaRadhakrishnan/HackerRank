
public class BeautifulBinaryString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(beautifulBinaryString("0101010"));
	}

	static int beautifulBinaryString(String b) {

		int switches = 0;

		for (int i = 0; i < b.length() - 2;i++) {

			System.out.println(b.substring(i, i + 3));
			if (b.substring(i, i + 3).equals("010"))
			{
				switches++;
				i=i+2;
			}
		}

		return switches;
	}

}
