package algorithmStudy.programmers.baedal_tech;

import java.util.Arrays;

public class P1 {
    public static int[] solution(int money) {
        int[] answer = new int[9];
        int[] unit = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 1};

        int i = 0;
        while (money >= 10) {
            int n = 0;
            if ((n = money / unit[i]) > 0) {
                answer[i] = n;
                money %= unit[i];
            }

            i++;
        }

        answer[i] = money;

        return answer;
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(solution(50237)));
        System.out.println(Arrays.toString(solution(15010)));
    }
}
