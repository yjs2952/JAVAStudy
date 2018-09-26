package algorithmStudy.another;

public class Solution {
    public static int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        int day = 0;
        int rday = 0;
        int index = 0;
        for (int i = 0; i < progresses.length; i++) {
            day = (int) Math.ceil((double) (100 - progresses[i]) / speeds[i]);
            if (i == 0) {
                rday = day;
            }

            if (rday >= day) {
                answer[index]++;
            } else {
                rday = day;
                answer[++index]++;
            }
        }

        return answer;
}

    public static void main(String[] args) {
        int[] progresses = {40, 93, 30, 55, 60, 65};
        int[] speed = {60, 1, 30, 5 , 10, 7};
        int[] returnArry = null;

        returnArry = solution(progresses, speed);
        for (int a : returnArry) {
            System.out.println(a);
        }
    }
}
