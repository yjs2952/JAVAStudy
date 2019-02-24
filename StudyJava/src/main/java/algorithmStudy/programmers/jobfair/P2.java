package algorithmStudy.programmers.jobfair;

import java.util.Arrays;

public class P2 {

    public static int solution(int[] people, int[] tshirts) {
        int answer = 0;
        int n = 0;

        Arrays.sort(people);
        Arrays.sort(tshirts);

        for (int person : people) {
            for (int j = n; j < tshirts.length; j++) {
                if (person <= tshirts[j]) {
                    answer++;
                    n = j + 1;
                    break;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{2,3}, new int[]{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2,3}));
        System.out.println(solution(new int[]{1,2,3}, new int[]{3,3}));
        System.out.println(solution(new int[]{2,2,3}, new int[]{1,1,1,1,1,1,2,3,3}));
    }
}