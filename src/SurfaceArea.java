
public class SurfaceArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int A[][] = { { 1, 3, 4 }, { 2, 2, 3 }, { 1, 2, 4 } };
		System.out.println(surfaceArea(A));
	}

	static int surfaceArea(int[][] a) {
		
		int area =0;
		int H = a.length,W=a.length;
		for(int i=0;i<H;i++){
			for(int j=0;j<W;j++){
				for(int k=1;k<a[i][j]+1;k++){
					//down
					if(k==1)
					area++;
					//top
					if(k==a[i][j])
					area++;
					//side 1
					if(i==0) 
					area++;
					else if(k-a[i-1][j]>0)
					area++;
					//side 2
					if(j==W-1)
					area++;
					else if(k-a[i][j+1]>0)
					area++;
					//side 3
					if(i==H-1)
					area++;
					else if(k-a[i+1][j]>0)
					area++;
					//side 4
					if(j==0)
					area++;
					else if(k-a[i][j-1]>0)
					area++;
				}
			}
		}
		return area;
	}

}
