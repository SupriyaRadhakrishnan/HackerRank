
public class ViralAdvertising {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(viralAdvertising(3));
	}
	
	 static int viralAdvertising(int n) {
		 
		    int shared = 5;
		    int liked = 2;
		    int totalLikes = 2;
		    for(int i=2 ;i<=n;i++)
		    {
			  //System.out.println(shared +" "+liked+" "+totalLikes);
			  shared = (liked*3); 
		      liked = (int) Math.floor(shared/2);
		      totalLikes += liked; 

		    }
		    return totalLikes;
		    }

}
