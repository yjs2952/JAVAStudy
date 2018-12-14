package algorithmStudy.baekjoon.dp;

import java.util.Arrays;
import java.util.Scanner;

// 백준 1463
public class Main {
    public static int N, dp[];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        dp = new int[N + 1];
        Arrays.fill(dp, -1);
        dp[0] = dp[1] = 0;
        System.out.println(solution(N));
        sc.close();
    }

    public static int solution(int pos) {
        if (dp[pos] != -1) return dp[pos];

        int i, min = 1000000;
        if (pos % 3 == 0) min = Math.min(min, solution(pos / 3));
        if (pos % 2 == 0) min = Math.min(min, solution(pos / 2));
        min = Math.min(min, solution(pos - 1));

        return dp[pos] = min + 1;
    }
}

/*
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[n + 1];

        dp[0] = dp[1] = 0;

        for (int i = 2; i <= n; i++) {
            dp[n] = dp[i - 1] + 1;
            if (i % 2 == 0) dp[i] = Math.min(dp[i], dp[i / 2] + 1);
            if (i % 3 == 0) dp[i] = Math.min(dp[i], dp[i / 3] + 1);
        }
        System.out.println(dp[n]);
        sc.close();
    }
}
*/
