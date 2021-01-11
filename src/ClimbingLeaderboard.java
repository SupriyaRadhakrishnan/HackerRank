import java.util.*;
import java.util.stream.Collectors;

public class ClimbingLeaderboard {

	public static void main(String[] args) {
		List<Integer> ranked = Arrays.asList(100, 90, 90, 80, 75, 60);
		List<Integer> player = Arrays.asList(50, 65, 77,90, 102);
		List<Integer> playerPosition = climbingLeaderboard(ranked, player);

		for (int playpos : playerPosition) {
			System.out.println(playpos);
		}
	}

	public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
		List<Integer> ranks = ranked.stream().distinct().collect(Collectors.toList());
		List<Integer> playerPosition = new ArrayList<>();
		int startIndex = ranks.size() - 1;
		for (int play : player) {

			for (int i = startIndex; i >= 0; i--) {
				if (i == 0 && play > ranks.get(i)) {
					playerPosition.add(1);
					startIndex = i;
					i = -1;

				} else if (play == ranks.get(i)) {
					playerPosition.add(i + 1);
					startIndex = i;
					i = -1;
				} else if (i == ranks.size() - 1 && play < ranks.get(i)) {
					playerPosition.add(i + 2);
					startIndex = i;
					i = -1;
				}
			   else if ((i + 1) < ranks.size() && play < ranks.get(i) && play > ranks.get(i + 1)) {
						playerPosition.add(i + 2);
						startIndex = i;
						i = -1;
			}

		}
		}
		return playerPosition;
	}
}
	
