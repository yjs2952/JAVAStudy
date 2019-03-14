package algorithmStudy.company.kakaopage.p2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P1 {

    public static long maxSubArray(long[] nums) {
        /*long answer = Integer.MIN_VALUE;
        long[][] cache = new long[2][nums.length];

        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (i == 0) {
                    cache[0][j] = nums[j];
                    answer = Math.max(answer, cache[0][j]);
                } else if (i % 2 == 0) {
                    cache[0][j] = cache[1][j - 1] + nums[j];
                    answer = Math.max(answer, cache[0][j]);
                } else {
                    cache[1][j] = cache[0][j - 1] + nums[j];
                    answer = Math.max(answer, cache[1][j]);
                }
            }
        }
        return answer;*/

        long sum = 0, max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++)  {
            if (sum < 0) {
                sum = nums[i];
            } else {
                sum += nums[i];
            }
            max = Math.max(max, sum);
        }
        return max;
    }

    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] strArr = null;

        if (input.contains(",")) {
            strArr = input.split(", ");
        } else {
            strArr = input.split(" ");
        }

        long[] numArr = new long[strArr.length];

        for (int i = 0; i < strArr.length; i++) {
            numArr[i] = Long.parseLong(strArr[i]);
        }

        System.out.println(maxSubArray(numArr));
    }
}
