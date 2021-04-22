
public class TowerBreakers {

	public static void main(String[] args) {
		
		System.out.println(towerBreakers(2,2));
		System.out.println(towerBreakers(1,4));
		System.out.println(towerBreakers(2,6));
	}
	 static int towerBreakers(int n, int m) {
	      
	      if(m==1 || n%2==0)
	        return 2;
	     else
	        return 1;    

	    }

}
