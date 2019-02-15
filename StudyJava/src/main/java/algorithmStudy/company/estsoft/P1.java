package algorithmStudy.company.estsoft;

import java.util.HashMap;
import java.util.Map;

public class P1 {
    public static int solution(int[] ranks) {
        int cnt = 0;
        int max = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int rank : ranks) {
            map.put(rank, map.get(rank) == null ? 1 : map.get(rank) + 1);
            max = max > rank ? max : rank;
        }

        for (int i = 0; i < max; i++) {
            if (map.get(i + 1) != null && map.get(i) != null)
                cnt += map.get(i);
        }

        return cnt;
    }

    public static void main(String[] args) {
        int ranks[] = {3, 4, 3, 0, 2, 2, 3, 0, 0};
        System.out.println(solution(ranks));
    }
}
