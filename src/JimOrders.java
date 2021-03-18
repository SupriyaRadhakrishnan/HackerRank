import java.util.*;


public class JimOrders {

	public static void main(String[] args) {

	int orders[][] = {{8,1},{4,2},{5,6},{3,1},{4,3}};
		
 	
	int[] serviceOrder = jimOrders(orders);
	for(int i=0;i<serviceOrder.length;i++)
	 {
		 System.out.print(serviceOrder[i]);
	 }
System.out.println();


int orders2[][] = {{1,1},{1,1}};

	 serviceOrder = jimOrders(orders2);
for(int i=0;i<serviceOrder.length;i++)
 {
	 System.out.print(serviceOrder[i]);
 }
System.out.println();


		int orders1[][] = {{122470,725261},
		{193218,693005},
		{355776,603340},
		{830347,284246},
		{974815,823134},
		{251206,572501},
		{55509,927152},
		{299590,651593},
		{222305,641645},
		{984018,463771},
		{494787,286091},
		{217190,833029},
		{820867,380896},
		{744986,630663},
		{875880,667},
		{449199,520904},
		{924615,511326},
		{862614,890277},
		{959638,373599},
		{685864,923011},
		{922324,407528},
		{157354,943714},
		{380643,714960},
		{269853,608576},
		{290422,195768}};

		serviceOrder = jimOrders(orders1);
		for (int i = 0; i < serviceOrder.length; i++) {
			System.out.print(serviceOrder[i] + ",");
		}

	}

	static int[] jimOrders(int[][] orders) {
		
		List<Integer> indices = new ArrayList<>();
		int customers[] = new int[orders.length]; 
		int UnOrderedServiceTime[] = new int[orders.length];
		int orderedServiceTime[] = new int[orders.length];
		for(int i=0;i<orders.length;i++)
		{
			UnOrderedServiceTime[i] = orders[i][0]+orders[i][1];
			orderedServiceTime[i]  = orders[i][0]+orders[i][1];
		}
		
		Arrays.sort(orderedServiceTime);
		
		for(int i=0;i<orderedServiceTime.length;i++)
		{
			for(int j=0;j<UnOrderedServiceTime.length;j++)
			{
				if(orderedServiceTime[i] == UnOrderedServiceTime[j] && (!indices.contains(j+1))) {
					customers[i] = j+1; 
					indices.add(j+1);
					break;
				}
				
			}
		}
		return customers;
	}
}



