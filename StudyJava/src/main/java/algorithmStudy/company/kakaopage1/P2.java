package algorithmStudy.company.kakaopage1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P2 {

    public static final int[] arr = new int[1000000];

    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] answer = new int[n];

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            for (int j = 1; j <= 60; j++) {
                int tmpfib = fib(j);
                if (tmpfib > num) {
                    answer[i] = tmpfib;
                    break;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println(answer[i]);
        }
    }

    /*
    public static int fib(int n) {
        if (n <= 1) return n;
        return fib(n - 1) + fib(n - 2);
      }
     */

    private static int fib(int n) {
        if (n <= 1) return n;

        if (arr[n] != 0){
            return arr[n];
        }else {
            arr[n] = fib(n - 1) + fib(n - 2);
            return arr[n];
        }
    }
}
