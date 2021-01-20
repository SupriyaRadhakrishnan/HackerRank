import java.util.*;
import java.util.stream.IntStream;

public class ACMTeam {

	public static void main(String args[]) {
		String topic[] = { "10101", "11100", "11010", "00101" };
		int result[]  = acmTeam(topic);
		System.out.println(result[0]+" " + result[1]);
	}

	static int[] acmTeam(String[] topic) {

		int numOfStudents = topic.length;
		int result[] = new int[2];
		List<String> topics = Arrays.asList(topic);
		int numOfSubjects = topic[0].length();
		Map<Integer, Integer> groups = new HashMap<>();
		IntStream.range(0, numOfSubjects + 1).forEach(i -> groups.put(i, 0));
		int maxSubjects = 0;
		int totalSub = 0;
		for (int i = 0; i < numOfStudents; i++) {
			for (int j = i + 1; j < numOfStudents; j++) {
				totalSub = calculate(topic[i], topic[j], numOfSubjects);
				maxSubjects = Math.max(totalSub, maxSubjects);
				groups.put(totalSub, groups.get(totalSub) + 1);
			}
		}

		result[0] = maxSubjects;
		result[1] = groups.get(maxSubjects);
		return result;
	}

	static int calculate(String s1, String s2, int numOfSubjects) {
		int count = 0;
		for (int i = 0; i < numOfSubjects; i++) {
			if ((s1.charAt(i) == '1' && s2.charAt(i) == '0') || (s1.charAt(i) == '0' && s2.charAt(i) == '1')
					|| (s1.charAt(i) == '1' && s2.charAt(i) == '1'))
				count++;
		}
		return count;
	}
}
