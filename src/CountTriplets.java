import java.util.*;

public class CountTriplets {

	public static void main(String[] args) {

		List<Long> arr = new ArrayList<>();
		arr.add((long) 1);
		arr.add((long) 3);
		arr.add((long) 9);
		arr.add((long) 9);
		arr.add((long) 27);
		arr.add((long) 81);

		System.out.println(countTriplets(arr, 3));

		List<Long> arr1 = new ArrayList<>();
		arr1.add((long) 1);
		arr1.add((long) 5);
		arr1.add((long) 5);
		arr1.add((long) 25);
		arr1.add((long) 125);
		System.out.println(countTriplets(arr1, 5));

		List<Long> arr2 = new ArrayList<>();
		arr2.add((long) 1);
		arr2.add((long) 2);
		arr2.add((long) 2);
		arr2.add((long) 4);
		System.out.println(countTriplets(arr2, 2));

	}

	static long countTriplets(List<Long> arr, long r) {

		long count = 0;
		//Map<Integer, Long> arrMap = new HashMap<Integer, Long>();
		List<Long> reminderList = new ArrayList<>();
		Map<Integer, Integer> reminderMap = new HashMap<Integer, Integer>();
		
		for(int i =0;i<arr.size();i++)
		{
			reminderMap.put(i, 0);
		}
		for (int i = 0; i < arr.size(); i++) {
			Long val = arr.get(i) / r;

			if (arr.get(i) % r == 0) {
				reminderMap.put(i, reminderMap.get(i) +1);
				//arrMap.put(i, val);
				reminderList.add(val);
			} else {
				//arrMap.put(i, (long) 0);
				reminderList.add((long) 0);
			}
		}

		
		
		for (int j = 0; j < reminderList.size(); j++) {
          
		}
        

		return count;

	}

	static long istriplet(List<Long> reminderList, int i, long val) {

		long count = 0;
		for (int j = i + 1; j < reminderList.size(); j++) {
			if (reminderList.get(j) == val)
				count++;

		}

		return count;
	}

}

/*
 * long count = 0;
		Map<Integer, Long> arrMap = new HashMap<Integer, Long>();
		List<Long> reminderList = new ArrayList<>();

		for (int i = 0; i < arr.size(); i++) {
			Long val = arr.get(i) / r;

			if (arr.get(i) % r == 0) {
				arrMap.put(i, val);
				reminderList.add(val);
			} else {
				arrMap.put(i, (long) 0);
				reminderList.add((long) 0);
			}
		}

		int j = 0;
		for (Map.Entry<Integer, Long> entry : arrMap.entrySet()) {

			if (entry.getValue() >= 0) {
				long secondTriplet = entry.getValue() * r;
				if (entry.getValue().equals((long) 0)) {
					secondTriplet = 1;
				}
				for (int i = 0; i < reminderList.size(); i++) {
					if (i > j && (reminderList.get(i).equals(secondTriplet))) {
						long istriplet = istriplet(reminderList, i, secondTriplet * r);
						if (istriplet > 0) {
							count += istriplet;
						}
					}
				}
				j++;
			}
		}

		return count;

	}

	static long istriplet(List<Long> reminderList, int i, long val) {

		long count = 0;
		for (int j = i + 1; j < reminderList.size(); j++) {
			if (reminderList.get(j) == val)
				count++;

		}

		return count;
 */
