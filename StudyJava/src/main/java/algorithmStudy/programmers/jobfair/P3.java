package algorithmStudy.programmers.jobfair;

import java.util.*;

public class P3 {

    public static int[] solution(int[] healths, int[][] items) {

        Arrays.sort(healths);

        int[] answer = {};

        int index = 0;
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < healths.length; i++) {
            int max = 0;

            for (int j = 0; j < items.length; j++) {
                if (items[j]!= null && healths[i] - items[j][1] >= 100) {
                    if (items[j][0] > max) {
                        max = items[j][0];
                        index = j;
                    }
                }
            }
            if (max != 0) {
                list.add(index);
                items[index] = null;
            }
        }

        list.sort(Integer::compareTo);

        answer = new int[list.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i) + 1;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{200, 120, 150}, new int[][]{{30, 100}, {500, 30}, {100, 400}})));
        System.out.println(Arrays.toString(solution(new int[]{300, 200, 500}, new int[][]{{1000, 600}, {400, 500}, {300, 100}})));
    }
}
