
public class GridSearch {

	public static void main(String[] args) {

		String G[] = { "7283455864", "6731158619", "8988242643", "3830589324", "2229505813", "5633845374", "6473530293",
				"7053106601", "0834282956", "4607924137" };
		String P[] = { "9505", "3845", "3530" };
		System.out.println(gridSearch(G, P));
	}

	static String gridSearch(String[] g, String[] p) {

		 for(int i=0;i<=(g.length-p.length);i++)
	        {
	            for(int j=0;j<=(g[0].length()-p[0].length());j++)
	            {
	                int a=i;
	                int c=0;
	                if(g[i].substring(j,j+p[0].length()).equals(p[0]))
	                {
	                    c++;
	                    for(int k=1;k<p.length;k++)
	                    {
	                        i++;   
	                        if(g[i].substring(j,j+p[0].length()).equals(p[k]))c++;
	                        else break;
	                         
	                    }
	                    if(c==p.length)return "YES";
	                }
	                i=a;
	            }
	        }
	        return "NO";

	}

}
