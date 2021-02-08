
public class StringConstruction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(stringConstruction("gbcebabbfffcdgfeeaadecaeecabbabbgcafeabgecfeffcbafgdegdacefcadabbfdcgcebegbfgeeebfegfacdagbbgeagaaceefcaedceacceebdgebeecedcbdbeebecgcfcgdaaaegfbcbfffccffabbceafaagdedadbfcaedaffbaggebfedegfabefafefgdbafedbggabccaedabfgfgggbcfgeggdcdfeebaedaaccefgegbffaaggdcbbbfdbgaaffbbgcfafccdgcaabccbfbgbabegddagcgfbcdfdaccegbabfedbbdaddebddgegedgaabebfeeggddagaeececcafdgddceddcbdagaecceacgfabgccecgecgcefaafcaedfccdeeceffefadeffefggaeggbbfgcacgfaeefbfbccggcbcgeagcaacdcbegcdaacdgbebdaabddeagafbfagfebfefffcbcgefbcfeggafccabfagegccefe"));
//		System.out.println(stringConstruction("ckbjbibcbdhhkkfkgfkjbdebggcbhjkbeedbehdggegkjikhgibiieafdkiichaifbjfheijadadicacjbhehhgegghbkdkiedafjdddgekdeahgdjebjhkhbcjdfddggkdhjjgaajbihbkgggjcfaejkgdihkhdhdcaaddhddkdkcejehdaieaiciicaabkaahbjjbjegdbefkkkadjgaiegehedjdfebkhebacaaaafhgcfehfhkdkhgjffkgkfahikdkaagchkggjcheejecdcjbkdkhaeiiijadbc"));
		System.out.println(stringConstruction("khtlbbtscplpugrqlufncvqdankrnduiiqlnosogntpghusnduqpuohhivathehdmurhvlgiefhqffpiajuphsdvhnfrhjaubjeukaihnkobkgbgipdqhkiognhspamaohbctedngrhnleuvapumikfuhbpnjgnvuvuuihrnisctqbogrjtuselhfqkhrflstqqvfncvjvejbvbsmpgqbspopvctdvbvmqeqidseefmiepktqnebufmdqomednrcegggolqebjamhjskgfgbfqatpinhbatsqpbkr"));
//		System.out.println(stringConstruction("echgafgdgbchihdkhejfidahajdijjjkdihahhgifakecfiibkgdbgbikciffbegefkbcddijkiegcgbijiffikchgkcbifeekhfdhihfeiaceckdahgcddekaffcbeddaacgcjhcggiaebkdejgaieffjcedaedjdijaeegaghbdijbhedjecjcdcicdkcebbgakkkfahiafbejchgijgjcbebfiiekeehffaefdckidedfcafejekhccjedcehjheiiaihcggiffekjaigcdfjbhggggijkdkgeagcigfbaffciikkkhfaabjefhhcefiidcijjgbidjchbaeegfgaaejffjibedbeaifeejkchjdiaejbeibiiieggkfcgkcgjicbagjdgggbcjfbdhiabajkdafigcaj"));
//		System.out.println(stringConstruction("acacacabcbbccacadcabcbadcbdddbbcbcadbbccadbdaddaaadaddbdbabbaadbcdaccaddccbbcbbaddcabcadbaaddbdaabcdcbabaacbccbbabcccdbdabacccdacbcbabacabcdadcbcdccd"));
		
	}

	static int stringConstruction(String s) {

		String p = "";
		int cost = 0;

		for (int i = 0; i < s.length(); i++) {
			String temp ="";
			if (i == 0) {
				p += s.charAt(i);
				cost++;
			} else {
				if (p.contains(String.valueOf(s.charAt(i)))) {
					boolean flag = true;
					int j = i + 1;
					while (flag) {
						if (p.contains(s.substring(i, j)))
						{
							temp = s.substring(i, j);
							j++;
						}
						else {
							i = j-1;
							flag = false;
						}
						if (j > s.length())
							flag = false;
					}
					p += temp;
				}

				else {
					p += s.charAt(i);
					cost++;
				}

			}
		}
		return cost;
	}

}
