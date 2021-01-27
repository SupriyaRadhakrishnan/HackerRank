import java.util.*;
import java.util.Collections;

public class HappyLadybugs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	System.out.println(happyLadybugs("Y_EOYRTYOREOTYREY_YRYYO"));
//	System.out.println(happyLadybugs("GGG_UK_KM_GMU__AXJ__GJAKG__MKXGK_UJ_G___KGKGUM_GUK__X_GGU"));
//	System.out.println(happyLadybugs("QRRTXMGJLVL__VN_____XRVJ_LLXXLTXR__JNJXX_G_GNMN_V"));
	System.out.println(happyLadybugs("LS_FNQQINWRZOWBWBNIORI_ZLNNSZISIWNFOFSFFLOWIBZRWFX"));
//	System.out.println(happyLadybugs("SOA_KHEW_KOA_KAS_W_AWWSSOWAO_"));
//	System.out.println(happyLadybugs("_ZC_BOXWELEFANBFI_CCLSZTKQWUC_CILEZCBZWNWZEECO__EWCLLXCFNWELQFBFSNFONCIE_QCZBCTEQXBTTBBXB"));
//	System.out.println(happyLadybugs("MFSYBHHYMYBBMXHXFYYM"));
//	System.out.println(happyLadybugs("NWSJRWUIEIUNWSIRJNIWNLRLIIS"));
//	System.out.println(happyLadybugs("YITUSDK_STDESSKKUYI_ITYKT_"));
//	System.out.println(happyLadybugs("FYNGP_JPO_JVLWUCTGHA_W_KP_VO_WHGGP_OGJJ_FAHNT_JWWYPPCQGNYPP_P_UC_TOA_GJWJHP"));
//	
     
		
//    System.out.println(happyLadybugs("GR"));
//    System.out.println(happyLadybugs("_GR_"));
//    System.out.println(happyLadybugs("_R_G_"));
//    System.out.println(happyLadybugs("R_R_R"));
//	System.out.println(happyLadybugs("RRGGBBXX"));
//	System.out.println(happyLadybugs("RRGGBBXY"));
//	

	}

	static String happyLadybugs(String b) {

		boolean flag = false;
		char[] chars = b.toCharArray();
		List<Character> listC = new ArrayList<Character>();
		for (char c : chars) {
			listC.add(c);
		}

		
		if(b.length() == 1 && !b.equals("_"))
			return "NO";
		
		if (Collections.frequency(listC, '_') == listC.size())
			return "YES";

		else if (Collections.frequency(listC, '_') == 0) {
			for (int i = 0; i < b.length(); i++) {

				
				if (i == 0 && b.charAt(i) == b.charAt(i + 1)) {
					flag = true;
				}

				else if (i == b.length() - 1 && b.charAt(i) == b.charAt(i - 1)) {
                     flag = true;
				}
				else if ((i != 0 && i != b.length() - 1)
						&& (b.charAt(i) == b.charAt(i - 1) || b.charAt(i) == b.charAt(i + 1)))

				{
					flag = true;
				} else
					return "NO";
			}
		} else {
			for (int i = 0; i < b.length(); i++) {

				if (b.charAt(i) != '_' && Collections.frequency(listC, b.charAt(i)) == 1)
					return "NO";

			}
			return "YES";
		}
		if (flag == false)
			return "NO";
		else
			return "YES";
	}
	
}
