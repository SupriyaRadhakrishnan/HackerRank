import java.util.*;

public class OrganizingContainers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int container[][] = {{1,3,1},{2,1,2},{3,3,3}};
        System.out.println(organizingContainers(container));
        int container1[][] = {{0,2,1},{1,1,1},{2,0,0}};
        System.out.println(organizingContainers(container1));
         
	}
	
	 static String organizingContainers(int[][] container) {
         
		 int[] ballscount = new int[container[0].length];
		 int[] containers = new int[container[0].length];
		 
		 for(int i=0;i<container.length;i++)
		 {
			 for(int j=0;j<container.length;j++)
			 {
				 containers[i] += container[i][j];
				 ballscount[j] +=container[i][j]; 
			 }
		 }

		    Arrays.sort(ballscount);
		    Arrays.sort(containers);


		    if(Arrays.equals(ballscount, containers)){
		        return "Possible";
		    }else{
		        return "Impossible";
		    }
		 
		 
	    }

}
